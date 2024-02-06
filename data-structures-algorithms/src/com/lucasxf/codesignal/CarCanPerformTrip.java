package com.lucasxf.codesignal;

/**
 * There's a car with a certain number of seats that only drives forward in a single road 1.000KM long.
 * <p>
 * You are given the capacity of the car and an array of trips in which each trip has:
 * - The number of passengers
 * - The pick-up location
 * - The drop-off location
 * <p>
 * Ex.: given the trip [2,1,5], it means that 2 passengers will be picked up at 1st km and dropped off at 5th.
 * <p>
 * Write a function that answers whether this car is able to comply with all the given trips.
 */
public class CarCanPerformTrip {

    public boolean canComply(int capacity, int[][] trips) {
        if (capacity < 1 || trips == null || trips.length == 0) {
            return false;
        }
        final int fullDistance = 1_000;
        int currKm = 0;
        int availableSeats = capacity;
        for (int i = 0; i < trips.length; i++) {
            int[] trip = trips[i];
            int passengers = trip[0];
            if ((passengers + availableSeats) > availableSeats) {
                return false;
            }
            availableSeats = availableSeats - passengers;
            int pickup = trip[1];
            if (pickup < currKm || pickup >= fullDistance) {
                return false;
            }
            if (currKm + pickup >= fullDistance) {
                return false;
            }
            currKm += pickup;
            int dropoff = trip[2];
            if (dropoff < currKm || dropoff >= fullDistance) {
                return false;
            }
        }
        return true;
    }

}
