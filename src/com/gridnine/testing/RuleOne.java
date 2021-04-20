package com.gridnine.testing;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class RuleOne implements IRules {


    @Override
    public List<Flight> applyRule(List<Flight> flightList) {
        List<Flight> result = new ArrayList<>();
        for (Flight flight : flightList) {
            if (flight.getSegments().get(0).getDepartureDate().isAfter(LocalDateTime.now())) {
                result.add(flight);
            }
        }
        return result;
    }
}
