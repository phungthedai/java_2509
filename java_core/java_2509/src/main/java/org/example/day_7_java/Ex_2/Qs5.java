package org.example.day_7_java.Ex_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Qs5 {
    static void main(String[] args) {
        while (true) {
            try {
                int age = inputAge();
                if (age >= 0) {
                    System.out.println(age);
                    return;
                }
            } catch (InputMismatchException e) {
                System.out.println("wrong inputing! Please input an age as int, input again.");
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public static int inputAge() throws RuntimeException {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhập tuổi: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            if (age < 0) {
                throw new RuntimeException("Wrong inputing! The age must be greater than 0, please input again.");
            } else {
                return age;
            }
        } catch (InputMismatchException e) {
            throw new InputMismatchException();
        }
    }
}
