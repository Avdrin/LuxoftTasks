package com.howtodoinjava.jersey;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * Created by Katz on 10.04.2017.
 */
public class ExtractFileFromZipFile {

    public static void main(String args[])
    {

        String sourceZipFile = "C:/11/exampl.zip";

        try
        {
            //create FileInputStream from the source zip file
            FileInputStream fin = new FileInputStream(sourceZipFile);

            //create ZipInputStream from FileInputStream object
            ZipInputStream zin = new ZipInputStream(fin);

//            get the first entry from the source zip file
            ZipEntry entry = zin.getNextEntry();


//            byte[] buffer = new byte[1024];
////            Csv.Reader reader = null;
////        List<Employee> lField = new ArrayList<>();
//        try (ZipInputStream zin = new ZipInputStream(fin)) {
//            ZipEntry entry;
//            while ((entry = zin.getNextEntry()) != null) {
//                zin.read(buffer);
//
////                reader = new Csv.Reader(new FileReader("C:/11/" + entry.getName())).delimiter(';').ignoreComments(true);
////                List<String> line;
////                while ((line = reader.readLine()) != null) {
////                    lField.add(new Employee(line.get(0), line.get(1), line.get(2)));
////                }
//            }
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
////        return lField;
////    }



            //crate OutputStream to extract the entry from zip file
            OutputStream os = new FileOutputStream("c:/11/extractedFile.css");


            byte[] buffer = new byte[1024];
            int length;

            //read the entry from zip file and extract it to disk
            while( (length = zin.read(buffer)) > 0)
            {
                os.write(buffer, 0, length);
                System.out.println(buffer);

            }

            //close the streams
            os.close();

            //close the zip file
            zin.close();

            System.out.println("File Extracted from zip file");
        }
        catch(IOException e)
        {
            System.out.println("IOException :" + e);
        }

    }

}
