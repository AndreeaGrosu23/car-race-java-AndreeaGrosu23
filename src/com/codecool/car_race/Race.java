package com.codecool.car_race;

import java.util.*;

public class Race {

    /**
     * Simulates the passing of time by advancing the weather and
     * moving the vehicles for the duration of a whole race.
     */

    Vehicle[] vehicles = new Vehicle[30];

    public Weather raceWeather = new Weather();

    public void simulateRace(Race race) {

        for (int i=0; i<50; i++) {
            race.raceWeather.setRain();
            for (Vehicle vehicle : vehicles) {
                vehicle.prepareForLap(race);
            }
            for (Vehicle vehicle : vehicles) {
                vehicle.moveForAnHour();
            }
        }
    }

    public boolean isThereBrokenTruck() {
        int truckIndex;
        for (truckIndex=20; truckIndex<30; truckIndex++) {
            if (this.vehicles[truckIndex].getSpeed() == 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * Prints the state of all vehicles. Called at the end of the
     * race.
     */
    public void printRaceResults() {

        Arrays.sort(this.vehicles, Comparator.comparing(Vehicle::getDistanceTraveled).reversed());
        int counter = 1;
        for (Vehicle vehicle : this.vehicles) {
            System.out.printf("%d. %dkm %s\n", counter, vehicle.getDistanceTraveled(), vehicle.getName());
            counter++;
        }
    }
}
