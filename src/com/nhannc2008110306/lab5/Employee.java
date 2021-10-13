package com.nhannc2008110306.lab5;

public class Employee {
    String name;
    int salary;
    String address;
    String working_part;
    String birth;
    public Employee(String name, int salary, String address, String working_part, String birth) {
        this.name = name;
        this.salary = salary;
        this.address = address;
        this.working_part = working_part;
        this.birth = birth;
    }
    void showOutput(){
        System.out.println("======================");
        System.out.println("Ten Nhan vien\t\t: "+ this.name);
        System.out.println("Luong Nhan vien\t\t: "+ this.salary+" VNĐ");
        System.out.println("Nhan vien\t\t: "+ this.address);
        System.out.println("Bo phan lam viec\t: "+ this.working_part);
        System.out.println("Ngay sinh\t\t: "+ this.birth);
    }
}
