package com.example.coresectionone.order;


public class Order {

    private Long memberId;
    private String itemName; // 상품명
    private int itemPrice;  // 상품가격
    private int discountPrice; // 할인가격

    public Order(Long memberId, String itemName, int itemPrice, int discountPrice) {
        this.memberId = memberId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.discountPrice = discountPrice;
    }

    // 할인되서 계산된 가격 (상품가격에서 할인가격 빼기)
    public int calculatePrice(){
        return itemPrice - discountPrice;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
            "memberId=" + memberId +
            ", itemName='" + itemName + '\'' +
            ", itemPrice=" + itemPrice +
            ", discountPrice=" + discountPrice +
            '}';
    }
}
