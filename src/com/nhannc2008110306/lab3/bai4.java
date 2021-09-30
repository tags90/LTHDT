package com.nhannc2008110306.lab3;

import java.util.Scanner;

public class bai4 {
    public static void main(String[]args) { 
        Scanner input = new Scanner(System.in);
		System.out.print("Nhap so luong sinh vien = ");
		int n=input.nextInt();
		String[] A=new String[n];		
		for(int i=0;i<n;i++){
			System.out.println("- Nhap thong tin sinh vien thu "+i+" : ");
			System.out.print("Ho ten sv: ");
			input.nextLine();
			A[i]=input.nextLine();				
		}
		int B[]=new int[n];
		for(int i=0;i<n;i++){
			System.out.println("- Nhap thong tin sinh vien thu "+i+" : ");
			System.out.print("Diem : ");
			B[i]=input.nextInt();
		}
		for(int i=0;i<n;i++){
		    if(B[i]<5){
				System.out.println("Ten : "+A[i]+"\n Diem: "+B[i]+"\n Hoc Luc: Yeu");
			}
			if(B[i]>5 && B[i]<6.5){
				System.out.println("Ten : "+A[i]+"\n Diem: "+B[i]+"\n Hoc Luc: Trung Binh");
			}
			if(B[i]>=6.5 && B[i]<7.5) {
				System.out.println("Ten : "+A[i]+"\n Diem: "+B[i]+"\n Hoc Luc: Kha");
			}
			if(B[i]>=7.5 && B[i]<9){
				System.out.println("Ten : "+A[i]+"\n Diem: "+B[i]+"\n Hoc Luc: Gioi");
			}
			if(B[i]>=9){
				System.out.println("Ten : "+A[i]+"\n Diem: "+B[i]+"\nHoc Luc: xuat sac");
			}
		}
        input.close(); 
	}
}
