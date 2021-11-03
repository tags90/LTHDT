package com.nhannc2008110306.lab8.lab7_kethua.HinhHoc;

public class Square extends Rectangle{
    public Square(double length, double width) {
        super(length, width);
    }
    public void xuat(){
        System.out.println("===================================");
		System.out.println("Cạnh: " + getLength());
		System.out.println("Chu vi hinh vuong = " + getChuVi());
		System.out.println("Dien tich hinh vuong = " + getDientich());
	}    
}
