package com.company;

public class Triangle extends Figure {

    int sideA;
    int sideB;
    int sideC;

    public int getSideA() {
        return sideA;
    }



    public Triangle(int sideA, int sideB, int sideC, String name
    ) {
       super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double calculatePerimeter (){
        return sideA+sideB+sideC;
    }

    @Override
    public String draw() {
        return "🔺";
    }
}
