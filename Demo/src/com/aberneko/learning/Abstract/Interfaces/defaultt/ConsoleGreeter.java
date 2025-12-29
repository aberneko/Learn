package com.aberneko.learning.Abstract.Interfaces.defaultt;

public class ConsoleGreeter implements Greeter{

    @Override
    public void greet(String name) {
        System.out.println(String.format("Привет %S", name));
    }

}
