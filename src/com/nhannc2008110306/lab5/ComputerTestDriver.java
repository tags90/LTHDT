package com.nhannc2008110306.lab5;

public class ComputerTestDriver {
    public static void main(String[] args) {
        Computer com1 = new Computer("Apple",2020,"macOS","16GB","Apple M1 chip",1299,2020);
        Computer com2 = new Computer("Intel",2018,"Window 10","32GB","Intel® Core™ i7-8700(6 core, 12 threads) 4,60 GHz",749,2018);
        Computer com3 = new Computer("T-Rex",2009,"Window XP","4GB","Intel Pentium G2130(2 core, 2 threads) 3,20 GHz",143,2010);
        com1.showOutput();
        com2.showOutput();
        com3.showOutput();
    }
}
