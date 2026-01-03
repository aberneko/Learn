package com.aberneko.learning.OOP.Abstract.Interfaces;

import java.lang.Math;

public class Interfaces {
    static void main() {
        CalendarApp calendarApp = new CalendarApp();
        calendarApp.addNote("Привет");
        calendarApp.addNote("Пока" + Math.PI);
        calendarApp.addNote("fklsdmfmsd");
        calendarApp.deleteNote(1);

        calendarApp.print();
    }
}
