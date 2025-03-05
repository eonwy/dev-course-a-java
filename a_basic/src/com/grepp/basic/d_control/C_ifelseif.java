package com.grepp.basic.d_control;

import java.util.Scanner;

public class C_ifelseif {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("점수 : ");
        int score = sc.nextInt();

        if (score == 100) {
            System.out.println("A");
        } else if (score >= 90 && score < 100) {
            System.out.println("B");
        } else if (score >= 80 && score < 90) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
