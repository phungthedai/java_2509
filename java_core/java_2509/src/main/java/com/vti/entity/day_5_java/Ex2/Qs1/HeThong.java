package com.vti.entity.day_5_java.Ex2.Qs1;

import com.vti.entity.day_5_java.Ex1.Qs1.New;

import java.util.ArrayList;
import java.util.Scanner;

public class HeThong {
    static void main(String[] args) {
        ArrayList<Student> listStudent = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Tao học sinh và chia nhóm");
            System.out.println("2. Kêu gọi cả lớp điểm danh.");
            System.out.println("3. Gọi nhóm 1 đi học bài");
            System.out.println("4. Gọi nhóm 2 đi dọn vệ sinh");
            System.out.println("5. Thoát");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (scanner.hasNextInt()) {
                if ( choice >= 1 && choice <= 5) {
                    switch (choice) {
                        case 1:
                            for (int i = 1; i <= 10; i++) {
                                System.out.println("nhập nhom: ");
                                int group = scanner.nextInt();
                                scanner.nextLine();
                                listStudent.add(new Student(i, "Nguyễn Văn" + i, group));
                            }
                            break;
                        case 2:
                            for (Student student: listStudent) {
                                student.diemDanh();
                            }
                            break;
                        case 3:
                            for (Student student: listStudent) {
                                if (student.group == 1) {
                                    student.hocBai();
                                }
                            }
                            break;
                        case 4:
                            for (Student student: listStudent) {
                                if (student.group == 2) {
                                    student.donVeSinh();
                                }
                            }
                            break;
                        case 5:
                            return;
                    }
                } else System.out.println("Nhập số từ 1 đến 5");
            } else System.out.println("Nhập số từ 1 đến 5");
        }
    }
}
