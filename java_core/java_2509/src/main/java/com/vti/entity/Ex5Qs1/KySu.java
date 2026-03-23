package com.vti.entity.Ex5Qs1;

public class KySu extends CanBo {
    private String major;
    public KySu(String hoTen, int tuoi, GioiTinh gioiTinh, String diaChi) {
        super(hoTen, tuoi, gioiTinh, diaChi);
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major1) {
        major = major1;
    }
}
