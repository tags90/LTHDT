package com.nhannc2008110306.lab2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[]agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a:");
        int a = sc.nextInt();
        System.out.print("Nhap b:");
        int b = sc.nextInt();
        System.out.print("Nhap c:");
        int c = sc.nextInt();
        sc.close();
        int d;
        if (a==0){
            System.out.printf("PT bac nhat =%d", -c/b);
        }
        if (a!=0){
            d=b*b-4*a*c;
            if (d<0){
                System.out.println("PT vo nghiem");
            }
            if (d==0){
                System.out.printf("Nghiem: %d", -b/(2*a));
            }
            if (d>0){
                System.out.printf("Nghiem cua x1= %d, x2= %d", (-b+Math.sqrt(d))/(2*a),(-b-Math.sqrt(d))/(2*a));
            }
        }
    }
}
