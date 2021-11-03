package com.nhannc2008110306.lab8.lab4_lopvadoituong;

public class SanPhamTest {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham();
        /*cau 3 them ham tao 
        public SanPham(String tenSp, double donGia){ 
            this(tenSp, donGia, 0)
        }
        lam o sp2
        */
        SanPham sp2 = new SanPham("TAKDI", 16600, 0);
        sp1.nhap();
		sp1.xuat();
		sp2.xuat();
    }
}
