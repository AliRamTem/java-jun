package com.gridnine.testing;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*List<Flight> flightList = FlightBuilder.createFlights();
        IRules[] rules = {new RuleOne(), new RuleTwo(), new RuleThree()};      <---- if need combine more then one filter
        Filter filter = new Filter(flightList);
        for (Flight flight : filter.applyFilter(rules)) {
            System.out.println(flight);
        }*/
        System.out.println("ZERO************************************");
        List<Flight>  flightList = FlightBuilder.createFlights();
        for (Flight flight : flightList) {
            System.out.println(flight);
        }

        System.out.println("FIRST************************************");
        Filter filter = new Filter(flightList);
        for (Flight flight : filter.applyFilter(new RuleOne())) {
            System.out.println(flight);
        }
        System.out.println("SECOND************************************");
        flightList = FlightBuilder.createFlights();
        for (Flight flight : filter.applyFilter(new RuleTwo())) {
            System.out.println(flight);
        }
        System.out.println("THIRD************************************");
        flightList = FlightBuilder.createFlights();
        for (Flight flight : filter.applyFilter(new RuleThree())) {
            System.out.println(flight);
        }
    }
}
