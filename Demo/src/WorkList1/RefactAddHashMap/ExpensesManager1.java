package WorkList1.RefactAddHashMap;
import java.util.ArrayList;
import java.util.HashMap;


public class ExpensesManager1 {
    HashMap<String, ArrayList<Double>> expensesByCategories; // замените на таблицу с именем expensesByCategories

    ExpensesManager1() {
        expensesByCategories = new HashMap<>(); // создайте таблицу
    }

    // добавьте в метод ещё один параметр — category
    double saveExpense(double moneyBeforeSalary, double expense, String category) {
        moneyBeforeSalary = moneyBeforeSalary - expense;
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
        if (expensesByCategories.containsKey(category)) {
            ArrayList<Double> value = expensesByCategories.get(category);
            value.add(expense);
        } else {
            ArrayList<Double> value = new ArrayList<>(); // создайте новый список трат и добавьте в него сумму
            value.add(expense);
            expensesByCategories.put(category, value);
        }
        if (moneyBeforeSalary < 1000) {
            System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
        }
        return moneyBeforeSalary;
    }


    void printAllExpensesByCategories() {
        // замените логику для работы с таблицами
        for (String cat : expensesByCategories.keySet()) {
            System.out.println(cat);
            ArrayList<Double> value = expensesByCategories.get(cat);
            for (Double val : value) {
                System.out.println(val);
            }
        }
    }

    // метод должен принимать название категории и называться findMaxExpenseInCategory
    double findMaxExpenseInCategory(String category) {
        double maxExpense = 0;
        /* Замените логику для работы с таблицами
        Если категория есть, то ищем максмальную трату.
        Иначе печатаем "Такой категории пока нет." */
        if (expensesByCategories.containsKey(category)) {
            ArrayList<Double> value = expensesByCategories.get(category);
            for (Double val : value) {
                maxExpense = Double.max(maxExpense, val);
            }
        } else {
            System.out.println("Такой категории пока нет.");
        }

        return maxExpense;
    }

    void removeAllExpenses() {
        expensesByCategories.clear(); // таблица называется иначе
        System.out.println("Траты удалены.");
    }

    double getExpensesSum() {
        double result = 0;
        for (ArrayList<Double> caten : expensesByCategories.values()) {
            for (Double val : caten) {
                result += val;
            }
        }
        return result;
    }

    void removeCategory(String category) {
        if (expensesByCategories.containsKey(category)){
            expensesByCategories.remove(category);
        }
    }

    String getMaxCategoryName() {
        double maxCategorySum = 0;
        String maxCategoryName = "";

        for (String category : expensesByCategories.keySet()) {
            double currentCategorySum = 0;
            ArrayList<Double> expenses = expensesByCategories.get(category);

            // Внутренний цикл: подсчёт суммы трат в текущей категории
            for (double expense : expenses) {
                currentCategorySum += expense;
            }

            // Сравнение текущей суммы с максимальной
            if (currentCategorySum > maxCategorySum) {
                maxCategorySum = currentCategorySum;
                maxCategoryName = category;
            }
        }
        return maxCategoryName;
    }
}
