package com.aberneko.learning.Mapa.TreeMapa;

import java.util.Comparator;

public class ComporatorByAge implements Comparator<UserComparator> {

    @Override
    public int compare(UserComparator us1, UserComparator us2) {
        return Integer.compare(us2.getAge(), us1.getAge());
    }
}
