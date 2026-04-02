package org.example.java_core;

import org.example.day_7_java.Ex_2.ScannerUtils;
public class Department {
    int departmentId;
    String departmentName;
    String address;

    ScannerUtils scannerUtils = new ScannerUtils();
    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public Department() {
        while (true) {
            int id = scannerUtils.inputInt("nhập vào số lơn hơn 0");
            if (id > 0) {
                this.departmentId = id;
                break;
            }
        }

        System.out.println("Nhập Name: ");
        this.departmentName = scannerUtils.inputString();
    }



    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.departmentId = 0;
    }
}
