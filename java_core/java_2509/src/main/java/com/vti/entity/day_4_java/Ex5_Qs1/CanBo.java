package com.vti.entity.day_4_java.Ex5_Qs1;

public class CanBo {
    private String hoTen;
    private int tuoi;
    private GioiTinh gioiTinh;
    private String diaChi;


    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen1) {
        hoTen = hoTen1;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        if (tuoi < 0) this.tuoi = 0;
        else this.tuoi = tuoi;
    }

    public GioiTinh getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(GioiTinh gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public CanBo(String hoTen1, int tuoi, GioiTinh gioiTinh, String diaChi) {
        hoTen = hoTen1;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public void hienThiThongTin() {
        System.out.println("Họ tên: " + hoTen +
                ", Tuổi: " + tuoi +
                ", Giới tính: " + gioiTinh +
                ", Địa chỉ: " + diaChi);
    }
}
