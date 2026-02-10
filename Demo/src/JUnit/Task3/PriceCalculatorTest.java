package JUnit.Task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PriceCalculatorTest {

    private final PriceCalculator priceCalculator = new PriceCalculator();

    @Test
    public void shouldBeNegativeWhenBikeAndDistanceIs0Km() {
        Assertions.assertTrue(priceCalculator.calculatePrice(TransportType.BIKE, 0) < 0);
    }

    @Test
    public void shouldBePriceWhenBikeAndDistanceIs20Km() {
        // Граничное значение: Ровно 20. "Включительно", значит должна быть цена!
        // 20 км * 10 (цена) = 200
        Assertions.assertEquals(200, priceCalculator.calculatePrice(TransportType.BIKE, 20));
    }

    @Test
    public void shouldBeNegativeWhenBikeAndDistanceIs21Km() {
        // Граничное значение: 21. Это уже за границей (больше 20). Должно вернуть -2.
        Assertions.assertEquals(-2, priceCalculator.calculatePrice(TransportType.BIKE, 21));
    }

    @Test
    public void shouldBePriceForAverageDistance() {
        // Класс эквивалентности: берем любое число из середины (например, 10 км).
        Assertions.assertEquals(100, priceCalculator.calculatePrice(TransportType.BIKE, 10));
    }

    @Test
    public void shouldReturnErrorWhenCarDistanceIs0Km() {
        // Граница: ровно 0. По коду это return -1
        Assertions.assertEquals(-1, priceCalculator.calculatePrice(TransportType.CAR, 0));
    }

    @Test
    public void shouldCalculatePriceWhenCarDistanceIs1000Km() {
        // Самая важная граница: 1000 км "включительно"
        // 1000 * 7 (CAR_PRICE_PER_KM) = 7000
        Assertions.assertEquals(7000, priceCalculator.calculatePrice(TransportType.CAR, 1000));
    }

    @Test
    public void shouldReturnErrorWhenCarDistanceIs1001Km() {
        // Граница + 1: Проверяем, что на 1001 км машина уже не везет
        Assertions.assertEquals(-2, priceCalculator.calculatePrice(TransportType.CAR, 1001));
    }

    @Test
    public void shouldCalculatePriceForNormalCarDistance() {
        // Класс эквивалентности: любое число из середины (например, 500 км)
        Assertions.assertEquals(3500, priceCalculator.calculatePrice(TransportType.CAR, 500));
    }

    @Test
    public void shouldReturnErrorWhenTruckDistanceIs0Km() {
        // Граница: ровно 0. Должно вернуть -1 (ошибка)
        Assertions.assertEquals(-1, priceCalculator.calculatePrice(TransportType.TRUCK, 0));
    }

    @Test
    public void shouldCalculatePriceWhenTruckDistanceIs1Km() {
        // Граница + 1: Минимальное валидное расстояние.
        // 1 км * 5 (TRUCK_PRICE_PER_KM) = 5
        Assertions.assertEquals(5, priceCalculator.calculatePrice(TransportType.TRUCK, 1));
    }

    @Test
    public void shouldCalculatePriceForVeryLongDistance() {
        // Класс эквивалентности: проверяем, что грузовику реально пофиг на расстояние.
        // 2000 км * 5 = 10000
        Assertions.assertEquals(10000, priceCalculator.calculatePrice(TransportType.TRUCK, 2000));
    }

    @Test
    public void shouldReturnNullWhenTransportTypeIsQuadcopter() {
        // Вводим транспорт, который не поддерживается
        // Дистанция может быть любой (например, 10), так как до расчета цены дело не дойдет
        Integer result = priceCalculator.calculatePrice(TransportType.DRONE, 10);

        // Проверяем, что вернулся именно null
        Assertions.assertNull(result, "Для квадрокоптера расчет не поддерживается и должен возвращать null");
    }



}
