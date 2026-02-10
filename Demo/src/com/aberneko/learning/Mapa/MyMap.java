package com.aberneko.learning.Mapa;


import java.security.Key;
import java.util.HashMap;

public class MyMap <K, V> extends HashMap<K, V> {

    public void text() {
        System.out.println("Создать новый класс, который будет реализовывать интерфейс Map. " +
                "В этом случае вам нужно самостоятельно придумать алгоритм, а затем написать" +
                " реализацию каждого метода из интерфейса Map. Этот вариант достаточно сложный, " +
                "он требует глубокого знания алгоритмов.");

        System.out.println("Создать новый класс, который будет наследоваться от одной из готовых " +
                "реализаций хеш-таблицы. И переопределить только те методы, которые нужно.");
    }
    // ???????????????????????????????????????????
    @Override
    public V put(K key, V value) {
        System.out.println("Сохраненное значение " + value + " в ключе " + key);
        return super.put(key, value);
    }






}
