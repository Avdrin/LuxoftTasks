//package com.howtodoinjava.jersey;
//
//import javenue.csv.Csv;
//
//import java.io.*;
//import java.lang.reflect.Field;
//import java.util.*;
//import java.util.zip.*;
//
////import static com.howtodoinjava.jersey.TreeMapDemo.*;
////import static com.howtodoinjava.jersey.TreeMapDemo.sortByValues;
////import static com.sun.org.apache.xerces.internal.impl.xpath.regex.CaseInsensitiveMap.get;
//
//public class FilesApp {
//
//    public static void main(String[] args) {
//
//        try (ZipInputStream zin = new ZipInputStream(new FileInputStream("C:/11/exampl.zip"))) {
//            ZipEntry entry;
//            String name;
//            long size;
//            while ((entry = zin.getNextEntry()) != null) {
//
//                name = entry.getName(); // получим название файла
//                size = entry.getSize();  // получим его размер в байтах
//                System.out.printf("Название: %s \t размер: %d \n", name, size);
//
//
//                Csv.Reader reader = new Csv.Reader(new FileReader("C:/11/" + name)).delimiter(';').ignoreComments(true);
////Почему только 3 строки?
//// это просто для примера я создала такой файл
////Понятно в задании если не сказано сколько строк то надо сделать чтобы любой длины мог обрабатывать
//                //важно. разбей на методы. ато так сразу видно что ты новичек совсем.
////                хоррошо но проблема в том что я не поняда вот этот момоент смотри
////                List<Object{first,second,third}> (first, second и third поля объекта Object)
////                что это?
//// сейчас. вывод в лог это не out.print - надо создать логгер. Посмотри log4j это не трудно.
////                3й пункт сейчас посмотрю
////)      Есть непустой List<Object{first,second,third}> (first, second и third поля объекта Object)
////                Нужен объект который мапит элементы csv файла на свои поляля
//
////                я создала класс Empl - да имеется ввиду "ксть непустой List<Empl> да.
////                Есть непустой List<Object{first,second,third}> (first, second и third поля объекта Object)
//// и есть пустой Map<Object{first,second}, List<Object{third}».
//// Перенести (удалить в первом поместить в другой) данные из одной структуры в другу
////                создать еще классы с 2мя полями и с одним
////                и Map<Employee, List<Emp>> = new TreeMap..2
////                наведи порядок. разбей на методы иначе ничего не сделаешь. В итоге нужен метод которому даешь
////                List<Empl> а он возвразает заполненный Map<Employee, List<Emp>>
////                остальное тоже разбей на методы. Архивирование. логирование. циклом ходи по данным. Отключаюсь
//
//
//                List<String> line1 = reader.readLine();
//                List<String> line2 = reader.readLine();
//                List<String> line3 = reader.readLine();
//
//
//                Empl empl = new Empl(line1.get(0), line1.get(1), line1.get(2));
//                Empl empl2 = new Empl(line2.get(0), line2.get(1), line2.get(2));
//                Empl empl3 = new Empl(line3.get(0), line3.get(1), line3.get(2));
//
//                List<Empl> l = new ArrayList<>();
//                l.add(0, empl);
//                l.add(1, empl2);
//                l.add(2, empl3);
//
//                copyData(l);
//
//            }
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
//
//
//    public static Map<Employee, List<Emp>> copyData(List<Empl> inpData) {
//
//        Empl em = inpData.get(0);
//        Empl em1 = inpData.get(1);
//        Empl em2 = inpData.get(2);
//
//
//        Employee empl2 = new Employee(em.first, em.second);
//        Employee empl22 = new Employee(em1.first, em1.second);
//        Employee empl222 = new Employee(em2.first, em2.second);
//
//
//        Emp empl1 = new Emp(em.third);
//        Emp empl11 = new Emp(em1.third);
//        Emp empl111 = new Emp(em2.third);
//        List<Emp> l1 = new ArrayList<>();
//        l1.add(0, empl1);
//        l1.add(1, empl11);
//        l1.add(2, empl111);
//
//
//        Pet p = new Pet("dd", "vv");
//        Pet pp = new Pet("d2","v2");
//
//        Map<Pet,Integer> mm = new TreeMap<>();
//        mm.put(p,2);
//        mm.put(pp,6);
//
//
//
//        Map<String,List<Emp>> map = new TreeMap<>();
//        map.put(empl2.first,l1);
//        map.put(empl22.first,l1);
////        map.put(empl222,l1);
//
//        Map<String,Integer> m = new TreeMap<>();
//        m.put("s",2);
//        m.put("s",2);
//        m.put("v",2);
//
//
////        System.out.println(map.get(empl2).get(0).third);
////        System.out.println(map.get(empl22).get(0).third);
////        System.out.println(map.get(empl222).get(0).third);
//
//       // Map sortedMap = sortByValues(map);
//
//        return null;
//    }
//
//
//}