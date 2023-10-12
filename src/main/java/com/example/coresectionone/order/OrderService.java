package com.example.coresectionone.order;

public interface OrderService {

    // 주문 도메인: 클라이언트는 주문 생성시 (회원 아이디, 상품명, 상품 가격)을 반환.
    Order createOrder(Long memberId, String itemName, int itemPrice);

}
