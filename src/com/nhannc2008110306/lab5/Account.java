package com.nhannc2008110306.lab5;

public class Account {
    String owner;
    int number;
    int balance;
    
    public Account(String owner, int number, int balance){
        this.owner = owner;
        this.number = number;
        this.balance = balance;
    }

    void showOutput(){
        System.out.println("=================");
        System.out.println("Tên chủ tài khoản\t: "+this.owner);
        System.out.println("Số tài khoản\t\t: "+"AD"+this.number);
        System.out.println("Số dư trong tài khoản\t: "+this.balance+" $");
    }
}
