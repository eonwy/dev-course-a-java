package com.grepp.basic.e_modulization;

public class A_module {

    public static void main(String[] args) {

        // 1. 111, 1111, 11111 중에서 최소값을 구하는 로직 작성
        int a = 111, b = 1111, c = 11111;
        min(a, b, c);

        // 2. 222, 2222, 22222 중에서 최대값을 구하는 로직 작성
        int d = 222, e = 2222, f = 22222;
        max(d, e, f);

        // 3. 333, 3333, 33333 중에서 중간값을 구하는 로직 작성
        int g = 333, h = 3333, i = 33333;
        middle(g, h, i);

    }

    public static void min(int a, int b, int c) {
        int min = a > b ? b : a;
        int finalMin = min > c ? c : min;
        System.out.println(finalMin);
    }

    public static void max(int d, int e, int f) {
        int max = d > e ? d : e;
        int finalMax = max > f ? max : f;
        System.out.println(finalMax);
    }

    public static void middle(int g, int h, int i) {
        if (g < h) {
            if (h < i) {
                System.out.println(h);
            } else {
                System.out.println(i);
            }
        } else {
            if (g < i) {
                System.out.println(g);
            } else {
                System.out.println(i);
            }
        }
    }

}
