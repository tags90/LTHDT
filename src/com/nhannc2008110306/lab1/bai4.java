package com.nhannc2008110306.lab1;

import java.util.Scanner;

public class bai4 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();
        System.out.print("Nhap c: ");
        int c = sc.nextInt();
        sc.close();
        int d = b*b-4*a*c;
        System.out.println("Delta: "+ d);
        System.out.println("Tính căn delta:"+ ((Math.sqrt(d))));
    }
}
