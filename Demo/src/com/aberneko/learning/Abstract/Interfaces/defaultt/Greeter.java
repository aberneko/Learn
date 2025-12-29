package com.aberneko.learning.Abstract.Interfaces.defaultt;

interface Greeter {
    default  void greet(String name) { // метод по умолчанию
        System.out.println("Привет, " + name + "!");
    }

    default void sayBye() {
        System.out.println("Пока!");
    }
}