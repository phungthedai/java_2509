package com.vti.entity.day_4_java.Ex5_Qs1;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyCanBo {
    static void main(String[] args) {

    }

    private ArrayList<CanBo> danhSach = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void themCanBo() {
        int choice;
        while (true) {
            System.out.println("Chọn loại cán bộ: \n1.Cán Bộ \n2.Công nhân \n3.Kỹ sư \n 3.Nhân viên");
            choice = scanner.nextInt();
            scanner.nextLine();
            if (scanner.hasNextInt()) {
                if (choice >= 1 && choice <= 4) {
                    break;
                } else {
                    System.out.println("chọn từ 1 đến 4");
                }
            } else {
                System.out.println("nhập vào số");
            }
        };

        System.out.print("Nhập họ tên: ");
        String hoTen = scanner.nextLine();

        int tuoi;
        while (true) {
            System.out.print("Nhập tuổi: ");
            tuoi = scanner.nextInt();
            scanner.nextLine();
            if (scanner.hasNextInt()) {
                if (tuoi >= 0) {
                    break;
                } else {
                    System.out.println("Tuổi không được âm");
                }
            } else {
                System.out.println("nhập vào dạng số");
            }
        };

        GioiTinh gioiTinh;
        while (true) {
            System.out.print("Nhập giới tính (NAM, NU, KHAC): ");
            gioiTinh = GioiTinh.valueOf(scanner.nextLine().toUpperCase());;
            if (gioiTinh == GioiTinh.NAM || gioiTinh == GioiTinh.NU || gioiTinh == GioiTinh.KHAC) {
                break;
            } else {
                System.out.println("Nhập lại giới tính");
            }
        };


        System.out.print("Nhập địa chỉ: ");
        String diaChi = scanner.nextLine();

        switch (choice) {
            case 2:
                int bac;
                while (true) {
                    System.out.print("Nhập bậc (1 -> 10): ");
                    bac = scanner.nextInt();
                    scanner.nextLine();
                    if (scanner.hasNextInt()) {
                        if (bac > 0 && bac <= 10) {
                            break;
                        } else {
                            System.out.println("Nhập lại");
                        }
                    } else {
                        System.out.println("nhập vào số");
                    }
                };
                danhSach.add(new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac));
                break;
            case 3:
                System.out.println("Nhập vào ngành đào tạo: ");
                String major = scanner.nextLine();
                danhSach.add(new KySu(hoTen, tuoi, gioiTinh, diaChi, major));
                break;
            case 4:
                System.out.println("Nhập vào ngành đào tạo: ");
                String work = scanner.nextLine();
                danhSach.add(new NhanVien(hoTen, tuoi, gioiTinh, diaChi, work));
                break;
            default:
                danhSach.add(new CanBo(hoTen, tuoi, gioiTinh, diaChi));
                break;
        }
    }

    public void timKiemCanBo() {
        System.out.println("Nhập tên cán bộ cần tim kiếm: ");
        String name = scanner.nextLine();
        for (CanBo cb : danhSach) {
            if (cb.getHoTen().toLowerCase().contains(name.toLowerCase())) {
                cb.hienThiThongTin();
            }
        }
    }

    public void hienThiDanhSachCanBo() {
        int index = 1;
        for (CanBo cb : danhSach) {
            System.out.println("Cán bộ số " + index + ":");
            cb.hienThiThongTin();
            index++;
        }
    }

    public void xoaCanBoTheoTen() {
        System.out.println("Nhập tên cán bộ cần xóa: ");
        String name = scanner.nextLine();
        danhSach.removeIf(canBo -> canBo.getHoTen().equals(name));
    }

}
