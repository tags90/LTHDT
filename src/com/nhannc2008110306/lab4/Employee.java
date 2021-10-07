package com.nhannc2008110306.lab4;

import java.util.Scanner;

public class Employee {
    String name;
    String salary;
    Scanner sc =new Scanner(System.in);
    void getName(){
        System.out.print("họ và tên nhân viên :");
        name = sc.nextLine();
        System.out.print("Lương của nhân viên :");

    }
    void getSalary(){
        salary=sc.nextLine();
        System.out.print("Lương nhân viên:");
    }
    void showData(){
        System.out.println("Tên nhân viên:"+name);
        System.out.println("Lương của nhân viên:"+salary);
    }
}
