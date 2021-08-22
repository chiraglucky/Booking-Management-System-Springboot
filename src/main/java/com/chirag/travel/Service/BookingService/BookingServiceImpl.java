package com.chirag.travel.Service.BookingService;

import com.chirag.travel.Entity.Booking;
import com.chirag.travel.Entity.Hotel;
import com.chirag.travel.Repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService{

    @Autowired
    BookingRepository bookingRepository;

    @Override
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    @Override
    public boolean reflectChange(String bookingId, boolean check) {
        return false;
    }

    @Override
    public Booking getBooking(String bookignId) {
        return bookingRepository.findById(bookignId).get();
    }

    @Override
    public Booking addBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public Booking updateBooking(Booking booking, String bookingId) {
        Booking booking1=bookingRepository.findById(bookingId).get();
        booking1.setId(booking.getId());
        booking1.setName(booking.getName());
        booking1.setDescription(booking.getDescription());
        booking1.setFlightId(booking.getFlightId());
        booking1.setHotelId(booking.getHotelId());
        this.bookingRepository.save(booking1);
        return booking1;
    }

    @Override
    public void deleteBooking(String bookingId) {
       this.bookingRepository.deleteById(bookingId);
    }
}
