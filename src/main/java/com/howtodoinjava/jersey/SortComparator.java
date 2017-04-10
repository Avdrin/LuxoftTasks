package com.howtodoinjava.jersey;

import java.util.Comparator;

/**
 * Created by Katz on 07.04.2017.
 */
public class SortComparator implements Comparator<Emp> {
    public int compare(Emp p1, Emp p2) {
        return p1.getThird().compareTo(p2.getThird());
    }
}
