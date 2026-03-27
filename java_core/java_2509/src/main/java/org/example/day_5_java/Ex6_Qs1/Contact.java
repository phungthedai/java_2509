package org.example.day_5_java.Ex6_Qs1;

public class Contact {
    private int number;
    private String name;

    public Contact(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}
