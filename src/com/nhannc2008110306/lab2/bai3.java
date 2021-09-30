package com.nhannc2008110306.lab2;

import java.util.Scanner;

public class bai3 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so dien: ");
        float soDien = sc.nextFloat();        
        sc.close();
        if (soDien<50){
            System.out.printf("Số tiền là: %f", soDien*1000);
        }else{
            System.out.printf("Số tiền là: %f", 50*1000+(soDien-50)*1200);
        }
    }
}
