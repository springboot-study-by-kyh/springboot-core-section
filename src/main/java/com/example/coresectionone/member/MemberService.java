package com.example.coresectionone.member;

public interface MemberService {
    void join(Member member);

    Member findMember(Long memberId);
}
