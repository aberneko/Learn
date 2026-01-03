package com.aberneko.learning.OOP.Abstract.Interfaces.defaultt.defaultSUPER;

public class Cat implements Male, Male2 { // реализует 2 интерфейса

    @Override
    public void make() {
        Male.super.make(); // указывается super для обращения, с лучае если сигнатура методов одинаковая
    }

    // Также можно вообще не выбирать чью-либо реализацию, а написать свою

    // Главное правило, которое следует запомнить: если два интерфейса содержат default-метод с одинаковой сигнатурой,
    // класс обязан переопределить этот метод и разрешить конфликт.
}
