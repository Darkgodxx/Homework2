package org.test;

public class Car extends Vehicle {
    public int lengthCar;
    public int widthCar;
    public int heightCar;
    public int volumeCar;
    public String typeWheel;
    public String typeEngine;
    public String colorCar;

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
    public int getNuberseats(int numberOfseats) {
        return numberOfseats;
    }

    @Override
    public String getSounds(String sounds) {
        return sounds;
    }

    @Override
    public String getFrame() {
        return frameCar;
    }
}
