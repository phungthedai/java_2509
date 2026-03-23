package com.vti.entity;

public class Department {
    private int departmentId;
    private String departmentName;
    private String address;

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getAddress() {
        return address;
    }

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
