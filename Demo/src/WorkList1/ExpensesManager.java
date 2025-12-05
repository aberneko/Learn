package WorkList1;
import java.util.ArrayList;

public class ExpensesManager {
    ArrayList<Expense> expenses; // expenses - переменная ссылка, значение null, так как объект еще не создан

    ExpensesManager() {
        expenses = new ArrayList<>(); // создаем объект ArrayList, тем самым expenses получает ссылку на него

    }

    double saveExpense(double moneyBeforeSalary, double expense) {
        moneyBeforeSalary = moneyBeforeSalary - expense;
        expenses.add(new Expense(expense));
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
        if (moneyBeforeSalary < 1000) {
            System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
        }
        return moneyBeforeSalary;
    }

    void printAllExpenses() {
        for (int i = 0; i < expenses.size(); i++) {
            Expense exp = expenses.get(i);
            System.out.println("Трата № " + (i + 1) + ". Потрачено " + exp.getValue() + " рублей, код транзакции: "+exp.getTransaction());
        }
    }

    double findMaxExpense() {
        double maxExpense = 0;
        for (Expense exp : expenses) {
            maxExpense = Double.max(maxExpense, exp.getValue());
        }
        return maxExpense;
    }

    void removeAllExpenses() {
        expenses.clear();
        System.out.println("Список трат пуст");

    }

    void removeExpense(int transaction) {
        if (expenses.isEmpty()) {
            System.out.println("Список трат пуст!");
            return;
        }

        // Переменная для хранения индекса найденной траты. Начальное значение -1.
        int index = -1; // для безопасности

        // 2. Поиск элемента
        for (int i = 0; i < expenses.size(); i++) {
            // Сравнение номера транзакции
            if (expenses.get(i).getTransaction() == transaction) { // Получает объект Expense по индексу i.
                                                                   // Получает поле transaction из этого объекта.
                index = i; // Сохраняем индекс
                break;     // Прерываем цикл, как только элемент найден
            }
        }

        // 3. Проверка результата поиска и удаление
        if (index >= 0) { // Элемент найден
            expenses.remove(index);
            System.out.println("Трата удалена!");
        } else { // Элемент не найден
            System.out.println("Такой траты нет.");
        }
    }

}