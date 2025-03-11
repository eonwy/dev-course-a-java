package com.grepp.exception;

import java.util.Random;
import java.util.Scanner;

public class B_RuntimeException {

    public static void main(String[] args) {
        arithEx();
        multiEx();
    }

    public static void arithEx() {
        Scanner sc = new Scanner(System.in);

        while(true) {
            try {
                System.out.print("숫자 : ");
                int num = sc.nextInt();
                int random = new Random().nextInt(0, 4);
                int result = num / random;
                System.out.println("나누어진 몫은 " + result + " 입니다.");
                if(num == 444) break;
            } catch (ArithmeticException e) {
                System.out.println("0이 나와서 다시 입력해주세요");
            }
        }
    }


    static void multiEx() {
        try {
            // 1. ClasCastException
            Object obj = new Object();
            String str = (String) obj;

            // 2. ArrayIndexOutOfBoundsException
            int[] arr = new int[2];
            arr[2] = 10;

            // 3. NullPointerException
            String nullStr = null;
            nullStr.equals("A");
//        } catch (ClassCastException e) {
//            System.out.println("ClassCastException 의 catch block");
//            System.out.println(e.getMessage());
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("ArrayIndexOutOfBoundsException 의 catch block");
//            System.out.println(e.getMessage());
//        } catch (NullPointerException e) {
//            System.out.println("NullPointerException 의 catch block");
//            System.out.println(e.getMessage());
//        } catch (Exception e) {
//            // 일괄적으로 모든 예외를 처리할 수도 있음
//            System.out.println(e.getMessage());
        } catch (ClassCastException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            // 원하는 예외만 처리할 수도 있음
            System.out.println(e.getMessage());
        }
    }
}
