package JUnit.Method;
import com.aberneko.learning.Object.Equals.RuleContract.Song;
import org.junit.jupiter.api.Assertions; // подключили зависимости
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.*; // импортируются все методы сразу

public class Method {

    // Проверить, что значение переменной равно null, можно с помощью метода
    @Test
    public void shouldBeNull() {
        String nullString = null;
        //Assertions.assertEquals(null, nullString); // более громозкий
        Assertions.assertNull(nullString); // лаконичный
    }

    // А если нужно удостовериться, что значение не равно null, понадобится метод
    @Test
    public void shouldBeNotNull() {
        String apple = "Яблочки";
        //Assertions.assertNotEquals(null, apple); // избыточно
        Assertions.assertNotNull(apple); // лаконично
    }


    // ПРОВЕРКА БУЛЕВОГО ЗНАЧЕНИЯ -ПРАВДА
    @Test
    public void shouldBeTrue() {
        boolean value = 5 > 10;
        Assertions.assertEquals(true, value, "Вы еблан вы провалили тест");
        //assertTrue(value);
    }

    // ПРОВЕРКА БУЛЕВОГО ЗНАЧЕНИЯ -ЛОЖЬ
    @Test
    public void shouldBeFalse() {
        boolean value = 5 > 10;
        //Assertions.assertEquals(true, value, "Вы еблан вы провалили тест");
        assertFalse(value);
    }

}


class Method2 { // Тут испортировали напрямую методы для сокращения записи
    // Проверить, что значение переменной равно null, можно с помощью метода
    @Test
    public void shouldBeNull() {
        String nullString = null;
        //Assertions.assertEquals(null, nullString); // более громозкий
        assertNull(nullString); // лаконичный
    }

    // А если нужно удостовериться, что значение не равно null, понадобится метод
    @Test
    public void shouldBeNotNull() {
        String apple = "Яблочки";
        //Assertions.assertNotEquals(null, apple); // избыточно
        assertNotNull(apple); // лаконично
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// МЕТОД ПРОВЕРКИ assertEquals
class IncorrectEqualsTest {

    @Test
    public void shouldReturnEquals() {
        Item item1 = new Item("яблоки", 50);
        Item item2 = new Item("яблоки", 50);

        assertEquals(item2, item1); //несработает если не переопределить метод сравнения в классе
    }
}

class Item {

    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) { // переопределии метод
        if(this ==  obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Item item = (Item) obj;
        return price == item.price && Objects.equals(name, item.name);
    }

}


// ПРОВЕРКА МАССИВОВ
class ArrayTest {
    //Поскольку у массивов нет своего собственного класса нельзя зайти в класс и перепесать код
    @Test
    public void shouldArray() {

        String[] arrayOne = {"Привет", "Пока", "Давай"};
        String[] arrayTwo = {"Привет", "Пока", "Давай"};

        // смотрим результат проверки он будет false потому что используется сравнение по усолчанию
        System.out.println("Равенство массивов: " + arrayOne.equals(arrayTwo));

        // а тут уже реальный тест, в котором мы сравниваем содержимое
        assertArrayEquals(arrayTwo, arrayOne, "Не равны");

    }
}


