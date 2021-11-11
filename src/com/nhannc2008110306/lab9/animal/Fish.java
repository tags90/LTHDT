package com.nhannc2008110306.lab9.animal;

public class Fish extends Animal{
    public Fish(String name, double d, String breed) {
		super(name, d, breed);
	}
	protected void makeNoise() {
		System.out.println("OoO");
	}
	protected void play() {
		System.out.println("Cá đang chơi với bong bóng nước");
	}
	protected void eat() {
		System.out.println("Cá đang ăn");
	}
}
