package com.nhannc2008110306.lab1;

import java.util.Scanner;

public class bai3 {
    public static void main(String[]agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap canh: ");
        int canh = sc.nextInt();
        System.out.println("Thể tích hình lập phương: "+ (Math.pow(canh, 3)));
        sc.close();
    }
}
  