package com.vti.entity.day_5_java.Ex2.Qs2;

import java.util.Scanner;

public class Student extends Person{
    private String maSV;
    private double diemTB;
    private String email;
    public Student(String ten, String gioiTinh, String ngaySinh, String diaChi, String maSV, double diemTB, String email) {
        super(ten, gioiTinh, ngaySinh, diaChi);
        this.maSV = maSV;
        this.diemTB = diemTB;
        this.email = email;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        maSV = scanner.nextLine();

        while (true) {
            System.out.print("Nhập điểm trung bình: ");
            diemTB = scanner.nextDouble();
            if (diemTB >= 0 || diemTB <= 10) break;
            else System.out.println("Nhập lại điểm trung bình: ");
        }
        scanner.nextLine();

        System.out.print("Nhập email: ");
        email = scanner.nextLine();
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Mã SV: " + maSV);
        System.out.println("Điểm TB: " + diemTB);
        System.out.println("Email: " + email);
    }

    public void hocBong() {
        if (diemTB >= 8.0) System.out.println("Có học bổng");
        else System.out.println("Không có học bổng");
    }
}
