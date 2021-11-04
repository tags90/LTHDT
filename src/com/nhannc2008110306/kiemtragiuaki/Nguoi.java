package com.nhannc2008110306.kiemtragiuaki;

public class Nguoi extends DanhSachQuanLy{
    private String hoTen;
    private String diaChi;
    public Nguoi(){
    }
    public Nguoi(String hoTen, String diaChi) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }
    
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    @Override
    public String toString() {
        return "hoTen=" + hoTen + "diaChi=" + diaChi;
    }    
     
}
