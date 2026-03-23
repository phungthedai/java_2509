package com.vti.entity.Ex5Qs1;

public class CongNhan extends CanBo {
    private int bac;
    public CongNhan(String hoTen, int tuoi, GioiTinh gioiTinh, String diaChi) {
        super(hoTen, tuoi, gioiTinh, diaChi);
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
}
