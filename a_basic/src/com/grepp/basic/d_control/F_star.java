package com.grepp.basic.d_control;

import java.util.Scanner;

public class F_star {

    public static void main(String[] args) {
        q1();
        q2();
        q3();
        q4();
        q5();
        q6();
    }

    private static void q1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("row : ");
        int row = sc.nextInt();

        System.out.print("col : ");
        int col = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void q2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("num : ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {

            String star = "";
            for (int j = 0; j < i; j++) {
                star += "*";
            }

            System.out.println(star);
        }
    }

    private static void q3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("num : ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            String star = "";
            for (int j = 0; j < num; j++) {
                if (i == j) {
                    star += i+1;
                } else {
                    star += "*";
                }
            }

            System.out.println(star);
        }
    }

    private static void q4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("num : ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            String star = "";
            star += " ".repeat(num - i - 1);
            star += "*".repeat((i+1) * 2 - 1);

            System.out.println(star);
        }
    }

    private static void q5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("num : ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            String star = "";
            star += " ".repeat(num - i - 1);
            star += "*".repeat((i+1) * 2 - 1);

            System.out.println(star);
        }

        for (int i = 0; i < num - 1; i++) {

            String star = "";
            star += " ".repeat(i+1);
            star += "*".repeat((num - 1 - i) * 2 - 1);

            System.out.println(star);
        }
    }

    private static void q6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("num : ");
        int num = sc.nextInt();

        for (int i = 0; i < num - 1; i++) {

            String star = "";
            star += "*".repeat(i+1);
            star += " ".repeat((num - 1 - i) * 2 - 1);
            star += "*".repeat(i+1);

            System.out.println(star);
        }

        for (int i = 0; i < num; i++) {

            String star = "";
            star += "*".repeat(num - i - 1);
            star += " ".repeat((i+1) * 2 - 1);
            star += "*".repeat(num - i - 1);

            System.out.println(star);
        }
    }

}
