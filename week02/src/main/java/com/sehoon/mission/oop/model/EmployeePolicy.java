package com.sehoon.mission.oop.model;

public class EmployeePolicy implements DiscountPolicy{
    @Override
    public int calculateDiscount(Order order) {
        return order.price() - 2000;
    }
}