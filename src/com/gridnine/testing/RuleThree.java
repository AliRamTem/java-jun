package com.gridnine.testing;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class RuleThree implements IRules{

    @Override
    public List<Flight> applyRule(List<Flight> flightList) {
        List<Flight> result = new ArrayList<>();
        List<Flight> temp = new ArrayList<>();
        for (Flight flight : flightList) {
            if (flight.getSegments().size() != 1) {
                temp.add(flight);
            }
        }
        for (int i = 0; i < temp.size(); i++) {
            List<Segment> segments = temp.get(i).getSegments();
            long diff = 0;
            for (int j = segments.size() - 1; j > 0; j--) {
                diff += ChronoUnit.MINUTES.between(segments.get(j - 1).getArrivalDate(), segments.get(j).getDepartureDate());
            }
            if (diff >= 120)
                result.add(temp.get(i));
        }
        return result;
    }
}
