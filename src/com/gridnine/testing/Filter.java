package com.gridnine.testing;

import java.util.List;

public class Filter {
    private List<Flight> flightList;

    public Filter(List<Flight> flightList) {
        this.flightList = flightList;
    }

    public List<Flight> applyFilter(IRules rules) {
        return rules.applyRule(flightList);
    }

    public List<Flight> applyFilter(IRules[] rules) {
        List<Flight> flight = flightList;
        for (int i = 0; i < rules.length; i++) {
            flight = rules[i].applyRule(flight);
        }
        return flight;
    }
}
