package com.nhannc2008110306.lab5;

public class BookTestDriver {
    public static void main(String[] args) {        
        Book book1 = new Book(24000,"Kim Dong",2014,28000,138,"Truyen Cuoi");
        Book book2 = new Book(9000,"Kim Dong",2001,11000,13,"Trinh Tham");
        Book book3 = new Book(14000,"Kim Dong",2008,16000,510,"Hoc");
        book1.showOutput();
        book2.showOutput();
        book3.showOutput();
    }
}
