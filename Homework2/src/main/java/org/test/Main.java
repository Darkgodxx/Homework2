package org.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int seats;
    public static String sound;
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
                    System.out.println("Заданное колличество мест в электро автомобиле: " + seats);
                    System.out.println("Звук электро автомобиля: " + sound);
                    System.out.println(carLib.toArray()[0]);
                    printMaterial(carLib.getFirst());
                    break;
                case 2:
                    writeSeats(carLib.get(1));
                    writeSound(carLib.get(1));
                    System.out.println("Заданное колличество мест в механическом автомобиле: " + seats);
                    System.out.println("Звук в механическом автомобиле: " + sound);
                    System.out.println(carLib.toArray()[1]);
                    printMaterial(carLib.get(1));
                    break;
                case 3:
                    writeSeats(carLib.get(2));
                    writeSound(carLib.get(2));
                    System.out.println();
                    System.out.println("Заданное колличество мест в автобусе: " + seats);
                    System.out.println("Звук в автобусе: " + sound);
                    System.out.println(carLib.toArray()[2]);
                    printMaterial(carLib.get(2));
                    System.out.println();
                    break;
                case 4:
                    writeSeats(carLib.get(3));
                    writeSound(carLib.get(3));
                    System.out.println();
                    System.out.println("Заданное колличество мест в грузовом автомобиле: " + seats);
                    System.out.println("Звук в грузовом автомобиле: " + sound);
                    System.out.println(carLib.toArray()[3]);
                    printMaterial(carLib.get(3));
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

    public static void printMaterial(Vehicle vehicles) {
        System.out.println("Материал транспортного средства: " + vehicles.getFrame());
        System.out.println();
    }

    public static void writeSeats(Vehicle vehicle) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите колличество мест для транспортного средства: ");
        int inputSeats1 = scanner.nextInt();
        seats = vehicle.getNuberseats(inputSeats1);
    }

    public static void writeSound(Vehicle vehicle) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите звук транспортного средства: ");
        String inputSeats1 = scanner.nextLine();
        sound = vehicle.getSounds(inputSeats1);
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