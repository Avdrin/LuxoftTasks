package com.howtodoinjava.jersey;

/**
 * Created by Katz on 05.04.2017.
 */
class Empl {
    private String name;
    private String second;
//    private int salary;

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

//    public int getSalary() {
//        return salary;
//    }
//
//    public void setSalary(int salary) {
//        this.salary = salary;
//    }
//
    public String toString() {
        return "Name: " + this.name + "-- Second: " + this.second;
    }

//    public void getThird() {
//    }
}
//public class Empl { //implements Comparable {
//    String first;
//    String second;
//    String third;
//
//     Empl(String first,String second,String third){
//        this.first = first;
//        this.second = second;
//        this.third = third;
//    }

////
////    @Override
////    public int compareTo(Object o) {
////        return 0;
////    }
//}
