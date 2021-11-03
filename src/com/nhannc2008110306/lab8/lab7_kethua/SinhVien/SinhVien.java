package com.nhannc2008110306.lab8.lab7_kethua.SinhVien;

public abstract class SinhVien {
    private String hoTen, nganh;
	public SinhVien(String hoTen, String nganh){
		this.hoTen = hoTen;
		this.nganh = nganh;
	}
	public abstract double getDiem();
	public String getHocLuc(){
		String hocLuc;
		double diem = getDiem();
		if(diem < 5)
			hocLuc = "Yếu";
		else if(diem >= 5 && diem < 6.5)
			hocLuc = "Trung bình";
		else if(diem >=6.5 && diem < 7.5)
			hocLuc = "Khá";
		else if(diem >=7.5 && diem < 9)
			hocLuc = "Giỏi";
		else
			hocLuc = "Xuất sắc";
		return hocLuc;
	}
	public void xuat(){
		System.out.println("=============================");
        System.out.println("Họ và Tên: \t"+ hoTen);
		System.out.println("Ngành: \t"+ nganh);
		System.out.println("Học lực: \t"+ getHocLuc());		
	}
}
