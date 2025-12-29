package com.aberneko.learning.Abstract.example;

public class Main {
    static void main() {

        Frog frog = new Frog();
        // 1. Происходит вызов конструктора в class frog
        // 2. джава добавляет с него super();
        // 3. Вызывается конструктор из родительского класса
        // 4. Выполняется реализация в конструкторе родительского класса
        // 5. Выполняется код (тело) конструктора наследника
        System.out.println(String.format("Привет, я %s лягушка!", frog.getColor()));
        frog.move();

        Toad toad = new Toad();
        System.out.println(String.format("Привет, а я - %s жаба", toad.getColor()));
        toad.move();
    }
}
