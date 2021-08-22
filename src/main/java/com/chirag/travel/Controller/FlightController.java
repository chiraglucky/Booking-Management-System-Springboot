package com.chirag.travel.Controller;

import com.chirag.travel.Entity.Flight;
import com.chirag.travel.Entity.Hotel;
import com.chirag.travel.Service.FlightService.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/travel")
public class FlightController {

    @Autowired
    FlightService flightService;

    @GetMapping("/flight")
    public List<Flight> getAllFlights(){
        return this.flightService.getAllFlights();
    }

    @GetMapping("/flight/{id}")
    public Flight getFlight(@PathVariable String id){
        return this.flightService.getFlight(id);
    }

    @PostMapping("/flight")
    public Flight addFlight(@RequestBody Flight flight){
        return this.flightService.addFlight(flight);
    }

    @PutMapping("/flight/{id}")
    public Flight updateFlight(@PathVariable String id,@RequestBody Flight flight){
        return this.flightService.updateFlight(flight,id);
    }

    @DeleteMapping("/flight/{id}")
    public void deleteFlight(@PathVariable String id){
        this.flightService.deleteFlight(id);
    }
}
