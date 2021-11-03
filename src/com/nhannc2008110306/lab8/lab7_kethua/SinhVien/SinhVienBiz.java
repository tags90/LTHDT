package com.nhannc2008110306.lab8.lab7_kethua.SinhVien;

public class SinhVienBiz extends SinhVien{
    double diemMarketing, diemSales;
	public SinhVienBiz(String hoTen, double diemMarketing, double diemSales) {
		super(hoTen, "Kinh tế");
		this.diemMarketing = diemMarketing;
		this.diemSales = diemSales;
	}
	public double getDiem() {
		return (2*diemMarketing + diemSales)/3;
	}
}
