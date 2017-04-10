package com.howtodoinjava.jersey;

/**
 * Created by Katz on 05.04.2017.
 */
class Emp implements Comparable<Emp> {
    private String third;
//    private String second;
//    private int salary;

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


//    @Override
//    public int compare(Emp o1, Emp o2) {
//        return o1.getThird().compareTo(o2.getThird());
//    }

//    @Override
//    public int compareTo(Object o) {
//        return 0;
//    }

//    @Override
//    public int compareTo(Emp compareFruit) {
//
//        int compareQuantity = ((Emp) compareFruit).getThird();
//
//        //ascending order
//        compareFruit.getThird().compareTo(compareFruit.getThird());
//        return compareFruit.compareTo() compareTo()//this.third - compareQuantity;
//
//        //descending order
//        //return compareQuantity - this.quantity;
//
//    }

    public int compareTo(Emp p) {
        int result = this.third.compareTo(p.third);
        return result;
    }


//    @Override
//    public int compare(Emp o1, Emp o2) {
//        return 0;
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
