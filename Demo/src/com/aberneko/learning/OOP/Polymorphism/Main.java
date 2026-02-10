package com.aberneko.learning.OOP.Polymorphism;

public class Main<TEWL> {

    private final TEWL value1;
    private final TEWL value2;

    public Main(TEWL value1, TEWL value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public TEWL getValue1(){
        return value1;
    }

    public TEWL getValue2(){
        return value2;
    }

    public  void  printAll() {
        System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t(%s, %s)%n", value1, value2);
    }

}
