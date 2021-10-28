package com.nhannc2008110306.lab7.shape;

public class Shape {
    private String sound;
    public Shape(String s){
        sound = s;
    }
    public String getSound() {
        return sound;
    }
    public void setSound(String sound) {
        this.sound = sound;
    }
    void rotate(){
        System.out.println("Xoay ra 360");
    }
    void playSound(){
        System.out.println("Dang choi "+ sound);
    }
}
