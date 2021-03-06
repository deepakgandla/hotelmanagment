package com.app;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import com.app.dao.HotelDao;
import com.app.dao.impl.HotelDaoImpl;
import com.app.model.Hotel;
import com.app.model.User;
import com.app.service.AuthService;
import com.app.service.HotelService;
import com.app.service.RegisterService;

@Controller
public class HomeController {
	
	@Autowired
	HotelDao hotelDao;
	@Autowired
	HotelService hotelService;
	@Autowired
	AuthService authService;
	@Autowired
	RegisterService registerService;
	
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("page", "home");
		int size = hotelDao.getAll().size();
		int availableRooms = hotelService.getAvailbleRooms();
		model.addAttribute("size", size);
		model.addAttribute("availableRooms", availableRooms);
		return "home";
	}
	
	@RequestMapping("/add")
	public String add(Model model) {
		model.addAttribute("page", "add");
		Hotel hotel = new Hotel();
		model.addAttribute("hotel", hotel);
		return "home";
	}
	
	@RequestMapping(value="/saveHotel", method=RequestMethod.POST)
	public String saveHotel(@ModelAttribute("hotel") Hotel hotel,Model model,@RequestParam("image1") MultipartFile file) throws IOException {
		hotel.setImage(file.getBytes());
		model.addAttribute("page", "home");
		hotelDao.save(hotel);
		return "home";
	}
	
	@RequestMapping("/hotels")
	public String hotels(Model model) {
		model.addAttribute("page", "hotels");
		List<Hotel> hotels = hotelDao.getAll();
		model.addAttribute("hotels", hotels);
		return "home";
	}
	
	
	@RequestMapping("/delete/{hotelId}")
	public RedirectView deleteHotel(@PathVariable("hotelId") int id, HttpServletRequest request ) {
		RedirectView redirect = new RedirectView();
		System.out.println(id);
		hotelDao.delete(id);
		redirect.setUrl(request.getContextPath()+"/");
		return redirect;
	}
	
	@RequestMapping("/update/{hotelId}")
	public String update(@PathVariable("hotelId") int id, Model model) {
		Hotel hotel = hotelDao.get(id);
		model.addAttribute("hotel", hotel);
		return "update_hotel";
	}
	
	@RequestMapping("/update_hotel")
	public RedirectView updateHotel(@ModelAttribute("hotel") Hotel hotel, HttpServletRequest request) {
		RedirectView redirectView = new RedirectView();
		hotelDao.update(hotel);
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
	
	@RequestMapping("/getHotelImage/{id}")
	public void viewHotelImage(HttpServletResponse response, @PathVariable("id") int id) throws IOException {
		
		
		byte[] bytes = hotelDao.getPhoto(id);
		
		InputStream inputStream = new ByteArrayInputStream(bytes);
		IOUtils.copy(inputStream, response.getOutputStream());
	}
	
	@RequestMapping("/registration")
	public String registerUser(Model model) {
		User user = new User();
		model.addAttribute("user",user);
		return "registration_form";
	}
	
	@RequestMapping(value="/register_user", method = RequestMethod.POST )
	public RedirectView registerUser(@ModelAttribute("user") User user, HttpServletRequest request) {
		this.registerService.registerUser(user);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/login");  
		return redirectView;
	}
	
	@RequestMapping("/login")
	public String login(Model model, HttpServletRequest request) {
		String message = request.getParameter("message");
		User user = new User();
		model.addAttribute("user", user);
		model.addAttribute("message", message);
		return "login_form";
	}
	
	@RequestMapping(value="/authUser", method = RequestMethod.POST)
	public RedirectView authUser(@ModelAttribute("user") User user, HttpServletRequest request, Model model) {
		RedirectView redirectView = new RedirectView();
		
		User returnedUser = authService.isValid(user.getEmail(), user.getPassword());
		
		if(returnedUser!=null) {
			redirectView.setUrl(request.getContextPath()+"/book");
		}else {
			model.addAttribute("message", "Invalid Credentials");
			redirectView.setUrl(request.getContextPath()+"/login");
		}
		return redirectView;
	}
}
