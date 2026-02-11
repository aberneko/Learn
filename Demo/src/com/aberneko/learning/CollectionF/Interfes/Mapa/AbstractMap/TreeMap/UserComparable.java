package com.aberneko.learning.CollectionF.Interfes.Mapa.AbstractMap.TreeMap;

public class UserComparable implements Comparable<UserComparable> {

    private Integer userId;
    private String name;

    public UserComparable(Integer userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    @Override
    public int compareTo(UserComparable other) {
        return this.userId - other.userId;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{" + userId + " | " + name + "}";
    }
}