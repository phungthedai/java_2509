package org.example.day_6_java.Ex1;

public class HocPhi {
    private SinhVien sinhVien;
    private double soTien;
    private double soTenDaDong;

    public HocPhi(SinhVien sv, double soTien, double soTenDaDong) {
        this.sinhVien = sv;
        this.soTien = soTien;
        this.soTenDaDong = soTenDaDong;
    }
    public void dongHocPhi(double soTenDaDong) {
        this.soTenDaDong = soTenDaDong;
        System.out.println("Đã đóng học phí: " + soTenDaDong);
    }
    public boolean isDaDongDu() {
        return soTenDaDong == soTien;
    }

    public void xemHocPhi() {
        System.out.println("học phí: " + soTien);
    }
}
