package com.chirag.travel.Service.HotelService;

import com.chirag.travel.Entity.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HotelService {
    List<Hotel> getAllHotels();
    boolean reflectChange(String hotelId,boolean check);
    Hotel getHotel(String hotelId);
    Hotel addHotel(Hotel hotel);
    Hotel updateHotel(Hotel hotel,String hotelId);
    void deleteHotel(String hotelId);
}