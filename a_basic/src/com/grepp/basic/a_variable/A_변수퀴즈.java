package com.grepp.basic.a_variable;

public class A_변수퀴즈 {

    public static void main(String[] args) {

        char a = '자';
        char b = '기';
        char temp;

        ///////////////
        temp = a;
        a = b;
        b = temp;
        //////////////

        System.out.println(a);
        System.out.println(b);

    }

}