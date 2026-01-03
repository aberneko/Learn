package com.aberneko.learning.OOP.Abstract.Interfaces.fake;

public class Clock implements MakeSound{

    @Override
    public void alarm() {
        System.out.println("бр-бр-бр-бр-бр-бр-бр");
    }
}
