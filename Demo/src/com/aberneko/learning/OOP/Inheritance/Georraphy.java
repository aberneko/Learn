package com.aberneko.learning.OOP.Inheritance;

public class Georraphy extends Teacher {

    @Override
    public String alwrite(){
        return super.alwrite() + " лежать";
    }
}
