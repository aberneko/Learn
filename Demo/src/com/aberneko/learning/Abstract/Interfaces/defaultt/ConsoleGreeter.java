package com.aberneko.learning.Abstract.Interfaces.defaultt;

public class ConsoleGreeter implements Greeter{

    @Override
    public void greet(String name) {
        System.out.printf("Привет %S%n", name);
    }

}
