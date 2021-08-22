package com.chirag.travel.Controller;

import com.chirag.travel.Entity.Hotel;
import com.chirag.travel.Service.HotelService.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/travel")
public class HotelController {

    @Autowired
    HotelService hotelService;

    @GetMapping("/hotel")
    public List<Hotel> getAllHotels(){
        return this.hotelService.getAllHotels();
    }

    @GetMapping("/hotel/{id}")
    public Hotel getHotel(@PathVariable String id){
        return this.hotelService.getHotel(id);
    }

    @PostMapping("/hotel")
    public Hotel addHotel(@RequestBody Hotel hotel){
        return this.hotelService.addHotel(hotel);
    }

    @PutMapping("/hotel/{id}")
    public Hotel updateHotel(@PathVariable String id,@RequestBody Hotel hotel){
        return this.hotelService.updateHotel(hotel,id);
    }

    @DeleteMapping("/hotel/{id}")
    public void deleteHotel(@PathVariable String id){
        this.hotelService.deleteHotel(id);
    }
}
