package com.example.coresectionone;

import com.example.coresectionone.member.Grade;
import com.example.coresectionone.member.Member;
import com.example.coresectionone.member.MemberService;
import com.example.coresectionone.member.MemberServiceImpl;
import com.example.coresectionone.order.Order;
import com.example.coresectionone.order.OrderService;
import com.example.coresectionone.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member memberA = new Member(memberId, "memberA", Grade.VIP);

        memberService.join(memberA);

        Order order = orderService.createOrder(memberId, "itemA", 30000);

        System.out.println(order);


    }

}
