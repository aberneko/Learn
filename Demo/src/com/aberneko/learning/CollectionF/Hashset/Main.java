package Collection.Hashset;

import java.util.HashSet;
import java.util.Set;

/// Множество может содержать в себе только уникальные объекты. Добавить в него несколько одинаковых элементов не получится
/// Элементы, хранящиеся в множестве, не упорядочены. Хотя некоторые реализации интерфейса Set позволяют задавать порядок объектов, в классическом множестве этого нет.

public class Main {

    final static Set<String> number = new HashSet<>();

    static void main() {
        number.add("4367 7567 8421 1133");
        number.add("3568 4568 4852 3256");
        number.add("3579 1598 3251 1102");

        String newCart = "1111 1111 1111 1111";

        System.out.println("Новый номер ---> " + newCart + " Свободен ли? " + !number.contains(newCart));
    }
}
