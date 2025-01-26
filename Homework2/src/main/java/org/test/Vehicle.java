package org.test;

public abstract class Vehicle {
    protected String frameCar;
    protected int lengthCar;
    protected int widthCar;
    protected int heightCar;
    protected int volumeCar;
    protected String typeWheel;
    protected String typeEngine;
    protected String colorCar;

    protected String getFrame() {
        return frameCar;
    }

    protected abstract int getNuberseats(int numberOfseats);

    protected abstract String getSounds(String sounds);
}
