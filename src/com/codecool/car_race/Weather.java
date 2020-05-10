package com.codecool.car_race;

public class Weather {

    private boolean rain;
    private Util rnd = new Util();

    public void setRain() {
        this.rain = rnd.getRandomNumber(10) < 3;
    }

    public boolean isRaining() {
        return rain;
    }
}
