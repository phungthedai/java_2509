package org.example.day_8_java.Ex1.Qs1;

public class PrimaryStudent extends Student{
    private static int countPrimaryStudent = 0;
    public PrimaryStudent(int id, String name) {
        super(id, name);
        countPrimaryStudent++;
    }

    public static int getCountPrimaryStudent() {
        return countPrimaryStudent;
    }
}
