package org.example.day_6_java.Ex1;

public class MonHoc {
    private String id;
    private String name;
    private int soTin;

    public MonHoc(String id, String name, int soTin) {
        this.id = id;
        this.name = name;
        this.soTin = soTin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSoTin() {
        return soTin;
    }

    public void setSoTin(int soTin) {
        this.soTin = soTin;
    }
}
