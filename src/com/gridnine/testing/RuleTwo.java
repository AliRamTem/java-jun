package com.gridnine.testing;

import java.util.ArrayList;
import java.util.List;

public class RuleTwo implements IRules {


    @Override
    public List<Flight> applyRule(List<Flight> flightList) {
        List<Flight> result = new ArrayList<>();
        for (Flight flight : flightList) {
            List<Segment> segments = flight.getSegments();
            for (Segment segment : segments) {
                if (segment.getDepartureDate().isAfter(segment.getArrivalDate())) {
                    result.add(flight);
                    break;
                }
            }
        }
        return result;
    }
}