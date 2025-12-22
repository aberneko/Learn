package com.aberneko.learning.encapsulation.Static;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main() {

        Sort sort = new Sort();
        // В методе main:
        String input = "Иванов Иван";
        String[] parts = input.split(" "); // Режем сами
        PersonName p = new PersonName(parts[0], parts[1]); // Передаем кусочки

        System.out.println("Заполняем массив.....");
        sort.auto();
        System.out.println("Соритируем массив.....");

    }
}

class Sort {
    Random random = new Random();
    int[] array2;

    Sort() {
        array2 = new int[10];
    }

    public void auto() {
        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array2));
    }
}

class PersonName {

        private String lastName;
        private String firstName;

    public PersonName(String part, String part1) {
    }

    // возвращает PersonName из заданной строки:
        public  PersonName parse(String fullName) {
        /* Метод разделяет (англ. split) строку по символу пробела.
        В результате в переменной parts будет массив из двух элементов: фамилия, имя*/
            String[] parts = fullName.split(" ");

            this.lastName = parts[0];
            this.firstName = parts[1];

            return this;
        }
}

