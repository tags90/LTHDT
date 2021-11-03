package com.nhannc2008110306.lab8.lab4_lopvadoituong;

import java.util.Scanner;

public class SanPham {
    private String tenSp;
    private double donGia;
    private double giamGia;
    public SanPham(){        
    }
    public SanPham(String tenSp, double donGia){ 
        this(tenSp, donGia, 0);        
    }     
    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    public String getTenSp() {
        return tenSp;
    }
    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public double getGiamGia() {
        return giamGia;
    }
    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    private double getThueNhapKhau(){
        double thue;
		thue = donGia * 10/100;
		return thue;
    }
    public void xuat(){
        System.out.println("-----------------------------------");
        System.out.println("Tên sản phẩm: \t"+ tenSp);
		System.out.println("Đơn giá: \t"+ donGia);
		System.out.println("Giảm giá: \t"+ giamGia);
		System.out.println("Thuế nhập khẩu: "+ getThueNhapKhau());
		System.out.println("-----------------------------------");
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: \t");
		tenSp = sc.nextLine();
		System.out.print("Nhập đơn giá: \t\t");
		donGia = sc.nextDouble();
		System.out.print("Nhập giảm giá: \t\t");
		giamGia = sc.nextDouble();
        sc.close();
    }
}
