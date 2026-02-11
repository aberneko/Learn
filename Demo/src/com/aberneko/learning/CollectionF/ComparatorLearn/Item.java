package com.aberneko.learning.CollectionF.ComparatorLearn;

import java.util.*;

public class Item {

    public final String name;
    public final int price;
    public final int populerity;

    public Item(String name, int price, int populerity) {
        this.name = name;
        this.price = price;
        this.populerity = populerity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + this.name + '\'' +
                ", price=" + this.price +
                ", populerity=" + this.populerity +
                '}';

    }
}


class ItemPriceComparator implements Comparator<Item> {

//    @Override
//    public int compare(Item item1, Item item2) {
//        if (item1.price < item2.price) {
//            return -1;
//        }
//
//         else if (item1.price == item2.price)  {
//            return 0;
//        }
//
//        else {
//            return 1;
//        }
//    }

//    @Override
//    public int compare(Item item1, Item item2) {
//        return item1.price - item2.price; // упрощение
//    }

//    Классы-обёртки, такие как Integer или Double, не реализуют компараторы, но содержат статические методы compare(...),
//    которые можно использовать. Если воспользоваться методом Integer.compare(Integer, Integer), код нашего компаратора
//    цен товаров ItemPriceComparator можно переписать так:

    @Override
    public int compare(Item item1, Item item2) {

        // используем статический метод compare(Integer, Integer) из класса Integer
        return Integer.compare(item1.price, item2.price);
    }
}

class Main {
    static void main() {
        List<Item> item = new ArrayList<>();
        item.add(new Item("Рубашка", 4500, 37));
        item.add(new Item("Носки", 55, 8));
        item.add(new Item("Толстовка", 1399, 74));
        item.add(new Item("Носки", 169, 19));

        System.out.print("До сортировки: ");
        System.out.println(item);

        ItemPriceComparator itemPriceComparator = new ItemPriceComparator();
        item.sort(itemPriceComparator);

        System.out.print("После сортировки: ");
        System.out.println(item);

        System.out.print("После ревёрса: ");
        Comparator<Item> itemComparator = itemPriceComparator.reversed();
        item.sort(itemComparator);
        System.out.println(item);
    }
}





class Practicum {

    public static void main(String[] args) {

        // создаём список товаров
        List<Item> items = new ArrayList<>();
        items.add(new Item("Рубашка", 4500, 37));
        items.add(new Item("Носки", 55, 8));
        items.add(new Item("Толстовка", 1399, 74));
        items.add(new Item("Носки", 169, 19));

        System.out.println("До сортировки:");
        System.out.println(items);

        // создаём объект-компаратор лексикограической сортировки
        ItemStringInsensitiveNameComparator comparator = new ItemStringInsensitiveNameComparator();

        // применяем компаратор
        items.sort(comparator);

        System.out.println("После сортировки:");
        System.out.println(items);
    }

    static class Item {

        public final String name;
        public final int price;
        public final int popularity;

        public Item(String name, int price, int popularity) {
            this.name = name;
            this.price = price;
            this.popularity = popularity;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    ", popularity=" + popularity +
                    '}';
        }
    }

    static class ItemStringInsensitiveNameComparator implements Comparator<Item> {

        /*
         String.CASE_INSENSITIVE_ORDER принимает строки в качестве аргументов,
         поэтому передадим названия товаров в его метод .compare(...)
         */
        @Override
        public int compare(Item item1, Item item2) {
            return String.CASE_INSENSITIVE_ORDER.compare(item1.name, item2.name);
        }
    }
}

//  String.CASE_INSENSITIVE_ORDER — это не просто вызов метода. Это статическое поле в классе String.
//  Внутри этого поля уже лежит готовый, заранее созданный разработчиками Java объект, который знает,
//  как сравнивать строки «без крика» (игнорируя регистр).
//
//  Когда ты пишешь fruits.sort(String.CASE_INSENSITIVE_ORDER), ты отдаешь этот объект методу sort.


class Practicum1 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Банан");
        fruits.add("Апельсин");
        fruits.add("Яблоко");
        fruits.add("Груша");

        System.out.println(fruits); // [Банан, Апельсин, Яблоко, Груша]

        fruits.sort(String.CASE_INSENSITIVE_ORDER);// Вызовите компаратор String.CASE_INSENSITIVE_ORDER
        // public static final Comparator<String> CASE_INSENSITIVE_ORDER = new CaseInsensitiveComparator();
        // поэтому он его принимает

        System.out.println(fruits); // [Апельсин, Банан, Груша, Яблоко]
    }
}

