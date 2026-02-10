package com.aberneko.learning.OOP.Polymorphism;

public class Main1 {
    static void main() {

        Main<Integer> main = new Main<>(1, 3);
        main.printAll();

        Main<String> main2 = new Main<>("Привет", "Пока");
        main2.printAll();

        Main3<String, Integer, Boolean> main3 = new Main3<>("Суккуб", 123, true);
        main3.printAll();
        String value1 = main3.getValue1();
        Integer value2 = main3.getValue2();
        Boolean value3 = main3.getValue3();


        System.out.printf("%s, %s, %s%n", value1, value2, value3);
    }
}
