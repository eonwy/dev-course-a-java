package com.grepp.library.b_string;

import java.util.Arrays;

public class _String {

    public static void main(String[] args) {

        String str = "			The String class represents character strings.			";
        String res = "";

        //1. str의 길이를 출력하세요.
        System.out.print("1. str의 길이를 출력하세요.");
        int len = str.length();
        System.out.println(len);

        //2. str을 모두 대문자로 바꿔 출력 해주세요.
        System.out.print("2. str을 모두 대문자로 바꿔 출력 해주세요.");
        String upper = str.toUpperCase();
        System.out.println(upper);
        //3. str을 모두 소문자로 바꿔 출력 해주세요.
        System.out.print("3. str을 모두 소문자로 바꿔 출력 해주세요.");
        String lower = str.toLowerCase();
        System.out.println(lower);

        //4. str에 있는 "class"를 "java"로 바꿔 출력 해주세요
        System.out.print("4. str에 있는 \"class\"를 \"java\"로 바꿔 출력 해주세요");
        String replace = str.replaceAll("class", "java");
        System.out.println(replace);

        //5. str에서 첫번째 t의 위치를 구해주세요.
        System.out.print("5. str에서 첫번째 t의 위치를 구해주세요.");
        int t = str.indexOf("t");
        System.out.println(t);

        //6. str의 앞 뒤 공백을 제거해서 출력해주세요
        System.out.print("6. str의 앞 뒤 공백을 제거해서 출력해주세요");
        String tr = str.trim();
        System.out.println(tr);

        //7. str을 char[]형태로 출력 해주세요.
        System.out.print("7. str을 char[]형태로 출력 해주세요.");
        char[] ch = str.toCharArray();
        System.out.println(Arrays.toString(ch));

    }

}