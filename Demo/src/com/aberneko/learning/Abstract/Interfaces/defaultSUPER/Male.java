package com.aberneko.learning.Abstract.Interfaces.defaultSUPER;

public interface Male {

    default void make() {
        System.out.println("Делаю все что хочу");
    };
}
