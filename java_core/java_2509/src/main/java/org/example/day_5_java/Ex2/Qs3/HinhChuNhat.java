package org.example.day_5_java.Ex2.Qs3;

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
        System.out.println("Tính diện tích/ chu vi theo Hình Vuông/ Hình Chữ Nhật" + chuVi);
    }

    @Override
    public void tinhDienTich() {
        double dienTich = chieuDai * chieuRong;
        System.out.println("Tính diện tích/ chu vi theo Hình Vuông/ Hình Chữ Nhật:" + dienTich);
    }
}
