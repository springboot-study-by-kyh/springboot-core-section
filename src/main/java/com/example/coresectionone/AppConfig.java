package com.example.coresectionone;

import com.example.coresectionone.discount.DiscountPolicy;
import com.example.coresectionone.discount.FixDiscountPolicy;
import com.example.coresectionone.discount.RateDiscountPolicy;
import com.example.coresectionone.member.MemberRepository;
import com.example.coresectionone.member.MemberService;
import com.example.coresectionone.member.MemberServiceImpl;
import com.example.coresectionone.member.MemoryMemberRepository;
import com.example.coresectionone.order.OrderService;
import com.example.coresectionone.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    private MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy() {
        // return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }

}
