package org.example.day_6_java.Ex1;

import java.util.ArrayList;

public class SinhVien extends Person implements IHocTap{
    private String maSv;
    private HeDaoTao heDaoTao;
    private int soTinChiDaHoc;
    private String chuyenNganh;
    private HocPhi hocPhi;
    private ArrayList<CauLacBo> cauLacBos = new ArrayList<>();
    private ArrayList<Diem> bangDiems = new ArrayList<>();
    private ArrayList<LopHoc> lopList = new ArrayList<>();

    public SinhVien(String ten, int tuoi, String gioiTinh, String ngaySinh, String diaChi, String maSv, HeDaoTao heDaoTao, int soTinChiDaHoc, String chuyenNganh) {
        super(ten, tuoi, gioiTinh, ngaySinh, diaChi);
        this.maSv = maSv;
        this.heDaoTao = heDaoTao;
        this.soTinChiDaHoc = soTinChiDaHoc;
        this.chuyenNganh = chuyenNganh;
        this.hocPhi = new HocPhi(this, 0, 0);
    }


    public void dangKyLop(LopHoc lop) {
        if (!lopList.contains(lop)) {
            lopList.add(lop);
            lop.themSinhVien(this);
        }
    }

    public void xemLop() {
        lopList.forEach(l -> {
            l.getTenLop();
        });
    }

    public void doHomework() {
        System.out.println("Sinh viên " + ten + " đang làm bài tập về nhà.");
    }

    @Override
    public void hocBai() {
        System.out.println(ten + " đang học bài");
    }

    @Override
    public void displayInfo() {
        System.out.println("SV: " + ten + " - " + heDaoTao);
    }

    public String getMaSv() {
        return maSv;
    }

    public String getTen() {
        return ten;
    }
    public void themBangDiem(Diem bangDiem) {
        bangDiems.add(bangDiem);
    }
    public void xemBangDiem() {
        for (Diem bangDiem: bangDiems) {
            bangDiem.toString();
        }
    }
    public void xemHocPhi() {
        hocPhi.xemHocPhi();
    }

    public void dangKyCLB(CauLacBo cauLacBo) {
        cauLacBos.add(cauLacBo);
    }

    public double getDiemTheoTen(String ten) {
        double diem = 0;
        for (int i = 0; i < bangDiems.size(); i++) {
            if (bangDiems.get(i).getMonHoc().getName().equals(ten)) {
                 diem = bangDiems.get(i).getDiem();
                 break;
            }
        }
        return diem;
    }

    public double tinhDiemTB() {
        double tongDiem = 0;
        for (Diem diem: bangDiems){
            tongDiem += diem.getDiem();
        }
        return tongDiem/bangDiems.size();
    }
}
