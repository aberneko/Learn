package com.aberneko.learning.arraylist;

import java.util.ArrayList;

public class ArrayListDemo {
    void main() {

        ArrayList<String> studentNames = new ArrayList<>();// Создание списка имён

        for(int i = 0; i < 100; i++) {
            String addq = "Элемент + " + i;
            studentNames.add(addq);
        }

        System.out.println(studentNames);

        ArrayList<Double> expenses = new ArrayList<>(); // создали список трат
        expenses.add(32.2); // добавили трату в список
        expenses.add(0, Double.parseDouble("12")); // добавили значение по индексу + парсим строки
        expenses.add(100.0); // Добавили - index(2)
        expenses.add(200.0); // Добавили индекс (3);
        expenses.remove(200.0); // удаление по объекту
        expenses.remove(2); // удаление по индексу
        double count = expenses.get(1); // примитив получил значение из списка по индексу
        System.out.println(count); // вывели значение

        System.out.println(expenses); // Вывели список
        System.out.println("Размер: " + expenses.size()); // вывели размер списка

        //--------------------------------------------------------------------------------------------------

        ArrayList<String> femaleNames = new ArrayList<>(); // Создайте список
        femaleNames.add("Екатерина");
        femaleNames.add("Мария");
        femaleNames.add("Анна");
        femaleNames.add("1");
        femaleNames.add(1, "Наталья");

        System.out.println(femaleNames);

        double count2 = Double.parseDouble(femaleNames.get(4)); // присваиваем примитиву полученое
        // из списка значение + парсим строки
        System.out.println(count2);

        // ----------------------------------------------------------------------------------------------

        ArrayList<Integer> amount = new ArrayList<>();
        amount.add(10);
        amount.add(20);
        amount.add(30);
        amount.add(40);

        for (int i = 0; i < amount.size(); i++) {
            System.out.println((i + 1) + " день: " + amount.get(i));
        }

        //-----------------------------------------------------------------------------------------------

        ArrayList<Double> temperatures = new ArrayList<>();
        temperatures.add(92.3);
        temperatures.add(12.4);
        temperatures.add(74.1);
        temperatures.add(45.0);


        double max = 0;
        for (int i = 0; i < temperatures.size(); i++) {
            max = Double.max(max, temperatures.get(i));
        }
        System.out.println("Самая высокая температура: " + max + " °С.");

        //-----------------------------------------------------------------------------------------------

        for (Double temp : temperatures) { // Принимает два параметра: переменную типа, и сам список
            // так сказать накладывает на список сам цикл, тоесть просит что бы код
            // выполнялся в самом цикле
            System.out.println("Воть: " + temp);
        }

        //-----------------------------------------------------------------------------------------------

        //В списке speeds хранится информация о скоростях автомобиля на разных участках дороги.
        // С помощью короткой формы цикла for и метода size() посчитайте среднюю скорость.

        ArrayList<Integer> speeds = new ArrayList<>(); // объявите список
        speeds.add(120);
        speeds.add(75);
        speeds.add(42);
        speeds.add(60);
        speeds.add(110);
        speeds.add(20);

        int sum = 0;
        for (Integer speed : speeds) {
            sum += speed;  // сложите все значения в списке
        }

        int averageSpeed = sum / speeds.size(); // вычислите среднюю скорость
        System.out.println("Средняя скорость равна " + averageSpeed + " км/ч");

        speeds.clear(); // очистили список от элементов
        System.out.println(speeds.size()); // вывели размер списка после очистки

        speeds.add(120);
        speeds.add(75);
        speeds.add(42);
        speeds.add(60);
        speeds.add(110);
        speeds.add(20);

        if (speeds.isEmpty()) {
            System.out.println("Список пустой");
        } else {
            System.out.println("В списке " + speeds.size() + " элемента");
        }

        boolean isSpeeds = speeds.contains(112);

        if (isSpeeds == false) {
            speeds.add(0,112);
            System.out.println("Добавлен потерявшийся элемент");
        } else {
            System.out.println("такой элемнет уже есть");
        }

        speeds.remove(0);

        if (isSpeeds) {
            System.out.println("такой элемнет уже есть");
        } else {
            speeds.add(0,112);
            System.out.println("Добавлен потерявшийся элемент");
        }

        if (isSpeeds == true) {
            speeds.add(0,112);
            System.out.println("Добавлен потерявшийся элемент");
        } else {
            System.out.println("такой элемнет уже есть");
        }

    }




}
