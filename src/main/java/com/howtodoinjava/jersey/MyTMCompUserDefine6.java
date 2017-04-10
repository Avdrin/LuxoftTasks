//package com.howtodoinjava.jersey;
//
//import com.opencsv.CSVReader;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//
//import java.io.*;
//import java.util.*;
//import java.util.zip.ZipEntry;
//import java.util.zip.ZipFile;
//import java.util.zip.ZipInputStream;
//
//public class MyTMCompUserDefine6 {
//    private static final Logger LOGGER = LogManager.getLogger(MyTMCompUserDefine6.class.getName());
//
//    public static void main(String a[]) {
//        List<Employee> lField = getEmplListFromZip("C:/11/exampl.zip");
//
//        printToLogFile(lField);
//
//        TreeMap<Empl, List<Emp>> tm = transformEmplListToTreeMap(lField);
//        printTreeMap(tm);
//
//        DBDataSources dbDataSources = new DBDataSources();
//        dbDataSources.dropTable();
//        dbDataSources.createTable();
//        dbDataSources.fillTable(tm);
//        dbDataSources.printTable();
//    }
//
//    private static void printToLogFile(List<Employee> lField) {
//        int i = 1;
//        try {
//            for (Employee em : lField) {
//                LOGGER.info("Employee " + i++ + ") name: " + em.getName() + " second: " + em.getSecond() + " third: " + em.getThird());
//            }
//        } catch (Exception ex) {
//            LOGGER.error("Error Message Logged !!!", new Exception(ex));
//        }
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
//    public static TreeMap<Empl, List<Emp>> transformEmplListToTreeMap(List<Employee> lField) {
//        TreeMap<Empl, List<Emp>> tm = new TreeMap<Empl, List<Emp>>(new MyNameComp());
//        List<Emp> ls = new ArrayList<Emp>();
//        for (Employee em : lField) {
//            ls.add(new Emp(em.getThird()));
//        }
//        Collections.sort(ls, new SortComparator());
//        while (lField.size() > 0) {
//            Employee em = lField.get(0);
//            tm.put(new Empl(em.getName(), em.getSecond()), ls);
//            lField.remove(0);
//        }
//        return tm;
//    }
//
//
//    public static List<Employee> getEmplListFromZip(String filename) {
//        CSVReader csvReader;
//        List<Employee> lField = new ArrayList<>();
//        ZipFile zipFile;
//        InputStream inputStream;
//        try (ZipInputStream zin = new ZipInputStream(new FileInputStream(filename))) {
//            ZipEntry entry;
//            if ((entry = zin.getNextEntry()) != null) {
//                zipFile = new ZipFile(filename);
//                inputStream = zipFile.getInputStream(entry);
//                csvReader = new CSVReader(new InputStreamReader(inputStream), ';'); //,'"',1);
//                String[] line = null;
//                while ((line = csvReader.readNext()) != null) {
//                    lField.add(new Employee(line[0], line[1], line[2]));
//                }
//            }
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//
//        return lField;
//    }
//
//}

