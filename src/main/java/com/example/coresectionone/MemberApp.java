package com.example.coresectionone;

import com.example.coresectionone.member.Grade;
import com.example.coresectionone.member.Member;
import com.example.coresectionone.member.MemberService;
import com.example.coresectionone.member.MemberServiceImpl;

public class MemberApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("member : " + member.getName());
        System.out.println("findMember : " + findMember.getName());




    }
}
