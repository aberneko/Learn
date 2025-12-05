package WorkList1;

public class Expense {
    // величина траты
    private double value;

    // номер транзакции
    private int transaction;


    public double getValue() {
        return value;
    }

    public void setValue(double val) {
        value = val;
    }

    public Integer getTransaction() {
        return transaction;
    }

    public void setTransaction(Integer tr) {
        transaction = tr;
    }

    /* В конструкторе мы сгенерируем уникальный номер транзакции от 0 до 1 000 000
       с помощью функции Math.random(); */
    public Expense(double val) { // <- сюда передается значение 'expense' из Practicum
        value = val; // 1. Поле 'value' объекта Expense получает сумму траты.
        transaction = (int) Math.round(Math.random() * 1_000_000); // 2. Генерируется уникальный ID.
    }


   /* expense (сумма траты, которую ввел пользователь, например, 1500.0) передается в конструктор как аргумент val.

    Внутри конструктора:

    value = val; — Это сохраняет сумму 1500.0 в поле value этого нового объекта Expense.

    transaction = ...; — Это генерирует и сохраняет в поле transaction уникальный номер (например, 456789)
                         для этого объекта.

    В результате: Мы получаем готовый, "наполненный" объект Expense, который имеет два сохраненных значения:
                  value = 1500.0 и transaction = 456789.*/

}