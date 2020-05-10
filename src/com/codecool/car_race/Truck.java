package com.codecool.car_race;

public class Truck extends Vehicle {

    private int breakDownTurnsLeft = 0;
    private final Util rnd = new Util();

    public Truck() {
        this.name = "Truck" + (1+rnd.getRandomNumber(1000));
    }

    public void prepareForLap(Race race) {
        if (breakDownTurnsLeft == 0) {
            this.speed = rnd.getRandomNumber(20) == 0 ? 0 : 100;
        }
        if (this.speed == 0 && breakDownTurnsLeft == 0) {
            breakDownTurnsLeft = 2;
        }
        if (breakDownTurnsLeft > 0) {
            breakDownTurnsLeft--;
        }
    }

}
