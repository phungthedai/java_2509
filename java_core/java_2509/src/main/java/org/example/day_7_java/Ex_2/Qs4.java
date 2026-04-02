package org.example.day_7_java.Ex_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Qs4 {
    static int[] department = {1,2,3};
    static void main(String[] args) {
        int a = getIndex(10);
    }

    public static int getIndex(int index){
        int idx = 0;
        try {
            idx = department[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Cannot find department.");
        }
        return idx;
    }


}
