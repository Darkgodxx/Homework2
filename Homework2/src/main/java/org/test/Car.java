package org.test;

public class Car extends Vehicle {

    public Car(int lengthCar, int widthCar, int heightCar, String typeWheel, String typeEngine, String colorCar, String frameCar) {
        this.lengthCar = lengthCar;
        this.widthCar = widthCar;
        this.heightCar = heightCar;
        this.typeEngine = typeEngine;
        this.typeWheel = typeWheel;
        this.colorCar = colorCar;
        this.frameCar = frameCar;
        volumeCar = lengthCar * widthCar * heightCar;
    }

    @Override
    public String toString() {
        return "Параметры автомобиля: \n" + "Длинна автомобиля: " + lengthCar + "\nШирина автомобиля: " + widthCar +
                "\nВысота автомобиля: " + heightCar + "\nОбьем размер автомобиля: " + volumeCar +
                "\nХарактеристики автмобиля: " + "\nДвигатель автомобиля: " + typeEngine + "\nКолеса автомобиля " +
                typeWheel + "\nЦвет автомобиля: " + colorCar;
    }

    @Override
    public void setNuberseats(int numberOfseats) {
        this.numberOfseats = numberOfseats;
    }

    @Override
    public void setSounds(String sounds) {
        this.sounds = sounds;
    }

    @Override
    public int getNuberseats() {
        return numberOfseats;
    }

    @Override
    public String getSounds() {
        return sounds;
    }

    @Override
    public String getFrame() {
        return frameCar + "-Лак";
    }
}
