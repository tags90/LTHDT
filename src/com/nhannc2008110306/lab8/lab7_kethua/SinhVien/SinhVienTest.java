package com.nhannc2008110306.lab8.lab7_kethua.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class SinhVienTest {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVienIT("Xoan", 7, 2, 4);
        SinhVien sv2 = new SinhVienBiz("Hoa", 9, 10);
        List<SinhVien> listSinhVien = new ArrayList<SinhVien>();
        listSinhVien.add(sv1);
        listSinhVien.add(sv2);
        for (SinhVien sv : listSinhVien){
            sv.xuat();
        }
    }
}
