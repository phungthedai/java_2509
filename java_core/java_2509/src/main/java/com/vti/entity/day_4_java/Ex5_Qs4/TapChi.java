package com.vti.entity.day_4_java.Ex5_Qs4;

public class TapChi extends TaiLieu {
    private String soPhatHanh;
    private int thangPhatHanh;

    public TapChi(long maTaiLieu, String tenNhaXuatBan, long soBanPhatHanh, int loai, String soPhatHanh, int thangPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, loai);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public void showTaiLieu() {
        super.showTaiLieu();
        System.out.println("Số phát hành: " + soPhatHanh + "\nTháng phát hành: " + thangPhatHanh);
    }

    public String getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(String soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }
}
