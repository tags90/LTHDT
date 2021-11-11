package com.nhannc2008110306.lab9.animal;

public class Dog extends Animal{
    public Dog(String name, double d, String breed) {
		super(name, d, breed);
	}
	protected void makeNoise() {
		System.out.println("Gâu gâu gâu...");
	}
	protected void play() {
		System.out.println("Chó đang chơi cục xương ");
	}
	protected void eat() {
		System.out.println("Chó đang gặm xương");
	}
}
