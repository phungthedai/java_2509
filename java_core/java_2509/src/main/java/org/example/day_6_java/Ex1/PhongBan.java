package org.example.day_6_java.Ex1;

import java.util.ArrayList;

public class PhongBan {
    private String phongBanId;
    private String tenPhongBan;
    private ArrayList<GiangVien> listGangVien = new ArrayList<>();


    public PhongBan(String phongBanId, String tenPhongBan) {
        this.phongBanId = phongBanId;
        this.tenPhongBan = tenPhongBan;
    }

    public void themGiangVien(GiangVien giangVien) {
        listGangVien.add(giangVien);
        giangVien.setPhongBan(this);
    }
}
