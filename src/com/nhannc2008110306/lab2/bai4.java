package com.nhannc2008110306.lab2;

import java.util.Scanner;

public class bai4 {
    public static void ptb1() {
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
    public static void ptb2() {
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
    public static void ttd() {
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
    public static void main(String[]agrs) {
        //do while em chua bit ro lam nen em ko lam dc vs lai loi hoi nhieu
        System.out.println("+---------------------------------------------------+");
        System.out.println("+Chon tu 1 toi 3:                                   +"); 
        System.out.println("+1) PT Bac 1                                        +");
        System.out.println("+2) PT Bac 2                                        +");
        System.out.println("+3) Tinh tien dien                                  +");
        System.out.println("+---------------------------------------------------+"); 
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap chuong trinh: ");
        int chon = sc.nextInt();
        sc.close();           
        switch(chon){
        case 1:ptb1();break;
        case 2:ptb2();break;
        case 3:ttd();break;
        }                
    }
}
