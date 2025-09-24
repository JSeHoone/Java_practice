package com.sehoon.mission.oop.service;

import com.sehoon.mission.oop.enums.UserType;
import com.sehoon.mission.oop.model.DiscountPolicy;
import com.sehoon.mission.oop.model.Order;
import java.util.Map;

public class DiscountService {
    private final Map<UserType, DiscountPolicy> policies;

    public DiscountService(Map<UserType, DiscountPolicy> policies) {
        this.policies = policies;
    }

    public int calc(Order o) {
        DiscountPolicy policy = policies.get(UserType.valueOf(o.type()));
        if (policy == null) {
            throw new IllegalArgumentException("No policy for type " + o.type());
        }
        return policy.calculateDiscount(o);
    }

}