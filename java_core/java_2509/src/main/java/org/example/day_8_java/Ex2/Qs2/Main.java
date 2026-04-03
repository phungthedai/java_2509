package org.example.day_8_java.Ex2.Qs2;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {

        ArrayList<Student> listStudent = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            if (i < 2) {
                listStudent.add(new PrimaryStudent(i, "Nguyễn Văn" + i));
            } else listStudent.add(new SecondaryStudent(i, "Nguyễn Văn" + i));
        }
        for (Student student: listStudent) {
            student.study();
        }
    }
}
