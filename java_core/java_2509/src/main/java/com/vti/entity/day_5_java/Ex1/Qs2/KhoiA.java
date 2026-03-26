package com.vti.entity.day_5_java.Ex1.Qs2;

public class KhoiA extends ThiSinh {
    public KhoiA(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Thí Sinh Khối A: Toán, Lý, Hóa");
    }
}
