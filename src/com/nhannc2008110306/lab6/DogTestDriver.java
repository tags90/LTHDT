package com.nhannc2008110306.lab6;

public class DogTestDriver {
    public static void main(String[] args) {
        Dog dog1 = new Dog("England", "White", 9);
        dog1.showOP();
        System.out.print("Sua:");
        dog1.bark(4);
    }
}
