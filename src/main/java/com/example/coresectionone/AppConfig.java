package com.example.coresectionone;

import com.example.coresectionone.discount.DiscountPolicy;
import com.example.coresectionone.discount.RateDiscountPolicy;
import com.example.coresectionone.member.MemberRepository;
import com.example.coresectionone.member.MemberService;
import com.example.coresectionone.member.MemberServiceImpl;
import com.example.coresectionone.member.MemoryMemberRepository;
import com.example.coresectionone.order.OrderService;
import com.example.coresectionone.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {

//        return new OrderServiceImpl(memberRepository(), discountPolicy());
        return null;
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        // return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }

}
