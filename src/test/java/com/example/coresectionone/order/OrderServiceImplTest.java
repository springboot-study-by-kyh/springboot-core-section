package com.example.coresectionone.order;

import static org.junit.jupiter.api.Assertions.*;

import com.example.coresectionone.discount.FixDiscountPolicy;
import com.example.coresectionone.member.Grade;
import com.example.coresectionone.member.Member;
import com.example.coresectionone.member.MemberRepository;
import com.example.coresectionone.member.MemoryMemberRepository;
import org.junit.jupiter.api.Test;

class OrderServiceImplTest {

    @Test
    void createOrder () {
        MemberRepository memberRepository = new MemoryMemberRepository();
        memberRepository.save(new Member(1L, "name" , Grade.VIP));

        OrderServiceImpl orderService = new OrderServiceImpl(memberRepository, new FixDiscountPolicy());
        Order order = orderService.createOrder(1L, "itemA", 10000);



    }

}