package com.grepp.oop.h_lambda;

import com.grepp.oop.h_lambda.domain.Exam;
import java.awt.datatransfer.FlavorEvent;

public class Run {

    public static void main(String[] args) {

        // NOTE H01 Lambda
        // 1. 매개변수의 타입은 생략 (이미 인터페이스에 정의해두었기에)
        // 2. 매개변수가 하나라면 매개변수 선언부의 괄호는 생략
        // 3. 코드블록의 코드가 한 줄인 경우 {} 생략 가능
        // 4. 반환문만 존재하는 함수라면 {} 과 return 을 함께 생략 가능

        _Lambda lambda = new _Lambda();

        lambda.testConsumer(a -> {
            System.out.println(a);
            System.out.println("--------------------");
        });

        lambda.testSupplier(() -> "롸?");
        System.out.println("--------------------");

        lambda.testPredicate(num -> num % 2 == 0);
        System.out.println("--------------------");

        lambda.testFunction((a, b) -> a + b);
        System.out.println("--------------------");

        Exam kor = new Exam("국어", "예옹", 70);
        Exam math = new Exam("수학", "예옹", 70);

        System.out.println("국어 통과?");
        System.out.println(kor.isPass(exam -> exam.getScore() >= 80));
        System.out.println("수학 통과?");
        System.out.println(kor.isPass(exam -> exam.getScore() >= 60));

        // 메서드 참조
        // 함수형 인터페이스의 추상메서드 선언부(반환타입, 매개변수 목록)와 일치하는
        // 다른 클래스의 메서드라면 메서드 참조형식으로 사용할 수 있다
        // Class Name :: 메서드명 => static 메서드, 임의 인스턴스 메서드
        // 참조변수 :: 메서드명 => 인스턴스 메서드 호출
        // Clas Name :: new => 생성자 호출

        // 메서드 참조
        lambda.testConsumer(a -> System.out.println(a));
        lambda.testConsumer(System.out::println);
        lambda.testSupplier(String::new);



    }
}
