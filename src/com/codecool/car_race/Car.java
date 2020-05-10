package com.codecool.car_race;

public class Car extends Vehicle {

    private final Util rnd = new Util();

    public Car() {
        final String[] vehicleFirstName = new String[] {
                "Astral", "Augury", "Pinnacle", "Eternity", "Scout",
                "Fragment", "Reach", "Obsidian", "Morale", "Serpent"};
        final String[] vehicleSecondName = new String[] {
                "Dominion", "Mirage", "Inception", "Ferocity", "Olympian",
                "Cosmos", "Nebula", "Encounter", "Spotlight", "Tempest"};
        this.name = String.format("%s %s", vehicleFirstName[rnd.getRandomNumber(10)],
                vehicleSecondName[rnd.getRandomNumber(10)]);
    }

    public void prepareForLap(Race race) {
        this.speed = race.isThereBrokenTruck() ? 75 : 80 + rnd.getRandomNumber(31);
    }


}


