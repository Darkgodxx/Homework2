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
    protected int numberOfseats;
    protected String sounds;

    protected String getFrame() {
        return frameCar;
    }

    protected abstract void setNuberseats (int numberOfseats);

    protected abstract void setSounds(String sounds);

    protected abstract int getNuberseats();

    protected abstract String getSounds();
}
