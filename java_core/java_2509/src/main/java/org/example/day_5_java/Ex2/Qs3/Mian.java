package org.example.day_5_java.Ex2.Qs3;

public class Mian {
    static void main(String[] args) {

        HinhChuNhat hcn = new HinhChuNhat(5, 3);
        hcn.tinhChuVi();
        hcn.tinhDienTich();

        System.out.println("-----------");

        HinhVuong hv = new HinhVuong(4);
        hv.tinhChuVi();
        hv.tinhDienTich();
    }
}
