package org.example.day_6_java.Ex1;

public enum HeDaoTao {
    DAI_HOC(4, 210),
    CAO_DANG(3, 150);

    private int soNam;
    private int soTinChi;

    HeDaoTao(int soNam, int soTinChi) {
        this.soNam = soNam;
        this.soTinChi = soTinChi;
    }

    public int getSoTinChi() { return soTinChi; }
    public int getSoNam() { return soNam; }
}
