package JUnit;
import org.junit.jupiter.api.Assertions; // подключили зависимости
import org.junit.jupiter.api.Test;

public class DiscountCalculator { // Класс, который будем тестировать

    public int sumAfterDiscount(int sum) {
        if (sum < 1000) {
            return sum;
        } else {
            return (int) (sum * 0.98);
        }
    }

    static void main() {
        DiscountCalculator discountCalculator = new DiscountCalculator();
        System.out.println(discountCalculator.sumAfterDiscount(1000));
    }


}

// РУЧНОЕ ТЕСТИРОВАНИЕ
// Нужно написать метод, который будет сравнивать 2 значения произвольного типа и говорить, равны они или нет.

// Напишем метод в классе
class TestLibrary {
    public static <T> void assertEquals(T one, T two) {
        if(!one.equals(two)) {
            System.out.printf("actual value [%s] not equal to expected [%s]", one, two);
        } else {
            System.out.println("Все работает");
        }
    }
}

// Теперь создадим класс, который и будет тестировать наш основной класс

class DiscountCalculatorTest { // Добавили окончание Test в конце класса, для различия

    DiscountCalculator discountCalculator = new DiscountCalculator(); //  создаем объект основного класса

    // Создадим метод, который будет реализовывать наш тест-кейс
    public void shouldGiveNoDiscountForValue999() {
        // Подготовка - с чем мы будем работать ?
        int buySum = 1000;
        int expectedSum = 978;


        // Исполнение - выполняем нашу программу
        int resultSum = discountCalculator.sumAfterDiscount(buySum); // записываем результат в переменную

        //Проверка - вызываем метод, который проверит наше число - которое мы ожидаем с числом которое вернут метод из основного класса
        TestLibrary.assertEquals(expectedSum, resultSum);
    }

    static void main() {
        DiscountCalculatorTest discountCalculatorTest = new DiscountCalculatorTest();
        discountCalculatorTest.shouldGiveNoDiscountForValue999();
    }

}




// Теперь проведем тестирование с помощью framework JUnit - Автоматическое
// Первым шагом подключим его - смотри сверху

// теперь создадим метод и пометим его аннотацией

class DiscountCalculatorTest2 {

    DiscountCalculator discountCalculator = new DiscountCalculator();

    @Test // Аннотация
    public void shouldGiveNoDiscountForValue999() {
        // Подготовка
        int buySum = 9994;
        int expectedSum = 9794;

        // Исполнение
        int resultSum = discountCalculator.sumAfterDiscount(buySum);

        // Проверка
        Assertions.assertEquals(expectedSum, resultSum); // вызываем встроенные метод
        // assertEquals() - статичесеский метод который примимает в себя 2 - 3 агрумента.
        // Первый это ожидаемый результат, второй - фактический.
        // Третий аргумент — необязательная строка, которая выведется, если фактический результат не равен ожидаемому, другими словами, если тест обнаружит ошибку.

    }
}



