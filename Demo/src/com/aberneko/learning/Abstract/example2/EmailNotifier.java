package com.aberneko.learning.Abstract.example2;

public class EmailNotifier extends Notifier{

    @Override
    protected void send(String message) {
        System.out.println("Отправка по email: " + message);
    }
}
