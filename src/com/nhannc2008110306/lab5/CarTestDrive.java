package com.nhannc2008110306.lab5;

public class CarTestDrive {
    public static void main(String[] args) {
        Car car1 = new Car("Alex","Lamborghini","Lamborghini Aventador LP700-4","License by Automobili Lamborghini S.p.A.",2.1);
        Car car2 = new Car("John","Toyota","Toyota Vios","License by PT Toyota-Astra Motor.",1.5);
        Car car3 = new Car("Mateo","BMW","BMW 3-Series","License by Bayerische Motoren Werke AG",2.3);
        car1.showOutput();
        car2.showOutput();
        car3.showOutput();    
    }
}
