package com.bbidag.learning.spring.domain.car;

public class SportsCar implements Car{

    private String moveMessage;

    public SportsCar(){
        this.moveMessage = "스포츠카가 움직인다.";
    }

    public SportsCar(String moveMessage){
        if(moveMessage == null) throw new NullPointerException("move message can not be empty");
        this.moveMessage = moveMessage;
    }

    @Override
    public void move() {
        System.out.println(moveMessage);
    }
}
