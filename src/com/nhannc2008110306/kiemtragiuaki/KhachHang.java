package com.nhannc2008110306.kiemtragiuaki;

public class KhachHang extends Nguoi{
    private String tenCongTy;
    private double triGiaHoaDon;
    public KhachHang(){
        super();
    }
    
    public KhachHang(String hoTen, String diaChi, String tenCongTy, double triGiaHoaDon) {
        super(hoTen, diaChi);
        this.tenCongTy = tenCongTy;
        this.triGiaHoaDon = triGiaHoaDon;
    }
    
    public String getTenCongTy() {
        return tenCongTy;
    }

    public void setTenCongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
    }

    public double getTriGiaHoaDon() {
            return triGiaHoaDon;
    }

    public void setTriGiaHoaDon(double triGiaHoaDon) {
        this.triGiaHoaDon = triGiaHoaDon;
    }

    public String toString() {
        return "KhachHang tenCongTy=" + this.tenCongTy + ", triGiaHoaDon=" + this.triGiaHoaDon;
    }    
}
