package com.aberneko.learning.Abstract.Interfaces.defaultt;

public class Default {
    static void main() {
        Greeter s = new ConsoleGreeter(); // переменная интерфейса содержит объект который его реализует
        s.greet("Кристина");
        s.sayBye();
    }
}
