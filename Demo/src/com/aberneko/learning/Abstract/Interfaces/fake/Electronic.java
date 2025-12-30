package com.aberneko.learning.Abstract.Interfaces.fake;

public abstract class Electronic implements Chargeable{
    private int batteryLevel;

    @Override
    public void charge() {
        batteryLevel = 100;
        System.out.printf("Телефон заряжен до %S%n", batteryLevel);
    }
}
