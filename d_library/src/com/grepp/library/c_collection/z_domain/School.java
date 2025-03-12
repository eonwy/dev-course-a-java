package com.grepp.library.c_collection.z_domain;

public class School implements Comparable<School> {

    private String name;
    private String address;
    private Integer level;

    public School(String name, String address, Integer level) {
        this.name = name;
        this.address = address;
        this.level = level;
    }

    @Override
    public String toString() {
        return "School{" +
            "name='" + name + '\'' +
            ", address='" + address + '\'' +
            ", level=" + level +
            '}';
    }

    // NOTE CZ : 제어반전
    // 개발자가 작성한 CompareTo 메서드를 Collections 가 호출
    // 정렬을 위한 흐름을 Collections 가 제어, 개발자가 작성한 코드는 Collections 에 의해 사용

    // Spring framework : 웹 개발을 위한 A-Z 는 미리 구현
    // O, P, Q, R 정도만 개발자에게 구현을 맡김

    // Comparable 인터페이스의 역할
    // compareTo 메서드의 override 를 강제
    // 우리가 정한 정렬기준은 Comparable 인터페이스의 compareTo 메서드를 통해 전달
    @Override
    public int compareTo(School o) {
        // 0. 학교레벨로 내림차순 정렬
        return o.level - this.level;

        // 1. 학교명으로 오름차순
//        return this.name.charAt(0) - o.name.charAt(0);

        // 2. 학교레벨로 오름차순 하되, 레벨이 같다면 학교명으로 내림차순
//        return this.level - o.level & o.name.charAt(0) - this.name.charAt(0);
    }
}