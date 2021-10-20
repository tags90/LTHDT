package com.nhannc2008110306.lab6;

public class MayTinhTestDriver {
    public static void main(String[] args) {
        MayTinh mt = new MayTinh();
        int t1 = mt.tong(7, 9);
        int t2 = mt.tong(5, 7, 9);
        System.out.println(t1);
        System.out.println(t2);
    }
}
