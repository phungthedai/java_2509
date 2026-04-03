package org.example.day_8_java.Ex1.Qs1;

public class SecondaryStudent extends Student{
    private static int countSecondaryStudent = 0;
    public SecondaryStudent(int id, String name) {
        super(id, name);
        countSecondaryStudent++;
    }

    public static int getCountSecondaryStudent() {
        return countSecondaryStudent;
    }
}
