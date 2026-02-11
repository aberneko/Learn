package com.aberneko.learning.CollectionF.Interfes.Itarable.Collection.List.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;


public class NestedListsDemo {

//    Создайте список массивов, в котором будут храниться наборы целых чисел.
//    Добавьте в список три массива разной длины, например:
//        [1, 2, 3]
//        [10, 20]
//        [5, 6, 7, 8]
//    Пройдитесь циклом по списку и выведите каждый массив построчно.
//    Формат вывода: все элементы массива через запятую.



    static void main(String[] args) {

        ArrayList<int[]> ar = new ArrayList<>();

        ar.add(new int[]{1,2,3});
        ar.add(new int[]{10,20});
        ar.add(new int[]{5,6,7,8});

        for (int[] arr: ar) {
            if (arr.length > 0){
                System.out.print(arr[0]);
                for (int i = 1; i < arr.length; i++) {
                    System.out.print(", " + arr[i]);
                }
            } else {
                System.out.println("Массив пуст");
            }
            System.out.println();
        }

        // Расширенный цикл for остается для итерации по коллекции ar
        for (int[] arr: ar) {
            // Весь ваш блок if/for заменяется одной строкой
            String arrayString = Arrays.toString(arr);

            // Чтобы получить формат без скобок, просто обрезаем [ и ]
            String cleanOutput = arrayString.substring(1, arrayString.length() - 1);

            System.out.println(cleanOutput);
        }

    }
}


class Task11 {

//    Для школьных уроков рукоделия придумайте хранилище вариантов для поделок, это могут быть фигуры с разным числом
//    сторон и размером этих сторон. Учитель должен иметь возможность хранить различные варианты фигур. Фигуры должны
//    храниться в формате N, a, b, c… где N это количество углов (например, 3 у треугольника или 4 у прямоугольника).
//    Таким образом, получается хранилище, в которое можно добавить любое количество фигур, но каждая фигура должна
//    содержать конечное число значений типа int.

    public static ArrayList<int[]> figures = new ArrayList<>(); // Придумайте тип хранилища фигур

    static void main(String[] args) {

        addTriangle(3, 4, 5);
        addTriangle(5, 6, 10);
        addRectangle(15, 25);
        addStar5(1, 2, 3, 3, 2);
        addStar5(2, 2, 2, 2, 2);

        for (int[] figure: figures) {
            System.out.print(figure[0]);
            for (int i = 1; i < figure.length; i++) {
                System.out.print(",");
                System.out.print(figure[i]);
            }
            System.out.println();
        }
    }

    public static int[] addTriangle(int a, int b, int c) {
        int[] tri = {3, a, b, c};
        figures.add(tri);
        return tri;
    }

    public static int[] addRectangle(int width, int height) {
        int[] rect = {4, width, height};
        figures.add(rect);
        return rect;
    }

    public static int[] addStar5(int l0, int l1, int l2, int l3, int l4) {
        int[] star = {5, l0, l1, l2, l3, l4};
        figures.add(star);
        return star;
    }

}

