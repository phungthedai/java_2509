package org.example.day_7_java.Ex_2;

public class Qs3 {
    static void main(String[] args) {
        int[] numbers = {1,2,3};
        try {
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
