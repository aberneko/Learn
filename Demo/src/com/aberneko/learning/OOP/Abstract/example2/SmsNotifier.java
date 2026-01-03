package com.aberneko.learning.OOP.Abstract.example2;

public class SmsNotifier extends Notifier{

    @Override
    protected void send(String massage) {
        System.out.println("Уведомление по SMS: " + massage);
    }

}
