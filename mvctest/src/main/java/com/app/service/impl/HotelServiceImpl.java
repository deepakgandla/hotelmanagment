package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.HotelDao;
import com.app.model.Hotel;
import com.app.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService {
	
	@Autowired
	HotelDao hotelDao;
	public int getAvailbleRooms() {
		List<Hotel> hotels = hotelDao.getAll();
		int availableRooms = 0;
		for(Hotel hotel:hotels) {
			availableRooms += hotel.getTotalRooms();
		}
		return availableRooms;
	}

}
