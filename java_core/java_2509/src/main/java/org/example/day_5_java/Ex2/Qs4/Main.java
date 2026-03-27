package org.example.day_5_java.Ex2.Qs4;

public class Main {
    static void main(String[] args) {
        MyMath math = new MyMath();

        int kq1 = math.sum(5, 10);
        System.out.println("Tổng int: " + kq1);
        byte a = 2, b = 3;
        byte kq2 = math.sum(a, b);
        System.out.println("Tổng byte: " + kq2);

        float kq3 = math.sum(2.5f, 3.5f);
        System.out.println("Tổng float: " + kq3);
    }
}
