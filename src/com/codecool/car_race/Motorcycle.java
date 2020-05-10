package com.codecool.car_race;

public class Motorcycle extends Vehicle {

    private static int motorcyclrInstances = 0;
    private Util rnd = new Util();

    public Motorcycle() {
        this.name = String.format("Motorcycle %d", motorcyclrInstances);
        motorcyclrInstances++;
    }

    public void prepareForLap(Race race) {
        this.speed = race.raceWeather.isRaining() ? 100 - (5+rnd.getRandomNumber(46)) : 100;
    }
}
