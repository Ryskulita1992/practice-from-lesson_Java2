package com.company;

public  class Main {

    public static void main(String[] args) {
        Circle circle = new Circle("Circle", 20);
        Circle circle1 = new Circle("Circle", 30);
        Circle circle2 = new Circle("Circle", 40);
        Square square = new Square("Square", 15);
        Square square1 = new Square("Square", 20);
        Square square2 = new Square("Square", 25);


        Figure[] Figure = new Figure[]{circle, circle1, circle2, square, square1, square2};
        for (int i = 0; i < Figure.length; i++) {
            System.out.println(Figure[i].getName() + Figure[i].draw() + " " + Figure[i].calculatePerimeter());
        }


        Dog d = new Dog();
        d.makeDraw();
        d.callSound();
    }
}








