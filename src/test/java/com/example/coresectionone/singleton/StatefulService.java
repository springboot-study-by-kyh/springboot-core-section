package com.example.coresectionone.singleton;

// 스프링 빈은 항상 무상태 설계를 유지해야함.
public class StatefulService {

//    private int price; // 상태를 유지하는 필드

    public int order(String name, int price){
        System.out.println("name = " + name + " price = " + price);
//        this.price = price;
        return price;
    }

//    public int getPrice(){
//        return price;
//    }
}
