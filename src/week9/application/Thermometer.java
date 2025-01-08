package week9.application;

import java.util.Random;

public class Thermometer implements Sensor {

    private boolean isOn = false;

    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void on() {
        this.isOn = true;
    }

    @Override
    public void off() {
        this.isOn = false;
    }

    @Override
    public int measure() {
        if (this.isOn) {
            return (int)(Math.round(Math.random() * -30 + Math.random() * 30));
        } else {
            throw new IllegalStateException("Thermometer is off");
        }
    }
}