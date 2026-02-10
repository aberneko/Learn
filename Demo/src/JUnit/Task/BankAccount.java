package JUnit.Task;


import java.util.Objects;

public class BankAccount {

    private boolean isBlocked = false;
    private Integer amount;
    private String currency;

    private final String firstName;
    private final String secondName;

    public BankAccount(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public void block() { // блокировка счета
        this.isBlocked = true;
    }

    public void activate(String currency) { // активация счета
        this.amount = 0;
        this.currency = currency;
    }

    public Integer getAmount() { // пока счет не активирован метод будет возвращать ошибку
        if (amount == null) {
            throw new IllegalStateException("Счёт не активирован.");
        }
        return this.amount; // если счет активный
    }

    public String getCurrency() { // вернут null пока счет не активирован
        return currency;
    }

    public boolean isBlocked() { // статут счета
        return isBlocked;
    }

    public String[] getFullName() {  // что бы получить имя владельца
        return new String[] {firstName, secondName}; // по нулевому индексу будет имя - по первому фамилия
    }


}