package com.vti.entity;

public class Student {
    private int id;
    private String name;
    private String hometown;
    private float point;

    public void setPoint(float point) {
        if (point < 0) {
            this.point = 0;
        } else this.point = point;
    }

    public void countPoint(int pointCount) {
        this.point += pointCount;
    }

    public void showProfile() {
        String profileText = "ten: " + this.name + "\n" + "điểm: ";
        if (this.point >= 8) {
            profileText += "Giỏi";
        } else if (this.point > 6 && this.point < 8) {
            profileText += "Khá";
        } else if (this.point > 4 && this.point < 6) {
            profileText += "Trung Bình";
        } else {
            profileText += "Yếu";
        }
        System.out.println(profileText);
    }
    public Student(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
        this.point = 0;
    }
}
