package org.example.day_8_java.Ex1.Qs1;

public class Student {
    private int id;
    private String name;
    private static String college;
    private static double moneyGroup = 0;
    private static int countStudent = 0;
    private static final int maxStudent = 7;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        countStudent++;
    }

    public static int getMaxStudent() {
        return maxStudent;
    }

    public static int getCountStudent() {
        return countStudent;
    }

    public static double getMoneyGroup(double moneyGroup) {
        Student.moneyGroup -= moneyGroup;
        return Student.moneyGroup;
    }

    public static void setMoneyGroup(double moneyGroup) {
        Student.moneyGroup += moneyGroup;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    Question 4: tiếp tục Question 1
//    Trong class Student
//    a) Viết method cho phép thay đổi college
//    b) Viết method cho phép lấy giá trị của college


    public static String getCollege() {
        return college;
    }

    public static void setCollege(String college) {
        Student.college = college;
    }
}
