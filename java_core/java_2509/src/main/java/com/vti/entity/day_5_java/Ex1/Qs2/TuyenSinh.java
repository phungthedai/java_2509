package com.vti.entity.day_5_java.Ex1.Qs2;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh implements ITuyenSinh {
    private ArrayList<ThiSinh> danhSachThiSinh = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void themMoiThiSinh() {
        System.out.print("Nhập SBD: ");
        String sbd = scanner.nextLine();
        System.out.print("Nhập tên: ");
        String ten = scanner.nextLine();
        System.out.print("Địa chỉ: ");
        String diaChi = scanner.nextLine();
        System.out.print("Ưu tiên: ");
        int ut = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Chọn khối A/B/C: ");
        String khoi = scanner.nextLine();

        if (khoi.equalsIgnoreCase("A")) {
            danhSachThiSinh.add(new KhoiA(sbd, ten, diaChi, ut));
        } else if (khoi.equalsIgnoreCase("B")) {
            danhSachThiSinh.add(new KhoiB(sbd, ten, diaChi, ut));
        } else {
            danhSachThiSinh.add(new KhoiC(sbd, ten, diaChi, ut));
        }
    }

    @Override
    public void hienThiSanhSachThiSinh() {
        for (ThiSinh ts: danhSachThiSinh) {
            ts.hienThiThongTin();
        }
    }

    @Override
    public void timKiemThiSinh() {
        System.out.print("Nhập SBD cần tìm: ");
        String sbd = scanner.nextLine();
        boolean key = false;
        for (ThiSinh thiSinh : danhSachThiSinh) {
            if (thiSinh.getSoBaoDanh().equals(sbd)) {
                key = true;
                thiSinh.hienThiThongTin();
                break;
            }
        }
        if (!key) {
            System.out.println("Không tìm thấy thí sinh");
        }
    }
}
