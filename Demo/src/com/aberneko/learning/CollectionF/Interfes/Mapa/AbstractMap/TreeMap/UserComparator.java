package com.aberneko.learning.CollectionF.Interfes.Mapa.AbstractMap.TreeMap;

public class UserComparator {

    public String getName() {
        return name;
    }

    private String name;
    private int age;

    public UserComparator(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "{" + name + " | " + age + "}";
    }
}
