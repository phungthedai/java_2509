package org.example.day_6_java.Ex1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class QuanLyTruong {
    static void main(String[] args) {
        String[] ho = {"Phung", "Tran", "Le", "Pham", "Hoang", "Nguyen", "Dang"};

        String[] tenDem = {"Van", "Thi", "Anh", "Duc", "Minh", "Quang", "Huu"};

        String[] ten = {"Anh", "Binh", "Chien", "Dung", "Dai", "Giang", "Hung"};

        ArrayList<String> danhSachTenSinhVien = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String hoTenDayDu = ho[i % 7] + " " + tenDem[(i + 1) % 7] + " " + ten[(i + 2) % 7];
            danhSachTenSinhVien.add(hoTenDayDu);
        }

        ArrayList<String> danhSachIdSinhVien = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String idSv = "SV" + String.format("%07d",i);
            danhSachIdSinhVien.add(idSv);
        }

        LocalDate startDate = LocalDate.of(1991, 2, 1);
        LocalDate endDate = LocalDate.of(1991, 12, 31);
        long startEpochDay = startDate.toEpochDay();
        long endEpochDay = endDate.toEpochDay();
        Set<LocalDate> birthDatesSet = new HashSet<>();
        Random random = new Random();
        while (birthDatesSet.size() < 10) {
            long randomDay = startEpochDay + random.nextInt((int) (endEpochDay - startEpochDay + 1));
            birthDatesSet.add(LocalDate.ofEpochDay(randomDay));
        }
        LocalDate[] arrayNgaySinh = birthDatesSet.toArray(new LocalDate[0]);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        MonHoc phanTichYeuCau = new MonHoc("1", "Phân tích môn học", 5);
        MonHoc thietKePhanMem = new MonHoc("2", "Thiết kế phần mềm", 5);
        MonHoc lapTrinhJava = new MonHoc("3", "Lập trình Java", 7);
        MonHoc codeVaTest = new MonHoc("4", "Code và Unit Test", 2);
        MonHoc managementTool = new MonHoc("5", "Management Tool", 1);


        // sv 1
        SinhVien sinhVien = new SinhVien(
                danhSachTenSinhVien.get(0),
                18,
                "nam",
                arrayNgaySinh[0].format(formatter),
                "Hai Phong",
                danhSachIdSinhVien.get(0),
                HeDaoTao.CAO_DANG,
                HeDaoTao.CAO_DANG.getSoTinChi(),
                "Kinh tế"
        );
        Diem diemPhanTichYeuCau = new Diem(sinhVien, phanTichYeuCau, 9);
        Diem diemThietKePhanMem = new Diem(sinhVien, thietKePhanMem, 8);
        Diem diemLapTrinhJava = new Diem(sinhVien, lapTrinhJava, 9.5);
        Diem diemCodeVaTest = new Diem(sinhVien, codeVaTest, 9);
        Diem diemManagementTool = new Diem(sinhVien, managementTool, 9);

        sinhVien.themBangDiem(diemPhanTichYeuCau);
        sinhVien.themBangDiem(diemThietKePhanMem);
        sinhVien.themBangDiem(diemLapTrinhJava);
        sinhVien.themBangDiem(diemCodeVaTest);
        sinhVien.themBangDiem(diemManagementTool);

        // sv 2
        SinhVien sinhVien1 = new SinhVien(
                danhSachTenSinhVien.get(1),
                18,
                "nam",
                arrayNgaySinh[1].format(formatter),
                "Ha Noi",
                danhSachIdSinhVien.get(1),
                HeDaoTao.DAI_HOC,
                HeDaoTao.DAI_HOC.getSoTinChi(),
                "Công nghệ thông tin"
        );
        Diem diemSV1PhanTichYeuCau = new Diem(sinhVien1, phanTichYeuCau, 7);
        Diem diemSV1ThietKePhanMem = new Diem(sinhVien1, thietKePhanMem, 8.7);
        Diem diemSV1LapTrinhJava = new Diem(sinhVien1, lapTrinhJava, 6);
        Diem diemSV1CodeVaTest = new Diem(sinhVien1, codeVaTest, 2);
        Diem diemSV1ManagementTool = new Diem(sinhVien1, managementTool, 3);

        sinhVien1.themBangDiem(diemSV1PhanTichYeuCau);
        sinhVien1.themBangDiem(diemSV1ThietKePhanMem);
        sinhVien1.themBangDiem(diemSV1LapTrinhJava);
        sinhVien1.themBangDiem(diemSV1CodeVaTest);
        sinhVien1.themBangDiem(diemSV1ManagementTool);



        // sv 3
        SinhVien sinhVien2 = new SinhVien(
                danhSachTenSinhVien.get(2),
                18,
                "nư",
                arrayNgaySinh[2].format(formatter),
                "Hai Phong",
                danhSachIdSinhVien.get(2),
                HeDaoTao.CAO_DANG,
                HeDaoTao.CAO_DANG.getSoTinChi(),
                "Ngân Hàng"
        );
        Diem diemSV2PhanTichYeuCau = new Diem(sinhVien2, phanTichYeuCau, 9.1);
        Diem diemSV2ThietKePhanMem = new Diem(sinhVien2, thietKePhanMem, 1);
        Diem diemSV2LapTrinhJava = new Diem(sinhVien2, lapTrinhJava, 0);
        Diem diemSV2CodeVaTest = new Diem(sinhVien2, codeVaTest, 2);
        Diem diemSV2ManagementTool = new Diem(sinhVien2, managementTool, 5);


        sinhVien2.themBangDiem(diemSV2PhanTichYeuCau);
        sinhVien2.themBangDiem(diemSV2ThietKePhanMem);
        sinhVien2.themBangDiem(diemSV2LapTrinhJava);
        sinhVien2.themBangDiem(diemSV2CodeVaTest);
        sinhVien2.themBangDiem(diemSV2ManagementTool);

        // sv 4
        SinhVien sinhVien3 = new SinhVien(
                danhSachTenSinhVien.get(3),
                18,
                "nư",
                arrayNgaySinh[3].format(formatter),
                "Ha Noi",
                danhSachIdSinhVien.get(3),
                HeDaoTao.DAI_HOC,
                HeDaoTao.DAI_HOC.getSoTinChi(),
                "Địa Chất"
        );

        Diem diemSV3PhanTichYeuCau = new Diem(sinhVien3, phanTichYeuCau, 2.3);
        Diem diemSV3ThietKePhanMem = new Diem(sinhVien3, thietKePhanMem, 3);
        Diem diemSV3LapTrinhJava = new Diem(sinhVien3, lapTrinhJava, 9.9);
        Diem diemSV3CodeVaTest = new Diem(sinhVien3, codeVaTest, 4);
        Diem diemSV3ManagementTool = new Diem(sinhVien3, managementTool, 3);

        sinhVien3.themBangDiem(diemSV3PhanTichYeuCau);
        sinhVien3.themBangDiem(diemSV3ThietKePhanMem);
        sinhVien3.themBangDiem(diemSV3LapTrinhJava);
        sinhVien3.themBangDiem(diemSV3CodeVaTest);
        sinhVien3.themBangDiem(diemSV3ManagementTool);


        // sv 5
        SinhVien sinhVien4 = new SinhVien(
                danhSachTenSinhVien.get(4),
                20,
                "nam",
                arrayNgaySinh[4].format(formatter),
                "Quang Ninh",
                danhSachIdSinhVien.get(4),
                HeDaoTao.CAO_DANG,
                HeDaoTao.CAO_DANG.getSoTinChi(),
                "Công nghệ thông tin"
        );
        Diem diemSV4PhanTichYeuCau = new Diem(sinhVien4, phanTichYeuCau, 10);
        Diem diemSV4ThietKePhanMem = new Diem(sinhVien4, thietKePhanMem, 9);
        Diem diemSV4LapTrinhJava = new Diem(sinhVien4, lapTrinhJava, 7);
        Diem diemSV4CodeVaTest = new Diem(sinhVien4, codeVaTest, 8.2);
        Diem diemSV4ManagementTool = new Diem(sinhVien4, managementTool, 9);

        sinhVien4.themBangDiem(diemSV4PhanTichYeuCau);
        sinhVien4.themBangDiem(diemSV4ThietKePhanMem);
        sinhVien4.themBangDiem(diemSV4LapTrinhJava);
        sinhVien4.themBangDiem(diemSV4CodeVaTest);
        sinhVien4.themBangDiem(diemSV4ManagementTool);

        // sv 6
        SinhVien sinhVien5 = new SinhVien(
                danhSachTenSinhVien.get(5),
                18,
                "nam",
                arrayNgaySinh[5].format(formatter),
                "Hai Phong",
                danhSachIdSinhVien.get(5),
                HeDaoTao.DAI_HOC,
                HeDaoTao.DAI_HOC.getSoTinChi(),
                "Công nghệ thông tin"
        );
        Diem diemSV5PhanTichYeuCau = new Diem(sinhVien5, phanTichYeuCau, 9);
        Diem diemSV5ThietKePhanMem = new Diem(sinhVien5, thietKePhanMem, 9);
        Diem diemSV5LapTrinhJava = new Diem(sinhVien5, lapTrinhJava, 9.5);
        Diem diemSV5CodeVaTest = new Diem(sinhVien5, codeVaTest, 9);
        Diem diemSV5ManagementTool = new Diem(sinhVien5, managementTool, 9);

        sinhVien5.themBangDiem(diemSV5PhanTichYeuCau);
        sinhVien5.themBangDiem(diemSV5ThietKePhanMem);
        sinhVien5.themBangDiem(diemSV5LapTrinhJava);
        sinhVien5.themBangDiem(diemSV5CodeVaTest);
        sinhVien5.themBangDiem(diemSV5ManagementTool);


        // sv 7
        SinhVien sinhVien6 = new SinhVien(
                danhSachTenSinhVien.get(6),
                21,
                "nam",
                arrayNgaySinh[6].format(formatter),
                "Bac Ninh",
                danhSachIdSinhVien.get(6),
                HeDaoTao.CAO_DANG,
                HeDaoTao.CAO_DANG.getSoTinChi(),
                "Công nghệ thông tin"
        );
        Diem diemSV6PhanTichYeuCau = new Diem(sinhVien6, phanTichYeuCau, 7);
        Diem diemSV6ThietKePhanMem = new Diem(sinhVien6, thietKePhanMem, 8);
        Diem diemSV6LapTrinhJava = new Diem(sinhVien6, lapTrinhJava, 6.5);
        Diem diemSV6CodeVaTest = new Diem(sinhVien6, codeVaTest, 5);
        Diem diemSV6ManagementTool = new Diem(sinhVien6, managementTool, 5);

        sinhVien6.themBangDiem(diemSV6PhanTichYeuCau);
        sinhVien6.themBangDiem(diemSV6ThietKePhanMem);
        sinhVien6.themBangDiem(diemSV6LapTrinhJava);
        sinhVien6.themBangDiem(diemSV6CodeVaTest);
        sinhVien6.themBangDiem(diemSV6ManagementTool);

        // sv 8
        SinhVien sinhVien7 = new SinhVien(
                danhSachTenSinhVien.get(7),
                18,
                "nư",
                arrayNgaySinh[7].format(formatter),
                "Thanh Hoa",
                danhSachIdSinhVien.get(7),
                HeDaoTao.DAI_HOC,
                HeDaoTao.DAI_HOC.getSoTinChi(),
                "Công nghệ thông tin"
        );
        Diem diemSV7PhanTichYeuCau = new Diem(sinhVien7, phanTichYeuCau, 4);
        Diem diemSV7ThietKePhanMem = new Diem(sinhVien7, thietKePhanMem, 5);
        Diem diemSV7LapTrinhJava = new Diem(sinhVien7, lapTrinhJava, 7.5);
        Diem diemSV7CodeVaTest = new Diem(sinhVien7, codeVaTest, 4);
        Diem diemSV7ManagementTool = new Diem(sinhVien7, managementTool, 6);

        sinhVien7.themBangDiem(diemSV7PhanTichYeuCau);
        sinhVien7.themBangDiem(diemSV7ThietKePhanMem);
        sinhVien7.themBangDiem(diemSV7LapTrinhJava);
        sinhVien7.themBangDiem(diemSV7CodeVaTest);
        sinhVien7.themBangDiem(diemSV7ManagementTool);

        // sv 9
        SinhVien sinhVien8 = new SinhVien(
                danhSachTenSinhVien.get(8),
                18,
                "nam",
                arrayNgaySinh[8].format(formatter),
                "Ha Tinh",
                danhSachIdSinhVien.get(8),
                HeDaoTao.CAO_DANG,
                HeDaoTao.CAO_DANG.getSoTinChi(),
                "Công nghệ thông tin"
        );
        Diem diemSV8PhanTichYeuCau = new Diem(sinhVien8, phanTichYeuCau, 6.5);
        Diem diemSV8ThietKePhanMem = new Diem(sinhVien8, thietKePhanMem, 2);
        Diem diemSV8LapTrinhJava = new Diem(sinhVien8, lapTrinhJava, 7);
        Diem diemSV8CodeVaTest = new Diem(sinhVien8, codeVaTest, 4);
        Diem diemSV8ManagementTool = new Diem(sinhVien8, managementTool, 9);

        sinhVien8.themBangDiem(diemSV8PhanTichYeuCau);
        sinhVien8.themBangDiem(diemSV8ThietKePhanMem);
        sinhVien8.themBangDiem(diemSV8LapTrinhJava);
        sinhVien8.themBangDiem(diemSV8CodeVaTest);
        sinhVien8.themBangDiem(diemSV8ManagementTool);

        // sv 10
        SinhVien sinhVien9 = new SinhVien(
                danhSachTenSinhVien.get(9),
                20,
                "nư",
                arrayNgaySinh[9].format(formatter),
                "Nghe An",
                danhSachIdSinhVien.get(9),
                HeDaoTao.DAI_HOC,
                HeDaoTao.DAI_HOC.getSoTinChi(),
                "Công nghệ thông tin"
        );
        Diem diemSV9PhanTichYeuCau = new Diem(sinhVien9, phanTichYeuCau, 4);
        Diem diemSV9ThietKePhanMem = new Diem(sinhVien9, thietKePhanMem, 7);
        Diem diemSV9LapTrinhJava = new Diem(sinhVien9, lapTrinhJava, 6.5);
        Diem diemSV9CodeVaTest = new Diem(sinhVien9, codeVaTest, 9);
        Diem diemSV9ManagementTool = new Diem(sinhVien9, managementTool, 5);

        sinhVien9.themBangDiem(diemSV9PhanTichYeuCau);
        sinhVien9.themBangDiem(diemSV9ThietKePhanMem);
        sinhVien9.themBangDiem(diemSV9LapTrinhJava);
        sinhVien9.themBangDiem(diemSV9CodeVaTest);
        sinhVien9.themBangDiem(diemSV9ManagementTool);



        ArrayList<SinhVien> listSinhvien = new ArrayList<>();
        listSinhvien.add(sinhVien1);
        listSinhvien.add(sinhVien2);
        listSinhvien.add(sinhVien3);
        listSinhvien.add(sinhVien4);
        listSinhvien.add(sinhVien5);
        listSinhvien.add(sinhVien6);
        listSinhvien.add(sinhVien7);
        listSinhvien.add(sinhVien8);
        listSinhvien.add(sinhVien9);


        String headerFormat = "%-20s %-12s %-12s %-4s %-4s %-4s %-4s %-4s %-4s%n";
        String rowFormat    = "%-20s %-12s %-12s %-4.1f %-4.1f %-4.1f %-4.1f %-4.1f %-4.1f%n";

        System.out.printf(headerFormat, "Full Name", "ID", "Date", "PTYC", "TKPM", "LTJ", "CT", "MT", "Avg");
        System.out.println("-------------------------------------------------------------------------------");
        for (SinhVien sv: listSinhvien) {
            double PTYC = sv.getDiemTheoTen("Phân tích môn học");
            double TKPM = sv.getDiemTheoTen("Thiết kế phần mềm");
            double LTJ = sv.getDiemTheoTen("Lập trình Java");
            double CT = sv.getDiemTheoTen("Code và Unit Test");
            double MT = sv.getDiemTheoTen("Management Tool");
            System.out.printf(rowFormat,  sv.ten, sv.getMaSv(), sv.ngaySinh, PTYC , TKPM, LTJ, CT, MT, sv.tinhDiemTB());
        }


    }
}
