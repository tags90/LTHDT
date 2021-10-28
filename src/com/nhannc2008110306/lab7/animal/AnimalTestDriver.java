package com.nhannc2008110306.lab7.animal;

public class AnimalTestDriver {
    public static void main(String[] args) {
        Cat c = new Cat();        
        Dog d = new Dog();
        Hippo h = new Hippo();
        Lion l = new Lion();
        Tiger t = new Tiger();
        Wolf w = new Wolf();
        c.makeNoise();
        c.eat();
        c.sleep();
        c.roam();
        d.makeNoise();
        d.eat();
        d.sleep();
        d.roam();
        h.makeNoise();
        h.eat();
        h.sleep();
        h.roam();
        l.makeNoise();
        l.eat();
        l.sleep();
        l.roam();
        t.makeNoise();
        t.eat();
        t.sleep();
        t.roam();
        w.makeNoise();
        w.eat();
        w.sleep();
        w.roam();
    }
}
