package com.sehoon.mission.oop;


import com.sehoon.mission.oop.enums.UserType;
import com.sehoon.mission.oop.model.DiscountPolicy;
import com.sehoon.mission.oop.model.EmployeePolicy;
import com.sehoon.mission.oop.model.NewPolicy;
import com.sehoon.mission.oop.model.Order;
import com.sehoon.mission.oop.model.VipPolicy;
import com.sehoon.mission.oop.service.DiscountService;
import java.util.Map;

/*
미션

1. DiscountPolicy 인터페이스 설계
2. NewPolicy, VipPolicy, EmployeePolicy 구현
3. Map<UserType, DiscountPolicy>로 룩업 (분기 제거)
4. 새 타입 추가 시 switch 수정 없이 동작할 것
* */
public class MiddleLevelMission {

    public static void main(String[] args) {
        Map<UserType, DiscountPolicy> map = Map.of(
                UserType.NEW, new NewPolicy(),
                UserType.VIP, new VipPolicy(),
                UserType.EMPLOYEE, new EmployeePolicy()
        );

        DiscountService discountService = new DiscountService(map);
        Order order = new Order("VIP", 5000);
        System.out.println(discountService.calc(order));

    }

}
