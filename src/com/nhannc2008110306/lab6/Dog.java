package com.nhannc2008110306.lab6;

public class Dog {
    String breed;
    String color;
    int age;
    public Dog(String breed, String color, int age) {
        this.breed = breed;
        this.color = color;
        this.age = age;
    }
    void bark(){
        System.out.println("Gau");
    }
    void bark(int barks){
        while (barks>0){
            System.out.print(" Gau ");
            barks--;
        }
    }
    void showOP(){
        System.out.println("=======================");
        System.out.println("Loai\t: "+this.breed);
        System.out.println("Mau\t: "+ this.color);
        System.out.println("Tuoi\t: "+this.age);
    }
}
