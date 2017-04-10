package com.howtodoinjava.jersey;

/**
 * Created by Katz on 10.04.2017.
 */
import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

//import au.com.bytecode.opencsv.CSVReader;

public class WriteCSV_OpenCSV
{
    public static void main(String args[])
    {
        CSVReader csvReader = null;

        try
        {

            csvReader = new CSVReader(new FileReader("C:/11/exampl.csv"),';'); //,'"',1);
            //employeeDetails stores the values current line
            String[] employeeDetails = null;
            //Create List for holding Employee objects
            List<Employee> empList = new ArrayList<Employee>();

//            while((employeeDetails = csvReader.readNext())!=null)
//            {
                employeeDetails = csvReader.readNext();
                //Save the employee details in Employee object
                System.out.println(employeeDetails[2]); // +
//                        employeeDetails[1] + employeeDetails[2]);
//                empList.add(emp);
//            }

            //Lets print the Employee List
//            for(Employee e : empList)
//            {
//                System.out.println(e.getName()+"   "
//                        +e.getSecond()+"   "+e.getThird());
//            }
        }
        catch(Exception ee)
        {
            ee.printStackTrace();
        }
    }
}
