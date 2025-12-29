package com.aberneko.learning.Abstract.example2;

public abstract class Notifier {

    public void notifyUser(String massage) { // общая логика для всех типов уведомлений
        String format = "[Уведомление] " + massage;
        send(format); // решает как отправить метод наследника;
    }

    protected abstract void send(String massage); //  способ доставки уведомления


}
