package com.nhannc2008110306.lab1;

import java.util.Scanner;

public class bai2 {
    public static void main(String[]agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        int dai = sc.nextInt();
        System.out.print("Nhap chieu rong: ");
        int rong = sc.nextInt();
        System.out.println("Chu vi: " + ((dai + rong)*2));
        System.out.println("Dien tich: "+ (dai * rong));
        System.out.println("Cạnh nhỏ nhất: "+ (Math.min(dai, rong)));
        sc.close();
    }
}
