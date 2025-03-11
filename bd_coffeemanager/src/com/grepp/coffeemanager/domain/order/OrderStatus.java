package com.grepp.coffeemanager.domain.order;

// fixme : enum으로 리팩토링
public enum OrderStatus {

     OK(0, "주문 생성 성공"),
     FAIL_SOLDOUT(1, "재고 부족 주문 실패"),
     FAIL_SEASON(1, "비시즌 주문 실패");

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
