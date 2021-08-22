package com.chirag.travel.Service.FlightService;

import java.util.List;

import com.chirag.travel.Entity.Flight;
import com.chirag.travel.Entity.Hotel;
import org.springframework.stereotype.Service;


@Service
public interface FlightService {
    List<Flight> getAllFlights();
    boolean reflectChange(String flightId,boolean check);
    Flight getFlight(String flightId);
    Flight addFlight(Flight flight);
    Flight updateFlight(Flight flight,String flightId);
    void deleteFlight(String flightId);
}
