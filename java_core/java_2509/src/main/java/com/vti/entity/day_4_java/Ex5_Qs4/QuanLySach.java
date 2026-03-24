package com.vti.entity.day_4_java.Ex5_Qs4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class QuanLySach {
    private ArrayList<TaiLieu> danhSachTaiLieu = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void themTaiLieu() {
        int choice;
        while (true) {
            System.out.println("Chọn loại tài liệu: \n1.Sách \n2.Tạp chí \n3.Báo");
            choice = scanner.nextInt();
            scanner.nextLine();
            if (scanner.hasNextInt()) {
                if (choice >= 1 && choice <= 3) {
                    break;
                } else {
                    System.out.println("chọn từ 1 đến 4");
                }
            } else {
                System.out.println("nhập vào số");
            }
        };

        long maTaiLieu = new Date().getTime();

        System.out.println("Nhập Tên Nhà Xuất bản: ");
        String tenNhaXuatBan = scanner.nextLine();

        long soBanPhatHanh;
        while (true) {
            System.out.print("Nhập số bản phát hành: ");
            soBanPhatHanh = scanner.nextLong();
            scanner.nextLine();
            if (scanner.hasNextLong()) {
                if (soBanPhatHanh >= 0) {
                    break;
                } else {
                    System.out.println("Nhập số bản phát hành không được âm");
                }
            } else {
                System.out.println("nhập vào số");
            }
        };


        switch (choice) {
            case 1:
                System.out.println("Nhập tên tác giả: ");
                String tenTacGia = scanner.nextLine();

                int soTrang;
                while (true) {
                    System.out.print("Nhập số trang: ");
                    soTrang = scanner.nextInt();
                    scanner.nextLine();
                    if (scanner.hasNextInt()) {
                        if (soTrang > 0) {
                            break;
                        } else {
                            System.out.println("Số trang không được âm");
                        }
                    } else {
                        System.out.println("nhập vào dạng số");
                    }
                };
                danhSachTaiLieu.add(new Sach(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, choice, tenTacGia, soTrang));
                break;
            case 2:
                System.out.println("Nhập vào số phát hành: ");
                String soPhatHanh = scanner.nextLine();

                int thangPhatHanh;
                while (true) {
                    System.out.print("Nhập tháng phát hành: ");
                    thangPhatHanh = scanner.nextInt();
                    scanner.nextLine();
                    if (scanner.hasNextInt()) {
                        if (thangPhatHanh > 0 && thangPhatHanh <= 12) {
                            break;
                        } else {
                            System.out.println("Số tháng trong khoảng 1 đến 12");
                        }
                    } else {
                        System.out.println("nhập vào dạng số");
                    }
                };
                danhSachTaiLieu.add(new TapChi(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, choice, soPhatHanh, thangPhatHanh));
                break;
            case 3:
                String ngayPhatHanh;
                while (true) {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    simpleDateFormat.setLenient(false);
                    System.out.println("Nhập vào ngày phát hành (dd/mm/yyyy): ");
                    ngayPhatHanh = scanner.nextLine();
                    try {
                        simpleDateFormat.parse(ngayPhatHanh);
                        break;
                    } catch (ParseException e) {
                        System.out.println("Nhập đúng ngày và định dạng");
                    }
                };
                danhSachTaiLieu.add(new Bao(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, choice, ngayPhatHanh));
                break;
        }
    }

    public void xoaTaiLieuTheoMa() {
        System.out.println("Nhập mã tài liệu cần xóa: ");
        long maTaiLieu = scanner.nextLong();
        danhSachTaiLieu.removeIf(tl -> tl.getMaTaiLieu() == maTaiLieu);
    }

    public void hienThiThongTinTaiLieu() {
        for (TaiLieu taiLieu: danhSachTaiLieu) {
            taiLieu.showTaiLieu();
        }
    }

    public void timKiemTheoLoai() {
        int loai = 0;
        while (true) {
            System.out.println("Nhập vào loại (sách, tạp chí, báo): ");
            String loaiNhap = scanner.nextLine().toLowerCase();
            if (loaiNhap.equals("sách")) {
                loai = 1;
            } else if (loaiNhap.equals("tạp chí")) {
                loai = 2;
            } else if (loaiNhap.equals("báo")) {
                loai = 3;
            }

            if (loai != 0) {
                break;
            } else {
                System.out.println("Nhập lại loại");
            }
        }

        for (TaiLieu taiLieu: danhSachTaiLieu) {
            if (taiLieu.getLoai() == loai) {
                taiLieu.showTaiLieu();
            }
        }
    }
}
