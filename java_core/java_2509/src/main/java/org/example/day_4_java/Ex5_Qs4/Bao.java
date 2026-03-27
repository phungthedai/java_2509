package org.example.day_4_java.Ex5_Qs4;

public class Bao extends TaiLieu {
    private String ngayPhatHanh;

    public Bao(long maTaiLieu, String tenNhaXuatBan, long soBanPhatHanh, int loai, String ngayPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, loai);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public void showTaiLieu() {
        super.showTaiLieu();
        System.out.println("Ngày phát hành: " + ngayPhatHanh);
    }

    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }
}
