package com.vti.entity.day_4_java.Ex5_Qs3;

public class Student extends Person {
    private int id;

    public Student(String name,int id) {
        super(name);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void showStudent() {
        super.showPerson();
        System.out.println("id: " + id);
    }
}
