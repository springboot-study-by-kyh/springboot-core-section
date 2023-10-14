package com.example.coresectionone;

import com.example.coresectionone.discount.FixDiscountPolicy;
import com.example.coresectionone.member.MemberService;
import com.example.coresectionone.member.MemberServiceImpl;
import com.example.coresectionone.member.MemoryMemberRepository;
import com.example.coresectionone.order.OrderService;
import com.example.coresectionone.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }

}
