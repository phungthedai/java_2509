package com.vti.frontend;

import com.vti.backend.Excercise1;
import com.vti.entity.Student;

public class Program1 {
    static void main(String[] args) {
        Student student = new Student("Daiphung", "Hà Nội");
        student.showProfile();

        student.setPoint(5);
        student.showProfile();

        student.countPoint(2);
        student.showProfile();

        student.countPoint(1);
        student.showProfile();
    }
}
