package com.example.coresectionone;

import com.example.coresectionone.member.Grade;
import com.example.coresectionone.member.Member;
import com.example.coresectionone.member.MemberService;
import com.example.coresectionone.order.Order;
import com.example.coresectionone.order.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);

        Long memberId = 1L;
        Member memberA = new Member(memberId, "memberA", Grade.VIP);

        memberService.join(memberA);

        Order order = orderService.createOrder(memberId, "itemA", 30000);

        System.out.println(order);


    }

}
