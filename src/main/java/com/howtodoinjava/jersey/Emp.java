package com.howtodoinjava.jersey;


class Emp implements Comparable<Emp> {
    private String third;

    public Emp(String n) {
        this.third = n;
    }

    public String getThird() {
        return third;
    }

    public void setThird(String third) {
        this.third = third;
    }

    public String toString() {
        return "Third: " + this.third;
    }

    public int compareTo(Emp p) {
        int result = this.third.compareTo(p.third);
        return result;
    }
}