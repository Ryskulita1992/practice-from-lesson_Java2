package com.company;

public class Rectangle  extends Figure{

    int sideA;
    int sideB;

    public Rectangle(String name, int sideA, int sideB) {

        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
    }public Rectangle (){}
    public double calculatePerimeter (){
        return (sideA+sideB)*2;
    }

    @Override
    public String draw() {
        return "▬";
    }

    ;

}

