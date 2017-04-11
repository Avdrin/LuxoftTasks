package com.howtodoinjava.jersey;


class Empl {
    private String name;
    private String second;

    public Empl(String n, String s) {
        this.name = n;
        this.second = s;
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

    public String toString() {
        return "Name: " + this.name + "-- Second: " + this.second;
    }
}
