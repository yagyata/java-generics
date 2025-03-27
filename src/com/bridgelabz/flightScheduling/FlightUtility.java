package com.bridgelabz.flightScheduling;
import java.util.List;

class FlightUtility {
    public static void displayFlightDetails(List<? extends Flight<?>> flights) {
        for(Flight<?> flight : flights) {
            flight.displayFlightInfo();
        }
    }
}
