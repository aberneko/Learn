package com.aberneko.learning.object.HashCode;

import java.util.ArrayList;
import java.util.HashMap;

import static java.lang.System.out;

public class Practicum {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>(); // cписок имён и фамилий
        HashMap<Person, String> contacts = new HashMap<>(); // хеш-таблица контактов

        String firstName = "Стив";
        String lastName = "Джобс";
        String phoneNumber = "8 (988) 123-45-67";

        persons.add(new Person(firstName, lastName));

        contacts.put(new Person(firstName, lastName), phoneNumber);

        out.println("Количество людей в списке: " + persons.size() +
                ", контактов: " + contacts.size());

        if(persons.contains(new Person(firstName, lastName))) {
            out.println("Человек с именем " + firstName +
                    " и фамилией " + lastName + " найден в списке.");
        } else {
            out.println("Метод equals у класса Person реализован неверно!");
        }

        if (contacts.containsKey(new Person(firstName, lastName))) {
            out.println("Человек с именем " + firstName + " и фамилией " +
                    lastName + " найден в таблице контактов. Его телефонный номер: " +
                    contacts.get(new Person(firstName, lastName)));
        } else {
            out.println("Метод hashCode у класса Person реализован неверно!");
            out.println();
        }
    }
}
