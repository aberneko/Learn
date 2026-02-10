package com.aberneko.learning.OOP.Polymorphism;

public class Main3<T, R, V> {

    private final T value1;
    private final R value2;
    private final V value3;

    public Main3(T value1, R value2, V value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public T getValue1(){
        return value1;
    }

    public R getValue2(){
        return value2;
    }

    public V getValue3(){
        return value3;
    }

    public  void  printAll() {
        System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t(%s, %s, %s)%n", value1, value2, value3);
    }

}