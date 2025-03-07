package com.grepp.coffeemanager.domain.order;

// fixme : enum으로 리팩토링
public class OrderStatus {

    public static final OrderStatus OK = new OrderStatus(0, "주문 생성 성공");
    public static final OrderStatus FAIL_SOLDOUT = new OrderStatus(1, "재고 부족 주문 실패");
    public static final OrderStatus FAIL_SEASON = new OrderStatus(1, "비시즌 주문 실패");

    private int code;
    private String desc;

    public OrderStatus(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public boolean isOk() {
        return code == 0;
    }

    public String desc() {
        return desc;
    }

}
