package org.test;

public abstract class Vehicle {
    protected String frameCar;
    protected String z;

    protected String getFrame() {
        return frameCar;
    }

    protected abstract int getNuberseats(int numberOfseats);

    protected abstract String getSounds(String sounds);

}
