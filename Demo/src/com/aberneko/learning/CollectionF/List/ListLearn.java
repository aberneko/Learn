package Collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListLearn {
    static void main() {
        List<String> cities = List.of("Воронеж", "Южно-Сахалинск", "Иркутск");
        List<String> cities2 = Arrays.asList("Воронеж", "Южно-Сахалинск", "Иркутск");
        List<String> cities3 = new ArrayList<>();
        System.out.println(cities.getClass());
        System.out.println(cities2.getClass());
        System.out.println(cities3.getClass());
    }
}

class ArrayMas {
    static void main() {
        List<String> cities = Arrays.asList("Лида","Миннск","Гродно");

        String[] citiesArray = cities.toArray(new String[]{});

        System.out.println(cities);

        for(String city: citiesArray) {
            System.out.println(city + ", ");
        }
    }
}

class ArrayMas1 {
    static void main() {
        List<String> cities = Arrays.asList("Лида","Миннск","Гродно");

        String[] citiesArray = new String[3];

        String[] otherCities = cities.toArray(citiesArray);

        for(String city: citiesArray) {
            System.out.print(city + ", ");
        }

        System.out.println(" ");

        for(String cit: otherCities) {
            System.out.print(cit + ", ");
        }

        System.out.println(" ");

        System.out.println(cities);
    }
}
