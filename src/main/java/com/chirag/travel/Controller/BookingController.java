package com.chirag.travel.Controller;

import com.chirag.travel.Entity.Booking;
import com.chirag.travel.Entity.Flight;
import com.chirag.travel.Entity.Hotel;
import com.chirag.travel.Service.BookingService.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@RestController
@RequestMapping("/travel")
public class BookingController {

    @Autowired
    BookingService bookingService;

    @GetMapping("/booking")
    public List<Booking> getAllBooking(){
        return this.bookingService.getAllBookings();
    }

    @GetMapping("/booking/{id}")
    public Booking getBooking(@PathVariable String id){
        return this.bookingService.getBooking(id);
    }

    @PostMapping("/booking")
    public Booking addBooking(@RequestBody Booking booking){
        return this.bookingService.addBooking(booking);
    }

    @PutMapping("/booking/{id}")
    public Booking updateBooking(@PathVariable String id, @RequestBody Booking booking){
        return this.bookingService.updateBooking(booking,id);
    }

    @DeleteMapping("/booking/{id}")
    public void deleteBooking(@PathVariable String id){
        this.bookingService.deleteBooking(id);
    }
}
