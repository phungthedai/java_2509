package org.example.day_7_java.Ex_2;

public class Qs1 {
    public static void main(String[] args) {
        try {
            float result = divide(7, 0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("cannot divide 0");
        } finally {
            System.out.println("divide completed!");
        }

    }

    public static float divide(int a, int b) throws ArithmeticException {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
    }
}
