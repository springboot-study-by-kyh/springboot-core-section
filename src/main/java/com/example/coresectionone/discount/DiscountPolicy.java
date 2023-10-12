package com.example.coresectionone.discount;

import com.example.coresectionone.member.Member;

public interface DiscountPolicy {
    // F2 단축키는 오류난곳으로 바로 이동
    int discount(Member member, int price);
}
