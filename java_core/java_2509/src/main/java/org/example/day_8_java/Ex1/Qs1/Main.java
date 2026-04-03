package org.example.day_8_java.Ex1.Qs1;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {

        ArrayList<Student> listStudent = new ArrayList<>();

        Student.setCollege("Đại học bách khoa");

        for (int i = 0; i < Student.getMaxStudent(); i++) {
            if (i < 2) {
                listStudent.add(new PrimaryStudent(i, "Nguyễn Văn" + i));
            } else listStudent.add(new SecondaryStudent(i, "Nguyễn Văn" + i));
        }

        System.out.println(Student.getCountStudent());
        System.out.println(PrimaryStudent.getCountPrimaryStudent());
        System.out.println(SecondaryStudent.getCountSecondaryStudent());

//        for (Student student: listStudent) {
//            System.out.println(student.getId());
//            System.out.println(student.getName());
//            System.out.println(Student.getCollege());
//        }
//
//        Student.setCollege("Đại học công nghệ");

//        for (Student student: listStudent) {
//            Student.setMoneyGroup(100);
//        }
//
//        System.out.println("std 1 lấy 50k");
//        System.out.println(Student.getMoneyGroup(50));
//
//        System.out.println("std 2 lấy 50k");
//        System.out.println(Student.getMoneyGroup(50));
//
//        System.out.println("std 1 lấy 150k");
//        System.out.println(Student.getMoneyGroup(150));
//
//        for (Student student: listStudent) {
//            Student.setMoneyGroup(50);
//        }
//
//        System.out.println("số tiên con lai");
//        System.out.println(Student.getMoneyGroup(0));
    }
}
