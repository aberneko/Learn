package com.aberneko.learning.CollectionF.Interfes.Itarable.Collection.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Learn {
    static void main() {
        System.out.println("1. Создание списков");
        final List<String> emptyList = Collections.emptyList(); // создали пустой список
        final List<String> singletonList = Collections.singletonList("Привет, мир!"); // создали список с одним элементом
        final List<String> nCopiesList = Collections.nCopies(5, "Java"); // создает список с повторяющимся элементом

        System.out.println(emptyList);
        System.out.println(singletonList);
        System.out.println(nCopiesList);






        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("2. Изменение неизменяемого");
        final List<String> immutable = List.of("rr", "yy", "rfr"); // создали неизменяемый список
        final ArrayList<String> mutable = new ArrayList<>(immutable); // переизменили список
        System.out.println(mutable);





        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("3. Замена элементов");
        // Замена всех элементов списка
        List<Long> listOfLongs = new ArrayList<>();
        listOfLongs.add(157478403L);
        listOfLongs.add(2450033L);
        listOfLongs.add(32039458858604L);

        System.out.println(listOfLongs);

        final List<Join> list = new ArrayList<>();
        list.add(new Join("Женя", "Самусенко", 14));
        System.out.println(list);

        Collections.fill(list, new Join("Кристина", "Верненич", 16)); // Одно из частых применений этого метода — подготовка данных для тестов в программе.
        System.out.println(list);





        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("4. Копирование элементов");

        List<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(9999);
        System.out.println("Список из которого копируем: " + number);

        List<Integer> numberDouble = new ArrayList<>();
        numberDouble.add(3);
        numberDouble.add(4);
        numberDouble.add(5);
        System.out.println("Список до копирования: " + numberDouble);

        Collections.copy(numberDouble, number);
//        Метод Collections.copy не меняет структуру твоего списка-приемника (dest)
//        Он просто берет ссылки на объекты из src и записывает их в ячейки dest, затирая то, что там лежало раньше.
        System.out.println("Список куда копируем: " + numberDouble);
        // Collections.copy(numberDouble, number);
//        Из src (number) вылетают объекты типа Integer. Значит, компилятор фиксирует: T = Integer
//        В dest (numberDouble) по контракту должны приниматься объекты типа T или его предков (? super T).
//        Компилятор проверяет: «Является ли Double (тип твоего dest) предком для Integer?».
//        Ответ: Нет. Они — разные ветки одного родителя (Number).

        numberDouble.remove(2);
        System.out.println("Смотрим изменился ли список number после удаления из numberDouble: " + number);
        System.out.println("Смотрим изменился ли список numberDouble: " + numberDouble);



        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("5. Сортировка");

        ArrayList<String> wordSort = new ArrayList<>();
        wordSort.add("Кристиннн");
        wordSort.add("Кристинка");
        wordSort.add("Кристюсик");

        Collections.sort(wordSort, String.CASE_INSENSITIVE_ORDER); // либо List.sort(Comparator)
        System.out.println(wordSort);





        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("6. Поиск минимума и максимума");
        System.out.println("Интерфейс Comparable");

        final Join a = new Join("Женя", "Самусенко", 10);
        final Join b = new Join("Кристинка", "Веренич", 12);
        final Join c = new Join("Аааа", "ббббб", 45);

        List<Join> list2 = new ArrayList<>(List.of(a, b, c));

        Collections.sort(list2);
        System.out.println(list2);


        System.out.println(Collections.min(list2));
        System.out.println(Collections.max(list2));

     }

     static class Join implements Comparable<Join>{ // 6 пункт
        public String name;
        public String surname;
        public int age;

        public Join(String name, String surname, int age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

         @Override
         public String toString() {
             return String.format("%s %s %d", name, surname, age);
         }

         @Override
         public int compareTo(Join o) {
             final int nameComparison = String.CASE_INSENSITIVE_ORDER.compare(this.name, o.name);
             if(nameComparison != 0) {
                 return nameComparison;
             } else {
                 return Integer.compare(this.age, o.age);
             }
         }
     }

}

