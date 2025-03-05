package com.grepp.basic.d_control;

import java.util.Scanner;

public class B_ifelse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n --- 인증 --- \n");
        String username = "김예원";
        String storedPassword = "123456";

        System.out.println("이름 : ");
        String name = sc.next();
        System.out.println("비밀번호 : ");
        String password = sc.next();

        if (username.equals(name) && password.equals(storedPassword)) {
            System.out.println("환영합니다 " + name + "님!");
        } else {
            System.out.println("인증에 실패하였습니다.");
        }
    }

}
