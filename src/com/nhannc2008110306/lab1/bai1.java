package com.nhannc2008110306.lab1;

import java.util.Scanner;

public class bai1 {
    public static void main(String[]agrs) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Họ và tên: ");
        String hoTen = sc.nextLine(); 
        System.out.print("Điểm TB: ");
        double diemTB = sc.nextDouble();
        System.out.printf("%s %f điểm", hoTen, diemTB);
        sc.close();
    }
}
