package com.nhannc2008110306.lab9.animal;

public class Cat extends Animal{
    public Cat(String name, double d, String breed) {
		super(name, d, breed);
	}
	protected void makeNoise() {
		System.out.println("Meo meo...");
	}
	protected void play() {
		System.out.println("Chơi với bóng len");
	}
	protected void eat() {
		System.out.println("Mèo dang an");
	}	
}
