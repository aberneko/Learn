package com.aberneko.learning.Mapa.TreeMapa;

import java.util.Comparator;

class ComporatorByUser implements Comparator<UserComparator> {

    @Override
    public int compare(UserComparator us1, UserComparator us2) {
        return us1.getName().compareTo(us2.getName());
    }
}