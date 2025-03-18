package com.grepp.library.d_date;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Calendar;
import java.util.Date;

public class A_Date {

    public static void main(String[] args) {

//        studyDate();
//        studyCalendar();
//        studyLocalDateTime();
        offsetDateTime();
    }

    // NOTE DA01 : 자바 1버전 때 제공된 날짜 관련 클래스
    // 국제표준양식을 따르지 않기 때문에 잘 사용하지 않음
    public static void studyDate() {
        Date now = new Date();
        System.out.println(now);

        System.out.println("year" + now.getYear());
        System.out.println("month" + now.getMonth());
        System.out.println("day" + now.getDate());
        System.out.println("hour" + now.getHours());
        System.out.println("minute" + now.getMinutes());
        System.out.println("second" + now.getSeconds());
    }

    public static void studyCalendar() {
        Calendar now = Calendar.getInstance();
        System.out.println(now);

        System.out.println("year" + now.get(Calendar.YEAR));
        System.out.println("month" + now.get(Calendar.MONTH));
        System.out.println("day" + now.get(Calendar.DATE));
        System.out.println("hour" + now.get(Calendar.HOUR));
        System.out.println("minute" + now.get(Calendar.MINUTE));
        System.out.println("second" + now.get(Calendar.SECOND));
    }

    public static void studyLocalDateTime() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now); //2025-03-14T11:20:47.421178

        System.out.println("year" + now.getYear());
        System.out.println("month" + now.getMonth());
        System.out.println("day" + now.getDayOfMonth());
        System.out.println("hour" + now.getHour());
        System.out.println("minute" + now.getMinute());
        System.out.println("second" + now.getSecond());
    }

    private static void offsetDateTime() {
        OffsetDateTime now = OffsetDateTime.now();
        System.out.println(now); //2025-03-14T11:21:07.242110+09:00

        System.out.println("year" + now.getYear());
        System.out.println("month" + now.getMonth());
        System.out.println("day" + now.getDayOfMonth());
        System.out.println("hour" + now.getHour());
        System.out.println("minute" + now.getMinute());
        System.out.println("second" + now.getSecond());

        System.out.println(now.toEpochSecond() * 1000);
    }

}
