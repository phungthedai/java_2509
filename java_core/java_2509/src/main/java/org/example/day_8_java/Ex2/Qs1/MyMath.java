package org.example.day_8_java.Ex2.Qs1;

public class MyMath {
    private final float soPi = 3.14f;

    void main(String[] args) {
        System.out.println(this.sum(10));
    }
    public float sum(int a){
        return a + soPi;
    }
}
