package com.vti.entity.day_5_java.Ex2.Qs3;

public class HinhChuNhat implements Tinh {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public void tinhChuVi() {
        double chuVi = (chieuDai + chieuRong) * 2;
        System.out.println("Chu vi hình chữ nhật:" + chuVi);
    }

    @Override
    public void tinhDienTich() {
        double dienTich = chieuDai * chieuRong;
        System.out.println("Diện tích hình chữ nhật:" + dienTich);
    }
}
