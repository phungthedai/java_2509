package org.example.day_8_java.Ex3.Qs1;

import java.io.File;

public class CheckFile {
    void main(String[] args) {
        System.out.println(checkFile("C:\\Users\\daiph\\OneDrive\\Máy tính\\java_2509\\java_core\\java_2509\\src\\main\\java\\org\\example\\day_8_java\\Ex3\\Qs1\\CheckFile.java"));
    }
    public boolean checkFile(String path) {
        File file = new File(path);
        return file.exists();
    }
}
