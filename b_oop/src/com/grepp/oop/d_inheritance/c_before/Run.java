package com.grepp.oop.d_inheritance.c_before;

public class Run {

    public static void main(String[] args) {

        Desktop desktop = new Desktop("apple", "macbook air", 2200000, "m1", true);
        SmartPhone smartphone = new SmartPhone("apple", "10s", 500000, "긱벤치", "LGU+");
        Tv tv = new Tv("삼성", "삼텐바이", 1000000, 52);

        desktop.on();
        smartphone.on();
        tv.on();
    }
}
