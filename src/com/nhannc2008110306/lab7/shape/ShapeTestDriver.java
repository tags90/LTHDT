package com.nhannc2008110306.lab7.shape;

public class ShapeTestDriver {
    public static void main(String[] args) {
        Circle c = new Circle("hinhtron.aif");
        c.rotate();
        c.playSound();
        Square s = new Square("hinhvuong.aif");
        s.rotate();
        s.playSound();
        Triangle t = new Triangle("tamgiac.aif");
        t.rotate();
        t.playSound();
    }
}
