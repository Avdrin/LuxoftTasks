package com.howtodoinjava.jersey;

/**
 * Created by Katz on 05.04.2017.
 */
public class Employee {
    private String name;
    private String second;
    private String third;
//    private int salary;

    public Employee(String n, String s, String t) {
        this.name = n;
        this.second = s;
        this.third = t;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public String getThird() {
        return third;
    }

    public void setThird(String third) {
        this.third = third;
    }

}
