package com.nhannc2008110306.lab4;

import java.util.Scanner;

public class AccountTestDriver {
    public static void main(String[] args) {
        Account account = new Account();
        Employee employee = new Employee();
        Customer customer = new Customer();
        Scanner sc = new Scanner(System.in);
        System.out.print("Bạn muốn gửi bao nhiêu tiền:");
        int a =sc.nextInt();
        account.deposit(a);
        account.showData();
        System.out.print("bạn muốn rút bao nhiêu tiền:");
        int b=sc.nextInt();
        account.withdraw(b);
        account.showData();
        customer.getName();
        customer.getAddress();
        customer.ShowData();
        employee.getName();
        employee.getSalary();
        employee.showData();
        sc.close();
    }
}