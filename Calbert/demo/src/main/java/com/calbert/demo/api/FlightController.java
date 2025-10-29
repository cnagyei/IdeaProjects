package com.calbert.demo.api;

import com.calbert.demo.exception.FlightNotFoundException;
import com.calbert.demo.model.entity.Flight;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
public class FlightController {

    private final List<Flight> flights = new ArrayList<>();

    public FlightController() {
        flights.add(new Flight(1, "Accra", "Lagos", "A192"));
        flights.add(new Flight(2, "Lome", "Benin City", "C928"));
        flights.add(new Flight(3, "Northrop", "Miami", "D982"));
        flights.add(new Flight(4, "Kumasi", "Sunyani", "Z282"));
        flights.add(new Flight(5, "Tamale", "Lusaka", "F152"));
    }

    @GetMapping("/flights")
    public List<Flight> getFlights() {
        return flights;
    }

    @GetMapping("/flights/{id}")
    public Flight getFlight(@PathVariable int id) {
        for (Flight flight : flights) {
            if (flight.getId() == id) {
                if (Objects.equals(flight.getFrom(), "Accra")) {
//                    throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
//                            "Accra is currently closed for maintenance!"); // Does not include message unless set in application.properties
                    throw new FlightNotFoundException("Flight not found for id = " + id); // Custom exception
                } else {
                    return flight;
                }
            }
        }
        throw new RuntimeException();
    }

    @PostMapping("/flights")
    public void postFlight(
            @RequestParam("id") int flightId,
            @RequestParam String from,
            @RequestParam String to,
            @RequestParam String gate
            ) {
        flights.add(new Flight(flightId, from, to, gate));
    }

    @DeleteMapping("/flights/{id}")
    public void deleteFlight(@PathVariable("id") int flightId) {
        flights.remove(flightId - 1);
    }
}
