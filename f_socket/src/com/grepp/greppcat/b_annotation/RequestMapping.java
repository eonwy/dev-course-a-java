package com.grepp.greppcat.b_annotation;

// NOTE BO1 : annotation
// 표준 어노테이션
// 사용자정의 어노테이션
// 메타 어노테이션
// @Target : 어노테이션이 적용될 수 있는 대상
// @Retention : 어노테이션의 유효기간, 소스코드, 컴파일, 런타임
// @Document
// @Inherited
// @Repeatable

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
public @interface RequestMapping {
    String url();
    String method() default "GET";
}
