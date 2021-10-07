package com.nhannc2008110306.lab4;

import java.util.Scanner;

public class Customer {
    String name;
    String address;
    Scanner sc = new Scanner(System.in);
    void getName()
    {
        System.out.print("Họ và tên của khách hàng");
        name =sc.nextLine();
    }
    void getAddress(){
        address = sc.nextLine();
        System.out.print("Địa chỉ khách hàng :");

    }
    void ShowData(){
        System.out.println("Tên khách hàng:"+name);
        System.out.println("địa chỉ khách hàng:"+address);
    }
}
