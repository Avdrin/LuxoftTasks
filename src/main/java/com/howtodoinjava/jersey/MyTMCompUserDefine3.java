//package com.howtodoinjava.jersey;
//
//import java.io.FileInputStream;
//import java.io.FileReader;
//import java.util.*;
////import java.util.stream.Collectors;
////import java.util.stream.Stream;
//import java.util.zip.ZipEntry;
//import java.util.zip.ZipInputStream;
//
//public class MyTMCompUserDefine3 {
////    private static final Logger log = Logger.getLogger(MyTMCompUserDefine.class);
////    private static OrderLogic logic;
//
//
//    public static void main(String a[]) {
//
//////        List<Item> items = Arrays.asList(
//////                new Item("apple", 10, new BigDecimal("9.99")),
//////                new Item("banana", 20, new BigDecimal("19.99")),
//////                new Item("orang", 10, new BigDecimal("29.99")),
//////                new Item("watermelon", 10, new BigDecimal("29.99")),
//////                new Item("papaya", 20, new BigDecimal("9.99")),
//////                new Item("apple", 10, new BigDecimal("9.99")),
//////                new Item("banana", 10, new BigDecimal("19.99")),
//////                new Item("apple", 20, new BigDecimal("9.99"))
//////        );
////        List<Empl> items = Arrays.asList(
////                new Empl("apple","b"),
////                new Empl("pat","b"),
////                new Empl("ban","b"),
////                new Empl("orang","b")
////               );
////
////        //group by price
//////        Map<BigDecimal, List<Item>> groupByPriceMap =
//////                items.stream().collect(Collectors.groupingBy(Item::getPrice));
//////
//////        System.out.println(groupByPriceMap);
////
////        // group by price, uses 'mapping' to convert List<Item> to Set<String>
//////        Map<BigDecimal, List<String>> result =
//////                items.stream().collect(
//////                        Collectors.groupingBy(Item::getPrice,
//////                                Collectors.mapping(Item::getName, Collectors.toList())
//////                        )
//////                );
//////
//////        System.out.println(result);
////
//////        Map<Empl, List<Emp>> result =
//////                items.stream().collect(
//////                        Collectors.mapping()
//////                                groupingBy(Empl::getName, Collectors.mapping(Empl::getSecond, Collectors.toList()))
//////                );
//////
//////        System.out.println(result);
////
////
////        Map<Empl, List<Emp>> result2 =
////                items.stream().collect(Collectors.toMap(Empl::getName,Empl.class)); //toCollection(new TreeMap<Empl,List<Emp>>()))
//
//
//        class Item {
//
//            String key;
//
//            public Item(String key) {
//                super();
//                this.key = key;
//            }
//
//            public String getKey() {
//                return key;
//            }
//        }
//
//        List<Emp> items = new ArrayList<>();
//            items.add(new Emp("ONE"));
//            items.add(new Emp("TWO"));
//            items.add(new Emp("THREE"));
//
////        Map<String, Emp> map2 = items.stream().collect(
////                Collectors.toMap(Emp::getThird, emp -> emp));
//
//
////        System.out.println(map2);
//
//
//
//
//
//
//
//
//
//
//        List<Employee> list = new ArrayList<>();
//        list.add(new Employee("s","ss","sss"));
//        list.add(new Employee("a","xsd","ssd"));
//        list.add(new Employee("b","xs","wsd"));
//        Map<String, List<String>> map = new TreeMap<>();
////        map.put("2",  list);
////        map.put("1", list);
//
//        System.out.println(map); // {2={3=3, 2=2, 1=1}, 1={3=3, 2=2, 1=1}}
//
//       // Map<String, List<String>> resultMap = new TreeMap<>();
//
//       // map.keySet().stream().forEach(key -> resultMap.put(key, new TreeMap<>(map.get(key))));
//
////        list.stream().forEach(map.put(list.get(0)))//key -> resultMap.put(key,new List<String>(list.get(0))));
//       // System.out.println(resultMap);
//
//
//
////        map empl, list
//
//
////        Object em;
//        List<String> bn = new ArrayList<>(); //List<String>();
////        Empl em;
////        Map<Employee, String> result  = list.stream()
////                .collect(Collectors.toMap(emp -> emp, emp -> emp.getName()));
//
////        set.stream().forEach((p) -> p.append("_1"));
////
////        List<Emp> lk = list.stream().forEach((em) -> em.append employee.getName());//collect(Collectors.toList(em -> em));
//
////        System.out.println("== "+result);
//
//
//
//        Map<String, String> yourMap = new HashMap<String, String>();
//        yourMap.put("1", "one");
//        yourMap.put("2", "two");
//        yourMap.put("3", "three");
//        Map<String, String> sortedMap = new TreeMap<String, String>(yourMap);
//
//
////        Collection<String> collection = Arrays.asList("a4", "a2", "a3");
////        Stream<String> streamFromCollection = collection.stream();
////        collection.stream().sorted().collect(Collectors.toList());
////        System.out.println(collection);
//
//
//
//
//
//
//
//
//
//
//
////        logic = new OrderLogic();  ВИДНО ЧТО ЕСТЬ МЕТОДЫ
////        logic.doOrder();
////        Csv.Reader reader = getEmplListFromZip("C:/11/exampl.zip");
//
//        List<Employee> lField = getEmplListFromZip("C:/11/exampl.zip");
//
//        TreeMap<Empl, List<Emp>> tm = transformEmplListToTreeMap(lField);
//
//        printTreeMap(tm);
//
////        log.info("sczxc");
//
//
//        DBDataSources dbDataSources = new DBDataSources();
//        dbDataSources.dropTable();
//        dbDataSources.createTable();
//        dbDataSources.fillTable(tm);
//        dbDataSources.printTable();
//
//    }
//
//    private static void printTreeMap(TreeMap<Empl, List<Emp>> tm) {
//        Set<Empl> keys = tm.keySet();
//        for (Empl key : keys) {
//            System.out.println(key + " ==> " + tm.get(key));
//        }
//    }
//
//
//    public static TreeMap<Empl, List<Emp>> transformEmplListToTreeMap(List<Employee>lField){ //Csv.Reader reader) {
//        TreeMap<Empl, List<Emp>> tm = new TreeMap<Empl, List<Emp>>(new MyNameComp());
//        List<Emp> ls = new ArrayList<Emp>();
//        for (Employee em : lField) {
//            ls.add(new Emp(em.getThird()));
//        }
//        Collections.sort(ls, new SortComparator());
//
//
//
////        TreeMap<Empl, String> result1 = lField.stream().collect(
////                Collectors.toMap(Employee::getName, Employee::getSecond));
//
//
//
////        List<Empl> list = new ArrayList<>();
////        list.add(new Empl("s", "liquidweb"));
////        list.add(new Empl("d", "linode");
////        list.add(new Empl("c", "digitalocean"));
////
////        //example 1
////        Map<String, String> result1 = list.stream().collect(
////                Collectors.toMap(Employee::getName, Employee::getSecond));
////
////        System.out.println("Result 1 : " + result1);
////
////        //example 2
////        Map<Integer, String> result2 = list.stream().collect(
////                Collectors.toMap(x -> x.getName(), x -> x.getSecond()));
////
////        System.out.println("Result 2 : " + result2);
//
//
//
//
////        for (Employee em : lField) {
//        while (lField.size() > 0){
//            Employee em = lField.get(0);
//            tm.put(new Empl(em.getName(), em.getSecond()), ls);
//            lField.remove(0);
//        }
////        lField.clear();
//
//        return tm;
//    }
//
//
//    public static List<Employee> getEmplListFromZip(String filename) {
//        Csv.Reader reader = null;
//        List<Employee> lField = new ArrayList<>();
//        try (ZipInputStream zin = new ZipInputStream(new FileInputStream(filename))) {
//            ZipEntry entry;
//            String name;
//            long size;
//
//            while ((entry = zin.getNextEntry()) != null) {
//                name = entry.getName(); // получим название файла
//                size = entry.getSize();  // получим его размер в байтах
//                System.out.printf("Название: %s \t размер: %d \n", name, size);
//                reader = new Csv.Reader(new FileReader("C:/11/" + name)).delimiter(';').ignoreComments(true);
//
//                List<String> line;
//                while ((line = reader.readLine()) != null) {
//                    lField.add(new Employee(line.get(0), line.get(1), line.get(2)));
//                }
//            }
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//        return lField;
//    }
//}