//package com.howtodoinjava.jersey;
//
////import com.csvreader.CsvReader;
//import com.opencsv.CSVReader;
////import javenue.csv.Csv;
//import java.io.*;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.*;
//import java.util.stream.Collectors;
//import java.util.zip.*;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//
//
//public class MyTMCompUserDefine {
//    private static final Logger LOGGER = LogManager.getLogger(MyTMCompUserDefine.class.getName());
//    public static void main(String a[]) {
//        List<Employee> lField = getEmplListFromZip("C:/11/exampl.csv");
//
//        printToLogFile(lField);
//
//        TreeMap<Empl, List<Emp>> tm = transformEmplListToTreeMap(lField);
//        printTreeMap(tm);
//
//        DBDataSources dbDataSources = new DBDataSources();
//        dbDataSources.dropTable();
//        dbDataSources.createTable();
//        dbDataSources.fillTable(tm);
//        dbDataSources.printTable();
//    }
//
//    private static void printToLogFile(List<Employee> lField) {
//        int i = 1;
//        try {
//            for (Employee em : lField) {
//                LOGGER.info("Employee " + i++ + ") name: " + em.getName() + " second: " + em.getSecond() + " third: " + em.getThird());
//            }
//        } catch (Exception ex) {
//            LOGGER.error("Error Message Logged !!!", new Exception(ex));
//        }
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
//    public static TreeMap<Empl, List<Emp>> transformEmplListToTreeMap(List<Employee> lField) {
//        TreeMap<Empl, List<Emp>> tm = new TreeMap<Empl, List<Emp>>(new MyNameComp());
//        List<Emp> ls = new ArrayList<Emp>();
//        for (Employee em : lField) {
//            ls.add(new Emp(em.getThird()));
//        }
//        Collections.sort(ls, new SortComparator());
//        while (lField.size() > 0) {
//            Employee em = lField.get(0);
//            tm.put(new Empl(em.getName(), em.getSecond()), ls);
//            lField.remove(0);
//        }
//        return tm;
//    }
//
//
//    public static List<Employee> getEmplListFromZip(String filename) {
//
////
////        zipStream = new ZipInputStream(channelSftp.get("Port_Increment_201405261400_2251.zip"));
////        zipStream.getNextEntry();
////
////        sc = new Scanner(zipStream);
////        while (sc.hasNextLine()) {
////            System.out.println(sc.nextLine());
////        }
////
////
////        CSVReader reader = new CSVReader(filename, ';');
////
////        List<Employee> emps = new ArrayList<Employee>();
////        //read all lines at once
////        List<String[]> records = reader.readAll();
////
////        Iterator<String[]> iterator = records.iterator();
////        //skip header row
////        iterator.next();
////
////        while(iterator.hasNext()){
////            String[] record = iterator.next();
////            Employee emp = new Employee();
////            emp.setId(record[0]);
////            emp.setName(record[1]);
////            emp.setRole(record[2]);
////            emp.setSalary(record[3]);
////            emps.add(emp);
////        }
////
////        reader.close();
////
////        System.out.println(emps);
//
//
////
////
////        CsvReader reader = null;
////        List<Employee> lField = new ArrayList<>();
////        try (ZipInputStream zin = new ZipInputStream(new FileInputStream(filename))) {
////            ZipEntry entry;
////            while ((entry = zin.getNextEntry()) != null) {
////                new CsvReader(new FileReader("C:/11/" + entry.getName())).setDelimiter(';'); //.ignoreComments(true);
//////                List<String> line;
////String[] line = null;
////                while ((line = reader.getValues()) != null){//(line = reader.readRecord()) != null) {
////                    lField.add(new Employee(line[0], line[1], line[2]));
////                }
////            }
////        } catch (Exception ex) {
////            System.out.println(ex.getMessage());
////        }
////        return lField;
//        return null;
//    }
////    public static void main(String a[]) {
////        HashMap<Integer,Employee> lField = getEmplListFromZip("C:/11/exampl.zip");
////
//////        printToLogFile(lField);
//////
//////        TreeMap<Empl, List<Emp>> tm = transformEmplListToTreeMap(lField);
//////        printTreeMap(tm);
//////
//////        DBDataSources dbDataSources = new DBDataSources();
//////        dbDataSources.dropTable();
//////        dbDataSources.createTable();
//////        dbDataSources.fillTable(tm);
////////        dbDataSources.printTable();
////    }
////
////    private static void printToLogFile(List<Employee> lField) {
////        int i = 1;
////        try {
////            for (Employee em : lField) {
////                LOGGER.info("Employee " + i++ + ") name: " + em.getName() + " second: " + em.getSecond() + " third: " + em.getThird());
////            }
////        } catch (Exception ex) {
////            LOGGER.error("Error Message Logged. ", ex);
////        }
////
////    }
////
////    private static void printTreeMap(TreeMap<Empl, List<Emp>> tm) {
////        Set<Empl> keys = tm.keySet();
////        for (Empl key : keys) {
////            System.out.println(key + " ==> " + tm.get(key));
////        }
////    }
////
////
////    public static TreeMap<Empl, List<Emp>> transformEmplListToTreeMap(List<Employee> lField) {
////        TreeMap<Empl, List<Emp>> tm = new TreeMap<Empl, List<Emp>>(new MyNameComp());
////        List<Emp> ls = new ArrayList<Emp>();
////        for (Employee em : lField) {
////            ls.add(new Emp(em.getThird()));
////        }
////        Collections.sort(ls, new SortComparator());
////        while (lField.size() > 0) {
////            Employee em = lField.get(0);
////            tm.put(new Empl(em.getName(), em.getSecond()), ls);
////            lField.remove(0);
////        }
////        return tm;
////    }
////
////
////    public static HashMap<Integer,Employee> getEmplListFromZip(String filename) {
////        Csv.Reader reader = null;
////
////        HashMap<Integer, Employee> mapEm = new HashMap();
////
////        List<Employee> lField = new ArrayList<>();
////        try (ZipInputStream zin = new ZipInputStream(new FileInputStream(filename))) {
////            ZipEntry entry;
////            while ((entry = zin.getNextEntry()) != null) {
////                reader = new Csv.Reader(new FileReader("C:/11/" + entry.getName())).delimiter(';').ignoreComments(true);
////                List<String> line;
////                Integer key = 0;
////
////
////                BufferedReader br = Files.newBufferedReader(Paths.get("C:/11/" + entry.getName())); //new ZipInputStream(new FileInputStream(filename));
////                List<String> list = new ArrayList<>();
////                //br returns as stream and convert it into a List
////                    list = br.lines().collect(Collectors.toList());
////                list.forEach(System.out::println);
////
////
////
////
////                while ((line = reader.readLine()) != null) {
////                    mapEm.put(key,new Employee(line.get(0), line.get(1), line.get(2)));
////                    key++; //-Xmx5m
////                    //lField.add(new Employee(line.get(0), line.get(1), line.get(2)));
////                }
////            }
////        } catch (Exception ex) {
////            System.out.println(ex.getMessage());
////        }
////        return mapEm;//lField;
////    }
//
////    csvReader = new CSVReader(new FileReader("C:/11/exampl.csv"),';'); //,'"',1);
//
//}