package com.chirag.travel.Service.BookingService;

import com.chirag.travel.Entity.Booking;
import com.chirag.travel.Entity.Flight;
import com.chirag.travel.Entity.Hotel;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;

@Service
public interface BookingService {
    List<Booking> getAllBookings();
    boolean reflectChange(String bookingId,boolean check);
    Booking getBooking(String bookignId);
    Booking addBooking(Booking booking);
    Booking updateBooking(Booking booking,String bookingId);
    void deleteBooking(String bookingId);
}
