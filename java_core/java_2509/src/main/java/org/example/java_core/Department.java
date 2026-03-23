package org.example.java_core;

public class Department {
    int departmentId;
    String departmentName;
    String address;

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public Department() {
    }

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.departmentId = 0;
    }
}
