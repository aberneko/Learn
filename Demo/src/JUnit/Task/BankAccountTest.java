package JUnit.Task;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    public void shouldNotBeBlockedWhenCreated() {
        BankAccount account = new BankAccount("a", "b");
        assertFalse(account.isBlocked());
    }

    @Test
    public void shouldReturnZeroAmountAfterActivation() {
        BankAccount account = new BankAccount("a", "b");
        account.activate("RUB");
        assertEquals(Integer.valueOf(0), account.getAmount());
        assertEquals("RUB", account.getCurrency());
    }

    @Test
    public void shouldBeBlockedAfterBlockIsCalled() { // проверяем что счет заблокирован после использования метода
        BankAccount account = new BankAccount("a", "b");
        account.activate("RUB");
        account.block();
        assertTrue(account.isBlocked());
    }

    @Test
    public void shouldReturnFirstNameThenSecondName() { //должен проверять, что при вызове метода getFullName() возвращается правильный массив строк.
        BankAccount account = new BankAccount("a", "b");
        assertArrayEquals(new String[] {"a", "b"}, account.getFullName());
    }

    @Test
    public void shouldReturnNullAmountWhenNotActive() { //должен проверять, что при вызове метода getCurrency() для неактивного счёта, значение currency равно null.
        BankAccount account = new BankAccount("a", "b");
        assertNull(account.getCurrency());
    }

}