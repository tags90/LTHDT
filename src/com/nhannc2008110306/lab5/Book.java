package com.nhannc2008110306.lab5;

public class Book {
    //pr
    int gia;
    String nhaXuatBan;
    int namXuatBan;
    int giaBan;
    int soLuong;
    String loai;
    //me
    public Book(int gia, String nhaXuatBan, int namXuatBan, int giaBan, int soLuong, String loai) {
        this.gia = gia;
        this.nhaXuatBan = nhaXuatBan;
        this.namXuatBan = namXuatBan;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.loai = loai;
    }
    void showOutput(){
        System.out.println("========================");
        System.out.println("Gia\t\t: "+this.gia);
        System.out.println("NXB\t\t: "+this.nhaXuatBan);
        System.out.println("Nam XB\t\t: "+this.namXuatBan);
        System.out.println("Gia ban\t\t: "+this.giaBan);
        System.out.println("So luong\t: "+this.soLuong);
        System.out.println("Loai\t\t: "+this.loai);
    }
}
