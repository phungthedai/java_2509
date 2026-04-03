package org.example.day_7_java.Ex_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerUtils {
    //Question 9:
    //Thay đổi các method ở class ScannerUtils ở Assignment 6 thành static để tiện dùng hơn
    public static int inputInt(String errMsg) throws RuntimeException {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhập số: ");
            int value = scanner.nextInt();
            scanner.nextLine();
            return value;
        } catch (InputMismatchException e) {
            throw new RuntimeException(errMsg);
        } finally {
            scanner.close();
        }
    }

    public static float inputFloat(String errMsg) throws RuntimeException {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhập số float: ");
            float value = scanner.nextFloat();
            scanner.nextLine();
            return value;
        } catch (InputMismatchException e) {
            throw new RuntimeException(errMsg);
        } finally {
            scanner.close();
        }
    }

    public static double inputDouble(String errMsg) throws RuntimeException {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhập số double: ");
            double value = scanner.nextDouble();
            scanner.nextLine();
            return value;
        } catch (InputMismatchException e) {
            throw new RuntimeException(errMsg);
        } finally {
            scanner.close();
        }
    }

    public static String inputString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập string: ");
        String value = scanner.nextLine();
        scanner.nextLine();
        scanner.close();
        return value;
    }

    public static int inputAge() throws InvalidAgeInputingException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Nhập age: ");
                int value = scanner.nextInt();
                scanner.nextLine();
                if (value <= 0) {
                    throw new InvalidAgeInputingException("The age must be greater than 0");
                } else {
                    scanner.close();
                    return value;
                }
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
