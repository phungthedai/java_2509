package com.vti.entity.day_5_java.Ex2.Qs3;

public class HinhVuong extends HinhChuNhat {

    public HinhVuong(double canh) {
        super(canh, canh);
    }

    @Override
    public void tinhChuVi() {
        System.out.println("Chu vi hình vuông");
        super.tinhChuVi();
    }

    @Override
    public void tinhDienTich() {
        System.out.println("Diện tích hình vuông");
        super.tinhDienTich();
    }
}
