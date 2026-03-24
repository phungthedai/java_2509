package com.vti.entity.day_4_java.Ex5_Qs4;

public class Sach extends TaiLieu {
    private String tenTacGia;
    private int soTrang;

    public Sach(long maTaiLieu, String tenNhaXuatBan, long soBanPhatHanh, int loai, String tenTacGia, int soTrang) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, loai);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public void showTaiLieu() {
        super.showTaiLieu();
        System.out.println("Tên tác giả: " + tenTacGia + "\n số trang: " + soTrang);
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
}
