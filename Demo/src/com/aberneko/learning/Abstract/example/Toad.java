package com.aberneko.learning.Abstract.example;

public class Toad extends Amphibian{

    protected Toad() { // так сказать в одно семье
        super("Красный"); // Вызываем конструктор родительского класса
    }

    @Override
    public void move(){
       System.out.println("Я важно хожу!");
   }
}
