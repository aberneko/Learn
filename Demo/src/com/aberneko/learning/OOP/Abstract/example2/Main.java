package com.aberneko.learning.OOP.Abstract.example2;

public class Main {
    static void main() {

        EmailNotifier emailNotifier = new EmailNotifier();
        SmsNotifier smsNotifier = new SmsNotifier();

        emailNotifier.notifyUser("привет");
        smsNotifier.notifyUser("привет");


    }

}
