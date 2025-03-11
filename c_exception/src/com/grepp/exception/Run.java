package com.grepp.exception;

import com.grepp.exception.custom.TimeOutException;
import java.net.MalformedURLException;

public class Run {

    public static void main(String[] args) {

        A_Exception ex = new A_Exception();
        // runtime.arithEx();
        // ex.malformedURLEx();
        // ex.throwsMalformedURLEx();
        ex.throwNotValidEx(100);

        try {
            ex.throwTimeOutEx();
            System.out.println("클라이언트야 안녕?");
        } catch (TimeOutException e) {
            System.out.println("catch 블록입니다.");
            System.out.println("죄송합니다. 연결에 실패했습니다. 라고 사용자에게 알린다.");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("try-catch 이후 코드");
    }

}
