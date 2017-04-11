package com.howtodoinjava.jersey;

import java.util.Comparator;

public class SortComparator implements Comparator<Emp> {
    public int compare(Emp p1, Emp p2) {
        return p1.getThird().compareTo(p2.getThird());
    }
}
