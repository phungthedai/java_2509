package org.example.day_6_java.Ex1;

import java.util.ArrayList;

public class LopHoc {
    private String maLop;
    private String tenLop;
    private MonHoc monHoc;
    private int soNguoiToiDa;
    private String thoiGian;
    private GiangVien giangVien;
    private BanGhe banGhe;
    private ArrayList<SinhVien> sinhVienList = new ArrayList<>();

    public LopHoc(String maLop, String tenLop, MonHoc monHoc, int soNguoiToiDa, String thoiGian, GiangVien giangVien, ArrayList<SinhVien> sinhVienList) {
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.monHoc = monHoc;
        this.soNguoiToiDa = soNguoiToiDa;
        this.thoiGian = thoiGian;
        this.giangVien = giangVien;
        this.sinhVienList = sinhVienList;
    }

    public void themSinhVien(SinhVien sv) {
        if (sinhVienList.size() > soNguoiToiDa) {
            if (!sinhVienList.contains(sv)) {
                sinhVienList.add(sv);
            } else System.out.println("Sinh viên đã trong lop");
        } else System.out.println("Lớp đã đủ người");
    }

    public void xoaSinhVien(SinhVien sv) {
        sinhVienList.removeIf(elem -> elem.getMaSv().equals(sv.getMaSv()));
    }
    public void hienThiSV() {
        sinhVienList.forEach(sv -> System.out.println(sv.ten));
    }

    public void getTenLop() {
        System.out.println("Tên lớp học: " + tenLop);
    }

    public void displayClassInfo() {
        System.out.println("Thông tin lớp học");
        System.out.println("Môn: " + tenLop + " | Thời gian: " + thoiGian);
        System.out.println("Giáo viên: " + giangVien.getTen());
        System.out.println("số sv: " + sinhVienList.size() + "/" + soNguoiToiDa);
        System.out.println("Danh sách sinh viên:");
        for (SinhVien sv : sinhVienList) {
            sv.displayInfo();
        }
    }

}
