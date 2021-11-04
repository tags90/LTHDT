package com.nhannc2008110306.kiemtragiuaki;

public class NhanVien extends Nguoi{
    private float heSoLuong;
    public NhanVien(){
        super();
    }
    public NhanVien(String hoTen, String diaChi, float heSoLuong) {
        super(hoTen, diaChi);
        this.heSoLuong = heSoLuong;
    }    
    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
    protected float tinhLuong(){
        if (0 >=this.heSoLuong ){
            return this.heSoLuong *1500000;
        }
        return 0;
    }
    public String toString() {
        return "Luong NhanVien= " + tinhLuong();
    }
    
}
