package com.grepp.oop.e_abstract;

public class Run {

    public static void main(String[] args) {
        Figure circle = new Circle(5);
        Figure rectangle = new Rectangle(5, 6);

        System.out.println(circle.calcArea());
        System.out.println(rectangle.calcArea());
    }

}
