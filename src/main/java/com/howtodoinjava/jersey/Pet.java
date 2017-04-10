package com.howtodoinjava.jersey;

/**
 * Created by Katz on 06.04.2017.
 */
public class Pet implements Comparable {
    String d;
    String v;

    Pet(String d, String v){
        this.d = d;
        this.v = v;
    }



    @Override
    public int compareTo(Object o) {
        return 0; // this.d-o.d;
    }
}
