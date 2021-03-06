package model;

import interfaces.StudentInfoProvider;

public class Student extends Person {
    private static int count = 0;
    private int id;
    private double GPA;

    public Student(String name, double GPA) {
        this.id = count++;
        this.name = name;
        this.GPA = GPA;
    }

    public int getId() {
        return id;
    }

    @Override
    public String fullName() {
        return name;
    }
}
