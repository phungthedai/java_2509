package org.example.day_4_java.Ex5_Qs1;

import java.util.Scanner;

public class HeThong {
    static void main(String[] args) {
        QuanLyCanBo quanLyCanBo = new QuanLyCanBo();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Thêm cán bộ");
            System.out.println("2. Tìm kiếm");
            System.out.println("3. Hiển thị danh sách");
            System.out.println("4. Xóa cán bộ");
            System.out.println("5. Thoát");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (scanner.hasNextInt()) {
                if ( choice >= 1 && choice <= 5) {
                    switch (choice) {
                        case 1:
                            quanLyCanBo.themCanBo();
                            break;
                        case 2:
                            quanLyCanBo.timKiemCanBo();
                            break;
                        case 3:
                            quanLyCanBo.hienThiDanhSachCanBo();
                            break;
                        case 4:
                            quanLyCanBo.xoaCanBoTheoTen();
                            break;
                        case 5:
                            return;
                    }
                } else System.out.println("Nhập số từ 1 đến 5");
            } else System.out.println("Nhập số từ 1 đến 5");
        }
    }
}
