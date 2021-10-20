package com.nhannc2008110306.lab6;

public class Circle{
    int radius;//ban kinh    
    public Circle(int radius){
        this.radius = radius;
    }
    void rotate360(){
        System.out.println("Hinh tron luc nghien ban dau la " + radius +" do");
        System.out.println("Da nghien ve goc 360 va hien tai do nghien= "+ (radius + 360) +" do");
    }
    void playMusic(){
        System.out.println("Dang Choi Tap Tin circle.aif");
        System.out.println("==============================");
    }
}
