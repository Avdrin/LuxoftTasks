//package com.howtodoinjava.jersey;
//
///**
// * Created by Katz on 08.04.2017.
// */
//
//
//        import java.util.ArrayList;
//        import java.util.List;
//        import java.util.Map;
//        import java.util.stream.Collectors;
//
//public class ListMapConversion
//{
//    public static void main( String[] args )
//    {
//        List <Person> personList = new ArrayList<Person>();
//
//        personList.add(new Person("Mike", "harvey", "100268"));
//        personList.add(new Person("Nick", "young", "32654"));
//        personList.add(new Person("Jack", "slater", "123642"));
//
//        System.out.println("1. Convert List of objects to map :");
//        Map<String, Person> mapIdToPerson = convertListToMap(personList);
//
//        System.out.println("\n2. Convert Map to list of objects :");
//        convertMapToList(mapIdToPerson);
//    }
//
//    private static Map<String, Person> convertListToMap(List <Person> personList) {
//        Map<String, Person>mapIdToPerson = null;
//        mapIdToPerson = personList.stream()
//                .collect(
//                        Collectors
//                                .toMap(
//                                        Person::getUniqueId,
//                                        person->person)
//                );
//
//        System.out.println(mapIdToPerson);
//        return mapIdToPerson;
//    }
//
//    private static void convertMapToList(Map<String, Person>mapIdToPerson) {
//
//        System.out.println("2.1. List of keys :");
//        List<String>uniqueIdList = new ArrayList<>(mapIdToPerson.keySet());
//        System.out.println(uniqueIdList);
//
//        System.out.println("\n2.2. List of person objects :");
//        List<Person>personList = new ArrayList<>(mapIdToPerson.values());
//        System.out.println(personList);
//    }
//}
