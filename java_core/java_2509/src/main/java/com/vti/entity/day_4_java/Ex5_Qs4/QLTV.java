package com.vti.entity.day_4_java.Ex5_Qs4;

import java.util.Scanner;

public class QLTV {
    static void main(String[] args) {
        QuanLySach quanLySach = new QuanLySach();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Thêm tài liệu");
            System.out.println("2. xóa tài liệu theo mã");
            System.out.println("3. Hiển thị thông tin tài liệu");
            System.out.println("4. Tìm kiếm tài liệu theo loại");
            System.out.println("5. Thoát");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (scanner.hasNextInt()) {
                if ( choice >= 1 && choice <= 5) {
                    switch (choice) {
                        case 1:
                            quanLySach.themTaiLieu();
                            break;
                        case 2:
                            quanLySach.xoaTaiLieuTheoMa();
                            break;
                        case 3:
                            quanLySach.hienThiThongTinTaiLieu();
                            break;
                        case 4:
                            quanLySach.timKiemTheoLoai();
                            break;
                        case 5:
                            return;
                    }
                } else System.out.println("Nhập số từ 1 đến 5");
            } else System.out.println("Nhập số từ 1 đến 5");
        }
    }
}
