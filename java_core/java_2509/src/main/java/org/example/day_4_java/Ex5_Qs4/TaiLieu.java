package org.example.day_4_java.Ex5_Qs4;

public class TaiLieu {
    private long maTaiLieu;
    private String tenNhaXuatBan;
    private long soBanPhatHanh;
    private int loai;

    public TaiLieu(long maTaiLieu, String tenNhaXuatBan, long soBanPhatHanh, int loai) {
        this.maTaiLieu = maTaiLieu;
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
        this.loai = loai;
    }

    public void showTaiLieu() {
        System.out.println("Mã tài liệu: " + maTaiLieu + "\n Tên nhà xuất bản: " + tenNhaXuatBan + "\n Số bản phát hành: " + soBanPhatHanh + "\n Loại: " + loai);
    }

    public long getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(long maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenNhaXuatBan() {
        return tenNhaXuatBan;
    }

    public void setTenNhaXuatBan(String tenNhaXuatBan) {
        this.tenNhaXuatBan = tenNhaXuatBan;
    }

    public long getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(long soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public int getLoai() { return loai; }
    public void setLoai(int loai) { this.loai = loai; }
}
