package com.aberneko.learning.CollectionF.Interfes.Mapa.AbstractMap.TreeMap;

import java.util.TreeMap;

//  public TreeMap() — пустой, использует натуральный порядок (через Comparable).

//  public TreeMap(Comparator<? super K> comparator) — принимает твой кастомный компаратор (то, что ты сейчас и делаешь).

//  public TreeMap(Map<? extends K, ? extends V> m) — создает дерево из другой карты (конвертация).

//  public TreeMap(SortedMap<K, ? extends V> m) — создает дерево из другой отсортированной карты (копирует и порядок, и данные).

public class TreeMapa {

    public enum Parameters{
        BY_AGE,
        BY_NAME
    }

    TreeMap<UserComparator, String> treeMapaComparator;

    public TreeMapa() {
        this.treeMapaComparator = new TreeMap<>(new ComporatorByUser());
    }

    public TreeMapa(Parameters mode) { // конструктор для выбора сортировки
        if (mode == Parameters.BY_AGE) {
            this.treeMapaComparator = new TreeMap<>(new ComporatorByAge());
        } else {
            this.treeMapaComparator = new TreeMap<>(new ComporatorByUser());
        }
    }

    static void main() {

        // TreeMap<UserComparator, String> treeMap = new TreeMap<>(); - при использовании конструктора по умолчании сразу дают понять что не реализован интерфейс comparable


        // Тут я немного намудрил с классом сверху поэтому пришлось вот так вот выкручиватся
        TreeMapa treeMapa = new TreeMapa(Parameters.BY_AGE);
        treeMapa.treeMapaComparator.put(new UserComparator("Женя", 19), "привет привет");
        treeMapa.treeMapaComparator.put(new UserComparator("Алеся", 56), "додик");
        treeMapa.treeMapaComparator.put(new UserComparator("Варенье", 6), "скоро умрёт");
        treeMapa.treeMapaComparator.put(new UserComparator("Какаши", 35), "хокаге");
        treeMapa.treeMapaComparator.put(new UserComparator("Кристина", 23), "жесть");
        System.out.println();

        System.out.println("НЕ УДАЛЯЮТ ДАННЫЕ ИЗ ТАБЛИЦЫ");
        System.out.println("Первый вариант, только ключ -> " + treeMapa.treeMapaComparator.firstKey() +
                " | Второй вариант, и ключ и значение -> " + treeMapa.treeMapaComparator.firstEntry()); // Вызывает первую запись
        System.out.println("Первый вариант, только ключ -> " + treeMapa.treeMapaComparator.lastKey() +
                " | Второй вариант, и ключ и значение -> " + treeMapa.treeMapaComparator.lastEntry()); // Вызывает последнюю запись
        System.out.println();

        treeMapa.treeMapaComparator.forEach((user, text) ->
                System.out.println(user.getName() + " [" + user.getAge() + "]: " + text));

        System.out.println();
        System.out.println("УДАЛЯЮТ ДАННЫЕ ИЗ ТАБЛИЦЫ");
        System.out.println("Первый запись -> " + treeMapa.treeMapaComparator.pollFirstEntry()); // Вызывает первую запись
        System.out.println("Последняя запись -> " + treeMapa.treeMapaComparator.pollLastEntry()); // Вызывает последнюю запись
        System.out.println();

        treeMapa.treeMapaComparator.forEach((user, text) ->
                System.out.println(user.getName() + " [" + user.getAge() + "]: " + text));


        System.out.println("-----------------------------------------------------------------------------------------");

        TreeMap<UserComparable, String> treeMapComparable = new TreeMap<>();
        treeMapComparable.put(new UserComparable(876, "Женя"), "привет привет");
        treeMapComparable.put(new UserComparable(9, "Кристина"), "срать срать");
        treeMapComparable.put(new UserComparable(100, "Масаки"), "салютик");
        treeMapComparable.put(new UserComparable(78, "Куросаки"), "пока ка");
        treeMapComparable.put(new UserComparable(9999, "Куротчи"), "тупой");

        treeMapComparable.forEach((user, text) ->
                System.out.println(user.getName() + " [" + user.getUserId() + "]: " + text));

        System.out.println("НЕ УДАЛЯЮТ ДАННЫЕ ИЗ ТАБЛИЦЫ");
        System.out.println("Первый вариант, только ключ -> " + treeMapComparable.firstKey() +
                " | Второй вариант, и ключ и значение -> " + treeMapComparable.firstEntry()); // Вызывает первую запись
        System.out.println("Первый вариант, только ключ -> " + treeMapComparable.lastKey() +
                " | Второй вариант, и ключ и значение -> " + treeMapComparable.lastEntry()); // Вызывает последнюю запись
        System.out.println();
    }



}











