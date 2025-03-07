package com.grepp.coffeemanager.domain.order;

import com.grepp.coffeemanager.domain.coffee.Coffee;
import java.time.LocalDateTime;

public class Order {

    private String name;
    private Coffee coffee;
    private int orderCnt;
    private int orderPrice;
    private LocalDateTime orderTime = LocalDateTime.now();



    public String getName() {
        return name;
    }

    public Coffee getCoffee() {
        return coffee;
    }

    public int getOrderCnt() {
        return orderCnt;
    }

    public int getOrderPrice() {
        return orderPrice;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }
}
