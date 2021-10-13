package com.nhannc2008110306.lab5;

public class Car {
    String owner;
    String manufacturer;
    String current;
    String license;
    double capacity;    
    public Car(String owner, String manufacturer, String current, String license, double capacity) {
        this.owner = owner;
        this.manufacturer = manufacturer;
        this.current = current;
        this.license = license;
        this.capacity = capacity;
    }
    void showOutput(){
        System.out.println("===================");
        System.out.println("Chu so huu\t: "+ this.owner);
        System.out.println("Hang\t\t: " + this.manufacturer);
        System.out.println("Dong\t\t: " + this.current);
        System.out.println("Giay phep\t: "+ this.license);
        System.out.println("Dung tich\t: "+ this.capacity +" lít");
    }    
}
