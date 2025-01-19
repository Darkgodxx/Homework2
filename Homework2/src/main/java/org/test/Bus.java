package org.test;

public class Bus extends Vehicle {
    public Bus(String frameCar) {
        this.frameCar = frameCar;
    }

    @Override
    public String getFrame() {
        return frameCar;
    }

    @Override
    public int getNuberseats(int numberOfseats) {
        return numberOfseats * 2;
    }

    @Override
    public String getSounds(String sounds) {
        return sounds;
    }
}
