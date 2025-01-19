package org.test;

public class Student {
    public String nameStudent;
    public String surnameStudent;
    public String workStudent;

    public Student(String nameStudent, String surnameStudent, String workStudent) {
        this.nameStudent = nameStudent;
        this.surnameStudent = surnameStudent;
        this.workStudent = workStudent;
    }

    public void printStudent() {
        System.out.println("Информация о студенте: ");
        System.out.println("Имя студента: " + this.nameStudent);
        System.out.println("Фамили студента: " + this.surnameStudent);
        System.out.println("Студет работает: " + this.workStudent);
    }
}
