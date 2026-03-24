package com.vti.entity.day_4_java.Ex5_Qs1;

public class NhanVien extends CanBo {
    private String work;

    public NhanVien(String hoTen, int tuoi, GioiTinh gioiTinh, String diaChi,String work) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Công việc: " + work);
    }
}
