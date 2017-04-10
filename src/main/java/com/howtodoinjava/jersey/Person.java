package com.howtodoinjava.jersey;
//
///**
// * Created by Katz on 07.04.2017.
// */
//public class Person implements Comparable<Person>{
//
//    private String Name;
//    private int    Age;
//
//    public Person(String Name, int Age) {
//        this.Name = Name;
//        this.Age = Age;
//    }
//
//    public String getName() {
//        return this.Name;
//    }
//
//    public int getAge() {
//        return this.Age;
//    }
//
//    public int compareTo(Person p) {
//        int result = this.Name.compareTo(p.Name);
//        return result;
//    }
//
//}
public class Person {
    private String firstName;
    private String lastName;
    private String uniqueId;

    public Person(String firstName, String lastName,
                  String uniqueId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.uniqueId = uniqueId;
    }

    public String toString() {
        return "[" + firstName + " " + lastName +
                " " + uniqueId +"]";
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }
}
