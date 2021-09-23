package com.nhannc2008110306.lab2;

import java.util.Scanner;

public class bai1 {
    public static void main(String[]agrs) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhập a:");
        int a = sc.nextInt();
        System.out.print("Nhập b:");
        int b = sc.nextInt();        
        sc.close();
        if(a == 0){
            if(b == 0){
                System.out.println("PT vô số nghiệm");
            }
        }
        if(a==0){
            if(b!=0){
            System.out.println("PT vô nghiệm");
            }
        }    
        if(a!=0){
            if(b!=0){
            System.out.printf("Nghiệm x= %d", -b/a);
            }
        }            
    }
}
