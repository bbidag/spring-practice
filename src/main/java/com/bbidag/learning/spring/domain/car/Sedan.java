package com.bbidag.learning.spring.domain.car;

public class Sedan implements Car {

    private String moveMessage;

    public Sedan(){
        this.moveMessage = "세단이 움직인다.";
    }

    public Sedan(String moveMessage){
        if(moveMessage == null) throw new NullPointerException("move message can not be empty");
        this.moveMessage = moveMessage;
    }

    @Override
    public void move() {
        System.out.println(moveMessage);
    }
}
