package com.aberneko.learning.Arrays.HashMap.UsageExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<String, String> officeTool = new HashMap<>();
        officeTool.put("S234", "Большой степлер");
        officeTool.put("P342", "Чёрно-белый принтер из коридора");
        officeTool.put("N845", "Острые ножницы");
        System.out.println(officeTool);
        System.out.println("-----------------------------------------------------------------------------------------");
        officeTool.put("P342", "Принтер из офиса 42");
        // теперь ключу P342 соответствует значение "Принтер из офиса 42"
        System.out.println(officeTool);
        String tool = officeTool.get("N845"); // метод для получения значения
        System.out.println(tool); // получили "Острые ножницы"
        System.out.println("-----------------------------------------------------------------------------------------");


        HashMap<Double, String> officeTool2 = new HashMap<>();
        officeTool2.put(23.4, "Большой степлер");
        officeTool2.put(56.6, "Чёрно-белый принтер из коридора");
        officeTool2.put(98.0, "Острые ножницы");
        System.out.println(officeTool2);
        System.out.println("-----------------------------------------------------------------------------------------");


        HashMap<String, String> statesCapitals = new HashMap<>();
        statesCapitals.put("Канада", "Торонто");
        statesCapitals.put("Ирак", "Багдад");
        statesCapitals.put("Австрия", "Вена");
        statesCapitals.put("Канада", "Оттава");
        System.out.println(statesCapitals);
        System.out.println("-----------------------------------------------------------------------------------------");


        HashMap<String, ArrayList<Double>> menu = new HashMap<>(); // создаём хеш-таблицу
        ArrayList<Double> mohitoPrice = new ArrayList<>(); // создаём список с ценами для коктейля
        mohitoPrice.add(350.0);  // добавляем в список цену в рублях
        mohitoPrice.add(15.50);  // добавляем в список цену в долларах
        mohitoPrice.add(13.20);  // добавляем в список цену в евро
        menu.put("Коктейль Mojito", mohitoPrice); // добавляем коктейль и список ценами в хеш-таблицу

        ArrayList<Double> tiramisuPrice = new ArrayList<>();  // создаём список с ценами для тирамису
        tiramisuPrice.add(120.0);
        tiramisuPrice.add(4.00);
        tiramisuPrice.add(3.20);
        menu.put("Тирамису", tiramisuPrice); // добавляем тирамису и список с ценами в хеш-таблицу

        ArrayList<Double> ramenPrice = new ArrayList<>(); // создаём список с ценами для рамена
        ramenPrice.add(230.0);
        ramenPrice.add(8.50);
        ramenPrice.add(7.00);
        menu.put("Рамен", ramenPrice); // добавляем рамен и список с ценами в хеш-таблицу
        System.out.println(menu);
        System.out.println("-----------------------------------------------------------------------------------------");


        HashMap<String, ArrayList<Integer>> stateHolidays = new HashMap<>();
        ArrayList<Integer> january = new ArrayList<>();
        january.add(1);
        january.add(7);
        ArrayList<Integer> february = new ArrayList<>();
        february.add(23);
        ArrayList<Integer> march = new ArrayList<>();
        march.add(8);
        ArrayList<Integer> may = new ArrayList<>();
        may.add(1);
        may.add(9);
        ArrayList<Integer> june = new ArrayList<>();
        june.add(12);
        ArrayList<Integer> november = new ArrayList<>();
        november.add(4);

        stateHolidays.put("Январь", january);
        stateHolidays.put("Февраль", february);
        stateHolidays.put("Март", march);
        stateHolidays.put("Май", may);
        stateHolidays.put("Июнь", june);
        stateHolidays.put("Ноябрь", november);

        System.out.println(stateHolidays);
        System.out.println("-----------------------------------------------------------------------------------------");


        HashMap<String, ArrayList<Integer>> orders = new HashMap<>();

        ArrayList<Integer> ordersNum = new ArrayList<>(); // создаём новый список
        ordersNum.add(1);
        ordersNum.add(5);
        ordersNum.add(6);
        orders.put("Иван И.", ordersNum); // добавили имя клиента и список его заказов

        /* Для нового клиента новый список.
           Можно не создавать ещё одну переменную, а переиспользовать имеющуюся.*/
        ordersNum = new ArrayList<>();
        ordersNum.add(2);
        ordersNum.add(4);
        ordersNum.add(3);
        orders.put("Ольга С.", ordersNum);

        // заводим переменную для списка заказов конкретного клиента
        ArrayList<Integer> customerOrders = orders.get("Иван И.");
        // печатаем номера заказов конкретного клиента
        for (int orderNum : customerOrders) {
            System.out.println("Заказ № " + orderNum);
        }
        System.out.println("-----------------------------------------------------------------------------------------");


        HashMap<String, String> officeTool3 = new HashMap<>();
        officeTool3.put("S234", "Большой степлер");
        officeTool3.put("P342", "Чёрно-белый принтер");
        officeTool3.put("N845", "Острые ножницы");

        for (String tool3 : officeTool.values()) { // переменная tool3 типа Значения - не ключа !
            if (tool3.equals("Острые ножницы")) { // сравниваем с каждым элементом
                System.out.println(tool); // получили "Острые ножницы"
            }
        }

        for (String tool3 : officeTool.values()) { // переменная tool3 типа Значения - не ключа !
            System.out.println(tool3); // выводим все значения
        }


        System.out.println("-----------------------------------------------------------------------------------------");

        // В таблице собраны имена клиентов зоомагазина и сумма, на которую они делали заказы. Посчитайте, сколько всего
        // денег было потрачено на питомцев.

        HashMap<String, Double> orders1 = new HashMap<>();
        orders1.put("Иван И.", 4345.5);
        orders1.put("Ольга С.", 76564.43);
        orders1.put("Александр Т.", 1234.86);
        orders1.put("Александр Р.", 23432.87);
        orders1.put("Екатерина О.", 1034753.6);
        orders1.put("Ярослав В.", 450.0);

        double sum = 0;
        for (Double ord : orders1.values()) {
            sum += ord;
        }

        System.out.println("Всего было совершено заказов на сумму: " + sum);
        System.out.println("-----------------------------------------------------------------------------------------");



        HashMap<String, String> officeTool1 = new HashMap<>();
        officeTool1.put("S234", "Большой степлер");
        officeTool1.put("P342", "Чёрно-белый принтер");
        officeTool1.put("N845", "Острые ножницы");

        for (String inventory : officeTool1.keySet()) { // проходимся по ключам
                                                        // переменная tool3 типа Ключа - не значения !
            System.out.println(inventory);
        }

        officeTool1.remove("S234");
        System.out.println("Элемент большой степлер удалён");
        System.out.println(officeTool1);
        System.out.println(officeTool1.get("S234")); // вывод: null

        officeTool1.clear(); // в хеш-таблице больше нет элементов
        System.out.println(officeTool1);
        System.out.println("-----------------------------------------------------------------------------------------");

        // Допишите код приложения, которое позволяет пользователям узнать год основания легендарных музыкальных
        // коллективов, а также сохранить информацию о своей любимой группе.
        // Вам нужно объявить и проинициализировать хеш-таблицу, напечатать все хранящиеся в ней группы, а также
        // дописать реализацию цифрового меню. Для считывания из консоли пользуйтесь методами nextLine() или nextInt(),
        // но учитывайте, что после использования nextInt() сканер остается на конце считанной строки даже если она
        // пустая и её надо будет дочитать, чтобы перейти на следующую. Это можно сделать также методом nextLine().
        // В комментариях оставлены фразы для печати и имена переменных.


        HashMap<String, Integer> musicGroups = new HashMap<>(); // объявите и проиницализируйте хеш-таблицу musicGroups
        musicGroups.put("The Beatles", 1960);
        musicGroups.put("Rammstein", 1994);
        musicGroups.put("Queen", 1970);
        musicGroups.put("Led Zeppelin", 1968);
        musicGroups.put("Black Sabbath", 1968);
        musicGroups.put("AC/DC", 1973);
        musicGroups.put("The Rolling Stones", 1962);
        musicGroups.put("The Who", 1964);
        musicGroups.put("Nightwish", 1996);
        musicGroups.put("Nirvana", 1987);
        musicGroups.put("Guns N’ Roses", 1985);
        musicGroups.put("Scorpions", 1965);
        musicGroups.put("Kiss", 1973);
        musicGroups.put("The Doors", 1965);

        System.out.println("Легендарные группы, год основания которых вы можете узнать:");
        for (String group : musicGroups.keySet()) {
            System.out.println(group);
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите опцию");
            System.out.println("1 - Узнать год основания группы");
            System.out.println("2 - Добавить любимую группу");
            System.out.println("3 - Выйти из приложения");
            int command = scanner.nextInt();
            if (command == 1) {
                System.out.print("Введите название группы: ");// "Введите название группы"
                String keyGroup = scanner.next(); // keyGroup
                scanner.nextLine();
                int year = musicGroups.get(keyGroup);// year
                System.out.println("Год основания " + keyGroup);
                System.out.println(year);

            } else if (command == 2) {
                System.out.println("Добавьте свою любимую группу"); // "Добавьте свою любимую группу"
                System.out.println("Введите её название"); // "Введите её название"
                String nameGroup = scanner.next();
                scanner.nextLine();// nameGroup
                System.out.println("Введите год основания"); // "Введите год основания"
                int bornYear = scanner.nextInt(); // bornYear
                musicGroups.put(nameGroup, bornYear);
                System.out.println("Информация о группе " + nameGroup + " добавлена.");

            } else if (command == 3) {
              return; // остановите цикл
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }
    }
}


