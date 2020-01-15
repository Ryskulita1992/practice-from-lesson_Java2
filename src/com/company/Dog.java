package com.company;

public class Dog extends Animal implements SoundProducible {





    @Override
    public void makeDraw() {
        System.out.println("\uD83D\uDC15");

    }

    @Override
    public void callSound() {
        System.out.println("Barking");

    }
}
