package com.company;

public class Square  extends Figure {
    int sideA;

    public int getSideA() {
        return sideA;
    }

    public Square(String name, int sideA) {
        super(name);
        this.sideA = sideA;
    }

    public Square(int sideA) {
        this.sideA = sideA;
    }




    public double calculatePerimeter (){
        return sideA*4;
    }

    @Override
    public String draw() {
        return "⛛";

    }

    ;


}

