package com.bridgelabz.hotelreservationsystem;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class HotelReservationSystem {

     static Hotel LAKEWOOD = new Hotel("Lakewood", 3, 110, 80, 90, 80);
     static Hotel BRIDGEWOOD = new Hotel("BridgeWood", 4, 160, 60, 110, 50);

     static Hotel RIDGEWOOD = new Hotel ("Ridgewood", 5, 220, 150, 100, 40);


    public static void main(String[] args) {
        CustomerPreferences customerPreferences = new CustomerPreferences();

        Hotel cheapestHotel = Stream.of(LAKEWOOD, BRIDGEWOOD, RIDGEWOOD).min(Comparator.comparing(hotel -> hotel.getCost(customerPreferences))).orElseThrow();
        System.out.println(cheapestHotel.getHotelName());
    }
}
