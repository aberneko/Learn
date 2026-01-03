package com.aberneko.learning.OOP.Encapsulation.Static.TaskStaticOne;

import java.util.ArrayList;

public class Practicum {
    public static void main(String[] args) {
        ArrayList<MountainHare> hares = new ArrayList<>();
        hares.add(new MountainHare(4, 4.4, 120));
        hares.add(new MountainHare(7, 3.6, 150));
        hares.add(new MountainHare(1, 2.3, 100));



        System.out.println("В лесу лето!");
        // создайте объект "летний лес с зайцами"
        Forest forest = new Forest(hares);
        forest.setSeason("лето");

        MountainHare hare1 = null;
        System.out.println(hare1.color);


        System.out.println("Список зайцев:");
        // напечатайте список всех зайцев
        forest.printHares();

        System.out.println("В лесу зима!");
        Forest forest1 = new Forest(hares);
        forest1.setSeason("зима");
        // поменяйте время года на зиму

        System.out.println("Список зайцев:");
        // напечатайте список всех зайцев
        forest.printHares();

    }

}
