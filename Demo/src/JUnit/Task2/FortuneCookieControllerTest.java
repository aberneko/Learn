package JUnit.Task2;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class FortuneCookieControllerTest {

    private FortuneCookieController create(boolean isPositive) {
        FortuneConfig config = new FortuneConfig(isPositive);

        ArrayList<String> good = new ArrayList<>();
        good.add("Сегодня хороший день"); // Текст, который мы ждем в хорошем случае

        ArrayList<String> bad = new ArrayList<>();
        bad.add("Вчера был плохой день"); // Текст для плохого случая

        FortuneCookieFactory factory = new FortuneCookieFactory(config, good, bad);
        return new FortuneCookieController(factory);
    }

    @Test
    public void shouldReturnPositiveFortune() { // должен проверять, что фабрика может испечь печеньку с хорошим предсказанием.
        FortuneCookieController fortuneCookieController = create(true);
        String text = fortuneCookieController.tellFortune().getFortuneText();
        assertEquals("Сегодня хороший день", text);
    }

    @Test
    public void shouldReturnNegativeFortune() {// должен проверять, что фабрика может испечь печеньку с плохим предсказанием.
        FortuneCookieController fortuneCookieController = create(false);
        String text = fortuneCookieController.tellFortune().getFortuneText();
        assertEquals("Вчера был плохой день", text);
    }


}