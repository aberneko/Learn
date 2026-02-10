package JUnit.Annotations;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestBenchExample {

    @BeforeAll                                      // один раз до запуска всех тестов;
    static void beforeAll() {
        System.out.println("Running beforeAll");
    }

    @AfterAll                                       // один раз после окончания всех тестов
    static void afterAll() {
        System.out.println("Running afterAll");
    }

    @BeforeEach                                     // перед каждым тестом
    void beforeEach() {
        System.out.println("--Running beforeEach");
    }

    @AfterEach                                      //  каждый раз после окончания каждого теста
    void afterEach() {
        System.out.println("--Running afterEach");
    }


    @Test
    public void someTestOne() {
        System.out.println("-- --Running test 1");
    }

    @Test
    public void someTestTwo() {
        System.out.println("-- --Running test 2");
    }
}
