package com.aberneko.learning.Abstract.Interfaces.fake;

public class Phone extends Electronic implements MakeSound{

    @Override
    public void alarm() {
        System.out.println("бз-бз-бз-бз");
    }
}
