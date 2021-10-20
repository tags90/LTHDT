package com.nhannc2008110306.lab6;

public class ShapeTestDriver {
    public static void main(String[] args) {
        //class Circle, Triangle, Square
        Circle cr = new Circle(5);
        Triangle tg = new Triangle(30);
        Square sq = new Square(45);
        cr.rotate360();        
        cr.playMusic();
        tg.rotate360();
        tg.playMusic();
        sq.rotate360();
        sq.playMusic();
    }
}
