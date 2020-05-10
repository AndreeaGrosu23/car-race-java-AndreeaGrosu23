package com.codecool.car_race;

import java.util.Random;

public class Util {

    private Random random = new Random();

    public int getRandomNumber(int range) {
        return random.nextInt(range);
    }

}
