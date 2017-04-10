//package com.howtodoinjava.jersey;
//
//import java.io.*;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.net.URLConnection;
//import java.util.Scanner;
//
///**
// * Created by Katz on 10.04.2017.
// */
//public class Main {
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Type the path to your 'IN' file:\n");
//
//        String path = buffer.readLine();
//        System.out.println("Type search string:\n");
//
//        String searchString = buffer.readLine();
//        RandomAccessFile raf = new RandomAccessFile(path, "rw");
//        raf.seek(0);
//
//        long time = System.currentTimeMillis();
//        String urlFromFile;
//        String htmlCodeLine = null;
//        long i = 0;
//        long j = 0;
//        while ((urlFromFile = raf.readLine()) != null) {
//            try {
//                URL url = new URL(urlFromFile);
//                URLConnection urlConn = url.openConnection();
//                urlConn.setConnectTimeout(1500);
//                urlConn.setReadTimeout(1500);
//                InputStream inStream = urlConn.getInputStream();
//                BufferedReader br = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
//                System.out.println("====================");
//                System.out.println(urlFromFile);
//                System.out.println("====================");
//                i++;
//                while ((htmlCodeLine = br.readLine()) != null) {
//                    System.out.println("CurrentLine = " + htmlCodeLine);
////                    Scanner scannerHTML;
//                    scannerHTML.ScannerHTML(htmlCodeLine, searchString, urlFromFile);
//                    j++;
//                }
//                inStream.close();
//            } catch (MalformedURLException me) {
//                System.out.println("====================");
//                System.err.println("Unknown host: " + me);
//                System.out.println("====================");
//            } catch (IOException ioe) {
//                System.out.println("====================");
//                System.err.println("Input error: " + ioe);
//                System.out.println("====================");
//            }
//        }
//
//        System.out.println();
//        System.out.println();
//        System.out.println("===============================");
//        System.out.println("================END OF SCAN=====");
//        System.out.println("===============================");
//        System.out.println();
//        System.out.println();
//        System.out.println("Get scanned: " + i
//                + " URL's.                                   ");
//        System.out.println("Total scanned lines: " + j
//                + " lines.                                          ");
//        System.out.println("Time passed: "
//                + (System.currentTimeMillis() - time) + " msec.");
//        System.out.println("("
//                + (((System.currentTimeMillis() - time) / 1000) / 60)
//                + " min.)");
//        System.out.println();
//        System.out.println();
//        System.out.println("=====================================");
//        System.out.println("================END OF SCAN===========");
//        System.out.println("=====================================");
//
//
//        raf.close();
//    }
//}