package org.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static String filePath = "D:\\car.txt";

    public static void main(String[] args) {
        ArrayList<Vehicle> carLib = readFromFile();
        Student student = new Student("Саша", "Пронюшкин", "QA Enginner");
        Scanner scanner = new Scanner(System.in);
        boolean cheakerMenu = true;
        while (cheakerMenu) {
            System.out.println("Выбирите необходиму машину для заказа: ");
            System.out.println("1. - Электро автомобиль");
            System.out.println("2. - Механический автомобиль");
            System.out.println("3. - Автобус");
            System.out.println("4. - Грузовой автомобиль");
            System.out.println("5. - Введите новым параметры транспортных средства");
            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    writeSeats(carLib.getFirst());
                    writeSound(carLib.getFirst());
                    System.out.println(carLib.toArray()[0]);
                    printProperticeVehicle(carLib.getFirst());
                    break;
                case 2:
                    writeSeats(carLib.get(1));
                    writeSound(carLib.get(1));
                    System.out.println(carLib.toArray()[1]);
                    printProperticeVehicle(carLib.get(1));
                    break;
                case 3:
                    writeSeats(carLib.get(2));
                    writeSound(carLib.get(2));
                    System.out.println();
                    System.out.println(carLib.toArray()[2]);
                    printProperticeVehicle(carLib.get(2));
                    System.out.println();
                    break;
                case 4:
                    writeSeats(carLib.get(3));
                    writeSound(carLib.get(3));
                    System.out.println();
                    System.out.println(carLib.toArray()[3]);
                    printProperticeVehicle(carLib.get(3));
                    System.out.println();
                    break;
                case 5:
                    writeToFile();
                    break;
                case 6:
                    System.out.println();
                    student.printStudent();
                    System.out.println();
                    break;
            }
        }
    }

    public static void printProperticeVehicle(Vehicle vehicle) {
        System.out.println("Материал транспортного средства: " + vehicle.getFrame());
        System.out.println("Заданное колличество мест в транспортном средстве: " + vehicle.getNuberseats());
        System.out.println("Звук в в транспортном средстве: " + vehicle.getSounds());
        System.out.println();
    }

    public static void writeSeats(Vehicle vehicle) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите колличество мест для транспортного средства: ");
        int inputSeats1 = scanner.nextInt();
        vehicle.setNuberseats(inputSeats1);
    }

    public static void writeSound(Vehicle vehicle) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите звук транспортного средства: ");
        String inputSeats1 = scanner.nextLine();
        vehicle.setSounds(inputSeats1);
    }

    public static void writeToFile() {
        try {
            Scanner scanner = new Scanner(System.in);
            String write;
            FileWriter fileWriter = new FileWriter(filePath);
            System.out.println("Введите параметры транспортного средства через пробел (Длинна, Ширина, Высота, " +
                    "Двигатель, Колеса, Цвет, Материал: ");
            do {
                write = scanner.nextLine();
                fileWriter.write(write + "\n");
            }
            while (!write.isEmpty());
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error");
        }

    }

    public static ArrayList<Vehicle> readFromFile() {
        ArrayList<Vehicle> carLibFromFile = new ArrayList<>();
        File file = new File(filePath);
        try {
            Scanner scanner = new Scanner(file);
            String carString = scanner.nextLine();
            String[] parsedCar = carString.split(" ");
            carLibFromFile.add(new Car(Integer.parseInt(parsedCar[0]), Integer.parseInt(parsedCar[1]),
                    Integer.parseInt(parsedCar[2]), parsedCar[3], parsedCar[4], parsedCar[5], parsedCar[6]));
            carString = scanner.nextLine();
            parsedCar = carString.split(" ");
            carLibFromFile.add(new Car(Integer.parseInt(parsedCar[0]), Integer.parseInt(parsedCar[1]),
                    Integer.parseInt(parsedCar[2]), parsedCar[3], parsedCar[4], parsedCar[5], parsedCar[6]));
            carString = scanner.nextLine();
            parsedCar = carString.split(" ");
            carLibFromFile.add(new Bus(Integer.parseInt(parsedCar[0]), Integer.parseInt(parsedCar[1]),
                    Integer.parseInt(parsedCar[2]), parsedCar[3], parsedCar[4], parsedCar[5], parsedCar[6]));
            carString = scanner.nextLine();
            parsedCar = carString.split(" ");
            carLibFromFile.add(new Truck(Integer.parseInt(parsedCar[0]), Integer.parseInt(parsedCar[1]),
                    Integer.parseInt(parsedCar[2]), parsedCar[3], parsedCar[4], parsedCar[5], parsedCar[6]));
        } catch (IOException e) {
            System.out.println("Sorry, cannot read from file");
        }
        return carLibFromFile;

    }
}