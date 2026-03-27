package org.example.day_6_java.Ex1;

public abstract class Person {
    protected String ten;
    protected int tuoi;
    protected String ngaySinh;
    protected String gioiTinh;
    protected String diaChi;
    public Person(String ten, int tuoi, String gioiTinh, String ngaySinh, String diaChi) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public abstract void displayInfo();
}
