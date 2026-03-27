package org.example.day_6_java.Ex1;

import java.util.ArrayList;

public class CauLacBo {
    private String tenCLB;
    private ArrayList<SinhVien> thanhVien = new ArrayList<>();

    public CauLacBo(String tenCLB) {
        this.tenCLB = tenCLB;
    }
    public void themThanhVien(SinhVien sv) {
        if (!thanhVien.contains(sv)) {
            thanhVien.add(sv);
            sv.dangKyCLB(this);
        } else System.out.println("Sinh vien đã có trong CLB");
    }
}
