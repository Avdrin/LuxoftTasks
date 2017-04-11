package com.howtodoinjava.jersey;

import com.opencsv.CSVReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

public class MyTMCompUserDefine {
    private static final Logger LOGGER = LogManager.getLogger(MyTMCompUserDefine.class.getName());

    public static void main(String a[]) {

        List<Employee> lField = getEmplListFromZip(getAbsolutePath("exampl.zip"));

        printToLogFile(lField);

        TreeMap<Empl, List<Emp>> tm = transformEmplListToTreeMap(lField);
        printTreeMap(tm);

        DBDataSources dbDataSources = new DBDataSources();
        dbDataSources.dropTable();
        dbDataSources.createTable();
        dbDataSources.fillTable(tm);
        dbDataSources.printTable();
    }

    private static String getAbsolutePath(String fileName) {
        ClassLoader classLoader = new MyTMCompUserDefine().getClass().getClassLoader();
        File configFile = new File(classLoader.getResource(fileName).getFile());
        return configFile.getAbsolutePath();
    }

    private static void printToLogFile(List<Employee> lField) {
        int i = 1;
        try {
            for (Employee em : lField) {
                LOGGER.info("Employee " + i++ + ") name: " + em.getName() + " second: " + em.getSecond() + " third: " + em.getThird());
            }
        } catch (Exception ex) {
            LOGGER.error("Error Message Logged.", new Exception(ex));
        }
    }

    private static void printTreeMap(TreeMap<Empl, List<Emp>> tm) {
        Set<Empl> keys = tm.keySet();
        for (Empl key : keys) {
            System.out.println(key + " --> " + tm.get(key));
        }
    }


    public static TreeMap<Empl, List<Emp>> transformEmplListToTreeMap(List<Employee> lField) {
        TreeMap<Empl, List<Emp>> tm = new TreeMap<Empl, List<Emp>>(new TreeComparator());
        List<Emp> ls = new ArrayList<Emp>();
        for (Employee em : lField) {
            ls.add(new Emp(em.getThird()));
        }
        Collections.sort(ls, new SortComparator());
        while (lField.size() > 0) {
            Employee em = lField.get(0);
            tm.put(new Empl(em.getName(), em.getSecond()), ls);
            lField.remove(0);
        }
        return tm;
    }


    public static List<Employee> getEmplListFromZip(String filename) {
        CSVReader csvReader;
        List<Employee> lField = new ArrayList<>();
        ZipFile zipFile;
        InputStream inputStream;
        try (ZipInputStream zin = new ZipInputStream(new FileInputStream(filename))) {
            ZipEntry entry;
            if ((entry = zin.getNextEntry()) != null) {
                zipFile = new ZipFile(filename);
                inputStream = zipFile.getInputStream(entry);
                csvReader = new CSVReader(new InputStreamReader(inputStream), ';');
                String[] line;
                while ((line = csvReader.readNext()) != null) {
                    lField.add(new Employee(line[0], line[1], line[2]));
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return lField;
    }

}