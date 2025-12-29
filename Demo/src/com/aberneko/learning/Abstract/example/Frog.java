package com.aberneko.learning.Abstract.example;

public class Frog extends Amphibian{

    protected Frog() {
        super("Оранжевый");
    }

    @Override
    public void move(){
        System.out.println("Я передвигаюсь по суши прыжками!");
    }
}
