package com.howtodoinjava.jersey;

/**
 * Created by Katz on 10.04.2017.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestReadFile {

    public static void main(String args[]) {

        String fileName = "c://11//lines.txt";
        List<String> list = new ArrayList<>();

        try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {

            //br returns as stream and convert it into a List
            list = br.lines().collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }

        list.forEach(System.out::println);

//        String fileName = "c://11//lines.txt";
//
//        //read file into stream, try-with-resources
//        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
//
//            stream.forEach(System.out::println);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }

}
