package com.vti.entity.day_4_java.Ex5_Qs3;

public class Person {
    private String name;

    public void showPerson() {
        System.out.println("name: " + name );
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
