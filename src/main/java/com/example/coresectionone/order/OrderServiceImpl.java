package com.example.coresectionone.order;

import com.example.coresectionone.discount.DiscountPolicy;
import com.example.coresectionone.discount.FixDiscountPolicy;
import com.example.coresectionone.discount.RateDiscountPolicy;
import com.example.coresectionone.member.Member;
import com.example.coresectionone.member.MemberRepository;
import com.example.coresectionone.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private DiscountPolicy discountPolicy; // 구체화에 의존하지 않고 추상화인 인터페이스에만 의존을 함

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(1L);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
