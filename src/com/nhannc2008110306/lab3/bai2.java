package com.nhannc2008110306.lab3;

import java.util.Scanner;

public class bai2 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);//tim pt
        System.out.printf("Phuong thuc:\n1)Tim 1 bang cuu chuong\n2)Xuat tat ca bang cuu chuong tu 1 den 9\n");
        System.out.print("Nhap phuong thuc can tim:");
        int pt = sc.nextInt();
        switch (pt) {
            case 1:
            int x = sc.nextInt();
            for(int i=1; i<=10;i++){
                System.out.printf("%d x %d = %d", x, i, x*i);
                System.out.println();
            }           
                break;
            case 2:
                for(int i=1; i<=9; i++){
                    for(int j=1; j<=10; j++){
                        System.out.printf("%d x %d = %d", i, j, j*i);
                        System.out.println();
                    }
                }           
                    break;
            default:
                System.out.println("Ko tim thay");
                break;
        }
        sc.close();
    }
}
