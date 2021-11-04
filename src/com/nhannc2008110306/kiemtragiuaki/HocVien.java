package com.nhannc2008110306.kiemtragiuaki;

public class HocVien extends Nguoi{
    private float diemMonHoc1;
    private float diemMonHoc2;
    private static int soLuongHV;
    public HocVien(){
        super();
    }
    public HocVien(String hoTen, String diaChi, float diemMonHoc1, float diemMonHoc2) {
        super(hoTen, diaChi);
        this.diemMonHoc1 = diemMonHoc1;
        this.diemMonHoc2 = diemMonHoc2;
    }
    public float getDiemMonHoc1() {
        return diemMonHoc1;
    }
    public void setDiemMonHoc1(float diemMonHoc1) {
        this.diemMonHoc1 = diemMonHoc1;
    }
    public float getDiemMonHoc2() {
        return diemMonHoc2;
    }
    public void setDiemMonHoc2(float diemMonHoc2) {
        this.diemMonHoc2 = diemMonHoc2;
    }
    public static int getSoLuongHV() {
        return soLuongHV;
    }
    public static void setSoLuongHV(int soLuongHV) {
        HocVien.soLuongHV = soLuongHV;
    }
    protected float diemTB(){
        if (0>= this.diemMonHoc1 && this.diemMonHoc1 <=10 || 0>= this.diemMonHoc2 && this.diemMonHoc2 <=10){
            return (this.diemMonHoc1 + this.diemMonHoc2)/2;
        }
        return 0;
    }
    public String toString() {
        return "HocVien =" + diemTB();
    }    
    
}
