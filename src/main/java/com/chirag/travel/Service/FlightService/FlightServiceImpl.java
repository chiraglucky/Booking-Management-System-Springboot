package com.chirag.travel.Service.FlightService;

import com.chirag.travel.Entity.Flight;
import com.chirag.travel.Entity.Hotel;
import com.chirag.travel.Repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightServiceImpl implements FlightService{
    @Autowired
    FlightRepository flightRepository;

    @Override
    public List<Flight> getAllFlights() {
        return this.flightRepository.findAll();
    }

    @Override
    public boolean reflectChange(String flightId, boolean check) {
        return false;
    }

    @Override
    public Flight getFlight(String flightId) {
        return this.flightRepository.findById(flightId).get();
    }

    @Override
    public Flight addFlight(Flight flight) {
        this.flightRepository.save(flight);
        return flight;
    }

    @Override
    public Flight updateFlight(Flight flight, String flightId) {
        Flight flight1=this.flightRepository.findById(flightId).get();
        flight1.setId(flight.getId());
        flight1.setName(flight.getName());
        flight1.setDescription(flight.getDescription());
        flight1.setCapacity(flight.getCapacity());
        this.flightRepository.save(flight1);
        return flight1;
    }

    @Override
    public void deleteFlight(String flightId) {
        this.flightRepository.deleteById(flightId);
    }
}
