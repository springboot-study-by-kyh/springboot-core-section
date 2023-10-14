package com.example.coresectionone.discount;


import com.example.coresectionone.member.Grade;
import com.example.coresectionone.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10% 할인 적용이 되어야함")
    void VIP () {
        // given
        Member member = new Member(1L, "memberA", Grade.VIP);

        // when
        int discountPrice = discountPolicy.discount(member, 10000);

        // then
        Assertions.assertThat(discountPrice).isEqualTo(1000);
    }

    @Test
    @DisplayName("VIP가 아니면 10% 할인 적용이 안되어야함")
    void VIP아님 () {
        // given
        Member member = new Member(1L, "memberA", Grade.BASIC);

        // when
        int discountPrice = discountPolicy.discount(member, 10000);

        // then
        Assertions.assertThat(discountPrice).isEqualTo(0);
    }

}