package com.app.dao;

import java.sql.Blob;
import java.util.List;

import com.app.model.Hotel;

public interface HotelDao {
	int save(Hotel hotel);
	List<Hotel> getAll();
	void delete(int id);
	int update(Hotel hotel);
	Hotel get(int id);
	byte[] getPhoto(int id);
}
