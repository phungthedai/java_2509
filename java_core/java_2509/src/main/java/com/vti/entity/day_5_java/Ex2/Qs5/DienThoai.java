package com.vti.entity.day_5_java.Ex2.Qs5;

public abstract class DienThoai implements IVuKhi {
    public void nghe() {
        System.out.println(" đang nghe điện");
    }

    public void goi() {
        System.out.println(" đang gọi điện");
    }

    public void guiTinNhan() {
        System.out.println(" gửi tin nhắn");
    }

    public void nhanTinNhan() {
        System.out.println(" nhận tin nhắn");
    }

    @Override
    public void tanCongKeXau() {
        System.out.println(" dùng làm vũ khí");
    }
}
