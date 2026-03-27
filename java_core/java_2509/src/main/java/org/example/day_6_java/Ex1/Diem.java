package org.example.day_6_java.Ex1;

public class Diem {
    private SinhVien sinhVien;
    private MonHoc monHoc;
    private double diem;

    public Diem(SinhVien sinhVien, MonHoc monHoc, double diem) {
        this.sinhVien = sinhVien;
        this.monHoc = monHoc;
        this.diem = diem;
    }

    public double getDiem() {
        return diem;
    }

    public MonHoc getMonHoc() {
        return monHoc;
    }

    @Override
    public String toString() {
        return sinhVien.getTen() + " - " + monHoc.getName() + ": " + diem;
    }
}
