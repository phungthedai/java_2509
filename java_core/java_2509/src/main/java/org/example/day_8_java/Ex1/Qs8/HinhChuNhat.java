package org.example.day_8_java.Ex1.Qs8;

public class HinhChuNhat extends HinhHoc{
    private double dai;
    private double rong;

    public HinhChuNhat(double dai, double rong) throws HinhHocException {
        super();
        this.dai = dai;
        this.rong = rong;
    }

    @Override
    public double tinhChuVi() {
        return 2 * (dai + rong);
    }

    @Override
    public double tinhDienTich() {
        return dai * rong;
    }
}
