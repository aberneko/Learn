package JUnit.Task2;
/** Класс, который принимает запросы от пользователя и выдаёт печеньки */

public class FortuneCookieController { //
    private final FortuneCookieFactory fortuneCookieFactory;

    public FortuneCookieController (FortuneCookieFactory fortuneCookieFactory) {
        this.fortuneCookieFactory = fortuneCookieFactory;
    }

    public FortuneCookie tellFortune() {
        return this.fortuneCookieFactory.bakeFortuneCookie();
    }
}