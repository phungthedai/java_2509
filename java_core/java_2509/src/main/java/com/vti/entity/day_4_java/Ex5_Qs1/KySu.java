package com.vti.entity.day_4_java.Ex5_Qs1;

public class KySu extends CanBo {
    private String major;
    public KySu(String hoTen, int tuoi, GioiTinh gioiTinh, String diaChi, String major) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major1) {
        major = major1;
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Chuyên ngành: " + major);
    }
}
