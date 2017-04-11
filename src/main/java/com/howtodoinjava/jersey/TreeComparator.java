package com.howtodoinjava.jersey;

import java.util.Comparator;

class TreeComparator implements Comparator<Empl> {

    @Override
    public int compare(Empl e1, Empl e2) {
        return e1.getName().compareTo(e2.getName());
    }
}
