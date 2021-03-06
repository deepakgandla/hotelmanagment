package com.app.dao.impl;

import java.sql.Blob;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.app.dao.HotelDao;
import com.app.model.Hotel;


@Component
public class HotelDaoImpl implements HotelDao{

	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int save(Hotel hotel) {
		Integer result = (Integer) this.hibernateTemplate.save(hotel);
		return result;
	}
	
	public List<Hotel> getAll() {
		List<Hotel> hotels = this.hibernateTemplate.loadAll(Hotel.class);
		return hotels;
	}

	@Transactional
	public void delete(int id) {
		Hotel hotel = hibernateTemplate.load(Hotel.class, id);
		hibernateTemplate.delete(hotel);
	}
	
	@Transactional
	public int update(Hotel hotel) {
		hibernateTemplate.update(hotel);
		
		return 0;
	}

	public Hotel get(int id) {
		Hotel hotel = hibernateTemplate.get(Hotel.class, id);
		return hotel;
	}

	public byte[] getPhoto(int id) {
		Hotel hotel = this.get(id);
		
		return hotel.getImage();
	}
	
	

}
