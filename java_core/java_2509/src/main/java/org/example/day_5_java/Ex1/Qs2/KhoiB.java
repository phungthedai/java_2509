package org.example.day_5_java.Ex1.Qs2;

public class KhoiB extends ThiSinh {
    public KhoiB(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Thí Sinh Khối A: Toán, Hóa, Sinh");
    }
}
