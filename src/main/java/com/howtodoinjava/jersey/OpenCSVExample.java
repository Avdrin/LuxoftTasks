package com.howtodoinjava.jersey;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Katz on 10.04.2017.
 */
public class OpenCSVExample {

    public static void main(String[] args){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:/11/exampl.csv"));
            List<String> lines = new ArrayList<>();
            String line = null;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }

            System.out.println(lines.get(2));
//            CSVReader reader = new CSVReader(new FileReader("C:/11/exampl.csv"));
//            String [] nextLine;
//
////            CSVReader reader = new CSVReader(new FileReader("yourfile.csv"));
//            List<String[]> myEntries = reader.readAll();
//
//            for(String[] m : myEntries){
//                System.out.println(m[0]);
//            }

//            while ((nextLine = reader.readNext()) != null) {
//                 nextLine[] is an array of values from the line
//                System.out.println(nextLine[0] + nextLine[1] + "etc...");
//            }
//        String csvFilename = "C:/11/exampl.csv";
//        CSVReader csvReader = new CSVReader(new FileReader(csvFilename));
//        String[] row = null;
//
//            while((row = csvReader.readNext()) != null) {
//                System.out.println(row[0]
//                        + " # " + row[1]
//                        + " #  " + row[2]);
//            }
//
//            csvReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//    {
//        CSVReader reader = null;
//        try
//        {
//            BufferedReader fileReader = null;
//            //Get the CSVReader instance with specifying the delimiter to be used
//            reader = new CSVReader(new FileReader("C:/11/exampl.csv"),',');
//            String [] nextLine;
//            String line;
//            //Read one line at a time
//            fileReader = new BufferedReader(new FileReader("C:/11/exampl.csv"));
//            //Read the CSV file header to skip it
//            fileReader.readLine();
//            while ((nextLine = reader.readNext()) != null)
//            {
//                line = fileReader.readLine();
//                String[] tokens = line.split(";");
//                System.out.println("= "+tokens[0] + tokens[1] + tokens[2]);
//
////                for(String token : nextLine)
////                {
////             //       Print all tokens
////                    System.out.println(token);
////                }
//            }
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//        finally {
//            try {
//                reader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
}
