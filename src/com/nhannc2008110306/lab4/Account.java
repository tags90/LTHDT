package com.nhannc2008110306.lab4;

public class Account {
    int number_account;
    int number_blance;
    void showData(){
        System.out.println("Accout number" + number_account);
        System.out.println("Account blance" + number_blance);
    }
    void deposit(int amount){
        number_blance +=amount;
    }
    void withdraw(int amount){
        number_blance -=amount;
    }
}