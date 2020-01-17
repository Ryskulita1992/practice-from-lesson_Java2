package com.company;

import org.w3c.dom.ls.LSOutput;

public class Circle extends Figure {

    String name;
    int r;
    final double PI = 3.14;

    public Circle( String name , int r) {
        super(name);
        this.r = r;
    }

    public double calculatePerimeter (){
        return 2*PI*r;
    }

    @Override
    public String draw() {
        return "\u26AB";
    }

    //привет
    //
    //в классном проекте ошибочка есть небольшая. В консоль название квадратов выходит null, там конструктор неверный. Нужно через супер работать

    ;

}
