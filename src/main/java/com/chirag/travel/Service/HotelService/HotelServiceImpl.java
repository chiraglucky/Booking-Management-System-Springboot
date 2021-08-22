package com.chirag.travel.Service.HotelService;

import com.chirag.travel.Entity.Hotel;
import com.chirag.travel.Repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HotelServiceImpl implements HotelService{

    @Autowired
    HotelRepository hotelRepository;

    @Override
    public List<Hotel> getAllHotels() {
        List<Hotel> hotels=new ArrayList<>();
        this.hotelRepository.findAll().forEach(hotel -> hotels.add(hotel));
        return hotels;
    }

    @Override
    public boolean reflectChange(String hotelId, boolean check) {
        return false;
    }

    @Override
    public Hotel getHotel(String hotelId) {
        return this.hotelRepository.findById(hotelId).orElse(null);
    }

    @Override
    public Hotel addHotel(Hotel hotel) {
        this.hotelRepository.save(hotel);
        return hotel;
    }

    @Override
    public Hotel updateHotel(Hotel hotel, String hotelId) {
        Hotel hotel1=this.hotelRepository.findById(hotelId).get();
        hotel1.setId(hotel.getId());
        hotel1.setName(hotel.getName());
        hotel1.setDescription(hotel.getDescription());
        hotel1.setCapacity(hotel.getCapacity());
        this.hotelRepository.save(hotel1);
        return hotel1;
    }

    @Override
    public void deleteHotel(String hotelId) {
        this.hotelRepository.deleteById(hotelId);
    }
}
