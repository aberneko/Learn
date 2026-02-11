package com.aberneko.learning.CollectionF.Interfes.Mapa.AbstractMap.HashMap.UsageExample;

// В хеш-таблице customersOrders класса OrdersManager собрана информация о клиентах зоомагазина (это ключи) и их
// заказах. Дополните код методов:

// В printAllOrders() и getOrdersSum(), которые печатают список всех заказов и возвращают их общую сумму, вызовите
// нужные методы HashMap.

// В методе printCustomerOrders(String customerName) перед печатью заказов конкретного клиента добавьте проверку наличия
// его имени в таблице. Это нужно, чтобы избежать ошибки ссылки на null.

// Метод getMaxOrderCustomerName() должен возвращать имя клиента, который потратил в зоомагазине больше всего.
// Переменные для хранения имени клиента и максимальной суммы заказов мы объявили и инициализировали за вас.
// Числовой переменной присвоили 0, а строковой — пустую строку "". Вам нужно дописать логику работы метода.
// Вы уже не раз искали максимум в массивах или списках. Здесь получится очень похоже!

// Метод removeUnprofitableOrders должен удалять из таблицы клиентов, сумма заказов которых строго меньше 5000.

public class Practicum {
    public static void main(String[] args) {
        OrdersManager ordersManager = new OrdersManager();

        ordersManager.printAllOrders();
        System.out.println("Всего заказов на сумму: " + ordersManager.getOrdersSum());

        String maxOrderCustomerName = ordersManager.getMaxOrderCustomerName();
        System.out.println("Самая большая сумма заказов у " + ordersManager.getMaxOrderCustomerName());
        ordersManager.printCustomerOrders(maxOrderCustomerName);

        ordersManager.removeUnprofitableOrders();
    }
}
