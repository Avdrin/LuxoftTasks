//package com.howtodoinjava.jersey;
//
///**
// * Created by Katz on 06.04.2017.
// */
//
//
//import java.io.FileInputStream;
//import java.io.FileReader;
//import java.util.*;
//import java.util.zip.ZipEntry;
//import java.util.zip.ZipInputStream;
////import java.util.zip.ZipInputStream;
////import java.io.*;
////import java.lang.reflect.Field;
////import java.util.*;
////import java.util.zip.*;
//
//public class MyTMCompUserDefine2 {
//
//    public static void main(String a[]) {
//        //By using name comparator (String comparison)
//
//
//        TreeMap<Empl, List<Emp>> tm = getCsv();
//
//
////        List<Emp> ls = new ArrayList<>();
////        ls.add(new Emp("s")); //,"d"));
////        ls.add(new Emp("c")); //,"dd"));
////        ls.add(new Emp("x")); //,"vb"));
////        ls.add(new Emp("z")); //,"nm"));
////
////
////        TreeMap<Empl, List<Emp>> tm = new TreeMap<Empl, List<Emp>>(new MyNameComp());
////        tm.put(new Empl("Ram", "w"), ls);
////        tm.put(new Empl("John", "s"), ls);
////        tm.put(new Empl("Crish", "c"), ls);
////        tm.put(new Empl("Tom", "v"), ls);
////
////        Set<Empl> keys = tm.keySet();
////        for (Empl key : keys) {
////            System.out.println(key + " ==> " + tm.get(key));
////        }
//
//
////        System.out.println("===================================");
////        //By using salary comparator (int comparison)
////        TreeMap<Empl,List<String>> trmap = new TreeMap<Empl, List<String>>(new MySalaryComp());
////        trmap.put(new Empl("Ram","w"), ls);
////        trmap.put(new Empl("John","s"), ls);
////        trmap.put(new Empl("Crish","c"), ls);
////        trmap.put(new Empl("Tom","v"), ls);
////        Set<Empl> ks = trmap.keySet();
////        for(Empl key:ks){
////            System.out.println(key+" ==> "+trmap.get(key));
////        }
//    }
//
//
//    public static TreeMap<Empl, List<Emp>> getCsv() {
//
//        List<Employee> lField = new ArrayList<>();
//
//
//        List<Emp> ls = new ArrayList<Emp>();
////            ls.add(new Emp("s")); //,"d"));
////            ls.add(new Emp("c")); //,"dd"));
////            ls.add(new Emp("x")); //,"vb"));
////            ls.add(new Emp("z")); //,"nm"));
//
//
//        TreeMap<Empl, List<Emp>> tm = new TreeMap<Empl, List<Emp>>(new MyNameComp());
////            tm.put(new Empl("Ram", "w"), ls);
////            tm.put(new Empl("John", "s"), ls);
////            tm.put(new Empl("Crish", "c"), ls);
////            tm.put(new Empl("Tom", "v"), ls);
////
////            Set<Empl> keys = tm.keySet();
////            for (Empl key : keys) {
////                System.out.println(key + " ==> " + tm.get(key));
////            }
//
//
//
//        try (ZipInputStream zin = new ZipInputStream(new FileInputStream("C:/11/exampl.zip"))) {
//            ZipEntry entry;
//            String name;
//            long size;
//
//
//            while ((entry = zin.getNextEntry()) != null) {
//
//                name = entry.getName(); // получим название файла
//                size = entry.getSize();  // получим его размер в байтах
//                System.out.printf("Название: %s \t размер: %d \n", name, size);
//
//                Csv.Reader reader = new Csv.Reader(new FileReader("C:/11/" + name)).delimiter(';').ignoreComments(true);
//
//                List<String> line1 = reader.readLine();
//                List<String> line2 = reader.readLine();
//                List<String> line3 = reader.readLine();
//
////                for (String st:line1) {
////                    lField.add(new Employee(st,st,st));
////                }
////                new Employee(line1.get(0)
//
////                List<Item> list = new ArrayList<Item>();
////                list.add(new Item("A","a"));
////                list.add(new Item("B","b"));
////                list.add(new Item("B","c"));
////                list.add(new Item("C","c"));
////
////                Collections.sort(list,new Comparator<Item>(){
////                    public int compare(Item o1, Item o2){
////                        return o1.key.compareTo(o2.key);
////                    }
////                });
//
//
//
//
//
//                ls.add(new Emp(line1.get(2))); //,"d"));
//                ls.add(new Emp(line2.get(2))); //,"dd"));
//                ls.add(new Emp(line3.get(2))); //,"vb"));
////                ls.add(new Emp("z")); //,"nm"));
////                Collections.sort(ls,Comparator.comparing(Emp));
////                Collections.sort(List<Emp> ls, Comparator<? super T> Emp);
//                Collections.sort(ls,new SortComparator());
//
//                tm.put(new Empl(line1.get(0), line1.get(1)), ls);
//                tm.put(new Empl(line2.get(0), line2.get(1)), ls);
//                tm.put(new Empl(line3.get(0), line3.get(1)), ls);
////                tm.put(new Empl("Tom", "v"), ls);
//
//            }
//
//
//
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
////        tm.put(new Empl("Ram", "w"), ls);
////        tm.put(new Empl("John", "s"), ls);
////        tm.put(new Empl("Crish", "c"), ls);
////        tm.put(new Empl("Tom", "v"), ls);
//
//        Set<Empl> keys = tm.keySet();
//        for (Empl key : keys) {
//            System.out.println(key + " ==> " + tm.get(key));
//        }
//
//
//
//        return tm;
//    }
//}
