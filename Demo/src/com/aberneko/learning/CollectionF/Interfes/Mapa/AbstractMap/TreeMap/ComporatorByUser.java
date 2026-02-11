package com.aberneko.learning.CollectionF.Interfes.Mapa.AbstractMap.TreeMap;

import java.util.Comparator;

class ComporatorByUser implements Comparator<UserComparator> {

    @Override
    public int compare(UserComparator us1, UserComparator us2) {
        return us1.getName().compareTo(us2.getName());
    }
}