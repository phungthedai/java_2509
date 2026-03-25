package com.vti.entity.day_4_java.Ex5_Qs1;

public class CongNhan extends CanBo {
    private int bac;

    public CongNhan(String hoTen1, int tuoi, GioiTinh gioiTinh, String diaChi, int bac) {
        super(hoTen1, tuoi, gioiTinh, diaChi);
        this.bac = bac;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        if (bac < 1) {
            this.bac = 1;
        } else if (bac > 10) {
            this.bac = 10;
        } else this.bac = bac;
    }
    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Bậc: " + bac);
    }
}
