package com.nhannc2008110306.lab3;

import java.util.Scanner;

public class bai1 {
    public static void main(String[]agrs) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=2; i < n-1; i++){
            if(n%i == 0){
            System.out.println(" ko phai la SNT"); 
            break;
            }           
            i++;
        }           
    }
}