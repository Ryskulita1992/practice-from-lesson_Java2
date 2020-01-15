package com.company;

import javax.naming.Name;

public abstract class Figure  implements Drawable{
    private String name;

    public Figure(String name) {
        this.name = name;
    }

    protected Figure() {
    }

    public String getName() {
        return name;
    }




    public abstract double calculatePerimeter();
    public abstract String draw();

    @Override
    public void makeDraw() {

    }
}

