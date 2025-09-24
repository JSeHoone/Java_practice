package com.sehoon.mission.oop.model;

public class NewPolicy implements DiscountPolicy {
    @Override
    public int calculateDiscount(Order order) {
        return order.price();
    }
}