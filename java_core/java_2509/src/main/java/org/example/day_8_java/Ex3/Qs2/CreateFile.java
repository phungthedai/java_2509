package org.example.day_8_java.Ex3.Qs2;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public void createNewFile(String pathFile) throws IOException {
        File file = new File(pathFile);
        if (file.createNewFile()) {
            System.out.println("Tao thanh cong");
        }
    }

    public void createNewFile(String pathFile, String fileName) throws IOException {
        File file = new File(pathFile + "\\" + fileName);
        if (file.createNewFile()) {
            System.out.println("Tao thanh cong");
        }
    }
}
