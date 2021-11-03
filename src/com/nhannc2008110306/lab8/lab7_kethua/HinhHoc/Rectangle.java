package com.nhannc2008110306.lab8.lab7_kethua.HinhHoc;

public class Rectangle {
    private double length;
    private double width;
    public Rectangle(){
        
    }
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getChuVi(){
        if (length == width){
            return length * 4;
        }
        return (length + width) * 2;
    }
    public double getDientich(){
        if (length == width){
            return length * length;
        }
        return length * width;
    }
    public void xuat(){
        System.out.println("===================================");
		System.out.println("Chieu dai: " +length);
		System.out.println("Chieu rong: " +width);
		System.out.println("Chu vi HCN = " + getChuVi());
		System.out.println("Dien tich HCN = " + getDientich());
	}
}
