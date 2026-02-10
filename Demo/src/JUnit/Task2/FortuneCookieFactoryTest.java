package JUnit.Task2;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class FortuneCookieFactoryTest {

    private FortuneCookieFactory fortuneCookieFactory;

    @BeforeEach
    public void beforeEach() {
        FortuneConfig config = new FortuneConfig(true);

        ArrayList<String> good = new ArrayList<>();
        good.add("Сегодня хороший день"); // Текст, который мы ждем в хорошем случае

        ArrayList<String> bad = new ArrayList<>();
        bad.add("Вчера был плохой день"); // Текст для плохого случая

        fortuneCookieFactory = new FortuneCookieFactory(config, good, bad);

    }

    @Test
    public void shouldIncrementCountByOneAfterOneCookieBaked() { // проверит, что счётчик печенек на фабрике увеличивается на единицу после одной испеченной печеньки.
        fortuneCookieFactory.bakeFortuneCookie();
        assertEquals(1, fortuneCookieFactory.getCookiesBaked());
    }

    @Test
    public void shouldIncrementCountByTwoAfterTwoCookiesBaked() { //  проверит, что после двух испечённых печенек счёт увеличится на два.
        fortuneCookieFactory.bakeFortuneCookie();
        fortuneCookieFactory.bakeFortuneCookie();
        assertEquals(2, fortuneCookieFactory.getCookiesBaked());
    }

    @Test
    public void shouldSetCounterToZeroAfterResetCookieCreatedCall() { //  проверит, что после вызова resetCookiesCreated счётчик станет равным нулю.
        fortuneCookieFactory.bakeFortuneCookie();
        fortuneCookieFactory.resetCookiesCreated();
        assertEquals(0, fortuneCookieFactory.getCookiesBaked());
    }

}