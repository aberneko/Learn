package com.aberneko.learning.Enum;

public class Main {
    static void main() {
        Days genre = Days.FRIDAY;// переменная перечисления

        for (Days days : Days.values()) { // выводит список всех константу по очереди их написания
            System.out.println(days);
        }

        System.out.println(Days.valueOf("MONDAY")); // Находит и возвращает константу перечисления
        System.out.println(genre.name()); // выводит имя константы
    }
}
