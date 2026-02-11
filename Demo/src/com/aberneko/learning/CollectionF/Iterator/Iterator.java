package com.aberneko.learning.CollectionF.Iterator;

import java.util.ArrayList;

public class Iterator {
    static void main() {

        final ArrayList<String> list = new ArrayList<>();
        list.add("Ghbdtn");
        list.add("fkdsf");
        list.add("sdfsdf");


        final java.util.Iterator<String> iterator; // создали обходчика
        iterator = list.iterator();

        while(iterator.hasNext()) { // Пока обходчик видит впереди цель (hasNext)
            final String element = iterator.next(); // вытягиваем элементы
            System.out.println(element);
        }
    }
}
