package com.vti.entity.day_4_java.Ex5_Qs3;

public class HighSchoolStudent extends Student {
    private String clazz;
    private String desiredUniversity ;

    public HighSchoolStudent(int id, String name, String clazz, String desiredUniversity) {
        super(name, id);
        this.clazz = clazz;
        this.desiredUniversity = desiredUniversity;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getDesiredUniversity() {
        return desiredUniversity;
    }

    public void setDesiredUniversity(String desiredUniversity) {
        this.desiredUniversity = desiredUniversity;
    }

    public void showHighSchoolStudent() {
        super.showStudent();
        System.out.println("class: " + clazz + "\n desired university: " + desiredUniversity);
    }
}
