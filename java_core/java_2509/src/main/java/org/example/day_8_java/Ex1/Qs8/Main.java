package org.example.day_8_java.Ex1.Qs8;

public class Main {
    static void main(String[] args) {
        try {
            HinhHoc h1 = new HinhTron(2);
            HinhHoc h2 = new HinhChuNhat(2, 3);
            HinhHoc h3 = new HinhTron(4);
            HinhHoc h4 = new HinhChuNhat(5, 6);
            HinhHoc h5 = new HinhTron(1);

            // Hình thứ 6 -> lỗi
            HinhHoc h6 = new HinhChuNhat(7, 8);

        } catch (HinhHocException e) {
            System.out.println(e.getMessage());
        }
    }
}
