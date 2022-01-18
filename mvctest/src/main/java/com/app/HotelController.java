package com.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.dao.HotelDao;
import com.app.model.Hotel;

@Controller
public class HotelController {
	@Autowired
	HotelDao hotelDao;
	
	@RequestMapping("/book")
	public String allHotels(Model model) {
		List<Hotel> hotels = hotelDao.getAll();
		System.out.println(hotels);
		model.addAttribute("hotels", hotels);
		return "show_hotels";    
	}
}
