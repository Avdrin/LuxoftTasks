package com.howtodoinjava.jersey;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Katz on 07.04.2017.
 */
public class Sort {

    public static void main (String[] args) {
        ArrayList<Emp> al = new ArrayList<Emp>();
        al.add(new Emp("x"));
        al.add(new Emp("b"));
        al.add(new Emp("a"));
        Collections.sort(al);
        Collections.sort(al,new SortComparator()); // альтернатива
        for (Emp p : al) {
            System.out.println(p.getThird());
        }
    }
}
