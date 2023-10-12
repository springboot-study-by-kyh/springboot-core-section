package com.example.coresectionone.discount;

import com.example.coresectionone.member.Grade;
import com.example.coresectionone.member.Member;

// 정률 할인 정책
public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000; // 고정적으로 천원 할인
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP) return discountFixAmount;
        else return 0;
    }
}
