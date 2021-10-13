package com.nhannc2008110306.lab5;

public class EmployeeTestDrive {
    public static void main(String[] args) {
        Employee e1 = new Employee("Thu Ha",6720000,"Quan 1","Ke hoach","18/9/1982");
        Employee e2 = new Employee("Dinh Van",20720000,"Quan 8","Quan Tri","7/2/1965");
        Employee e3 = new Employee("Ngoc Minh",5600000,"Huyen Can Gio","Ke Hoach","26/4/1992");        

        e1.showOutput();
        e2.showOutput();
        e3.showOutput();
        
    }
}
