package com.nhannc2008110306.lab6;

public class Triangle{
    int side;
    public Triangle(int side) {
        this.side = side;
    }
    void rotate360(){
        System.out.println("Hinh tam giac luc nghien ban dau la " + side + " do");
        System.out.println("Da nghien ve goc 360 va hien tai do nghien = "+(side + 360)+" do");;
    }
    void playMusic(){
        System.out.println("Dang Choi Tap Tin triangle.aif");
        System.out.println("==============================");
    }
}
