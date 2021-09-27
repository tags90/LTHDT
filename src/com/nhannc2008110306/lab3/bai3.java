package com.nhannc2008110306.lab3;

import java.util.Scanner;

public class bai3 {
    public static void main(String[]agrs) {
        int n, tempSort;
        Scanner scanner = new Scanner(System.in);  // mang kho qua thay oi cai nay la em chep mang de em tim hieu lai      
        do{                                        // vi em chua bit ro lam ve java mong thay thong cam
            System.out.print("Nhap so pt cua mang: ");
            n = scanner.nextInt();
        }while(n < 0);
        int array[] = new int[n];         
        System.out.println("Nhap cac pt cua mang: ");
        for (int i = 0; i < n; i++){
            System.out.print("Nhap pt mang " + i + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("\nMang ban dau duoc xuat ra: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
        for (int i = 0; i<n-1; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                if (array[i] < array[j]) {
                    tempSort = array[i];
                    array[i] = array[j];
                    array[j] = tempSort;
                }
            }
        }
        System.out.println("\nMang duoc sap xep lai la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("\nPT nho nhat cua mang la: " + array[n - 1]);
        double total = 0;
        for(int i=0; i<array.length; i++){
            total = total + array[i];
        }
        double average = total / array.length;
        System.out.format("KQ cua TBC chia het cho 3 la: %.3f", average%3==0);
        scanner.close();
    }
}
