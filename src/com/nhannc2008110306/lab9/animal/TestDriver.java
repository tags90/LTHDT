package com.nhannc2008110306.lab9.animal;

public class TestDriver {
    public static void main(String[] args) {
        ListAnimal listAnimal = new ListAnimal();
		Dog dog = new Dog("Con chó", 10, "Chó");
		Cat cat = new Cat("Con mèo", 5, "Mèo");
		Fish fish = new Fish("Con cá", 0.2, "Cá");
		listAnimal.add(dog);
		listAnimal.add(cat);
		listAnimal.add(fish);
		listAnimal.introduce();
		listAnimal.makeNoise();
    }
}
