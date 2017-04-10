package com.howtodoinjava.jersey;

import java.util.Comparator;

/**
 * Created by Katz on 06.04.2017.
 */
class MyNameComp implements Comparator<Empl> {

    @Override
    public int compare(Empl e1, Empl e2) {
        return e1.getName().compareTo(e2.getName());
    }
}
