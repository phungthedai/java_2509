package org.example.day_6_java.Ex1;

import org.example.java_core.Department;

public class GiangVien extends Person {
    private String maGv;
    private double luong;
    private PhongBan phongBan;

    public GiangVien( String ten, int tuoi, String gioiTinh, String ngaySinh, String diaChi, String maGv, double luong, PhongBan phongBan) {
        super(ten, tuoi, gioiTinh, ngaySinh, diaChi);
        this.maGv = maGv;
        this.luong = luong;
        this.phongBan = phongBan;
        phongBan.themGiangVien(this);
    }


    public void dayHoc() {
        System.out.println(ten + " đang dạy");
    }

    public void assignHomework() {
        System.out.println("Giáo viên " + ten + " đã giao bài tập cho lớp.");
    }

    public void setPhongBan(PhongBan phongBan) {
        this.phongBan = phongBan;
    }

    public String getTen() {
        return ten;
    }

    @Override
    public void displayInfo() {
        System.out.println("GV: " + ten);
    }
}
