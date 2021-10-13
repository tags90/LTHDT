package com.nhannc2008110306.lab5;

public class Computer {
    String name;
    int year;
    String os;
    String ram;
    String cpu;
    int price;
    int year_w;    
    Computer(String name, int year, String os, String ram, String cpu, int price, int year_w) {
        this.name = name;
        this.year = year;
        this.os = os;
        this.ram = ram;
        this.cpu = cpu;
        this.price = price;
        this.year_w = year_w;
    }

    void showOutput(){
        System.out.println("================");
        System.out.println("Nhà sản xuất\t\t: "+this.name);
        System.out.println("Năm sản xuất\t\t: "+this.year);
        System.out.println("Hệ điều hành\t\t: "+this.os);
        System.out.println("Ram\t\t\t: "+this.ram);
        System.out.println("CPU\t\t\t: "+this.cpu);
        System.out.println("Giá\t\t\t: "+this.price+"$");
        System.out.println("Năm bảo hành\t\t: "+this.year_w);
    }
}
