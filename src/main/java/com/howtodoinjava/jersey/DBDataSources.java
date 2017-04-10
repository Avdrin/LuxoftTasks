package com.howtodoinjava.jersey;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class DBDataSources {

    DBConnection dbConnection = new DBConnection();
    private static final Logger LOGGER = LogManager.getLogger(MyTMCompUserDefine.class.getName());


    protected void dropTable() {
        try {
            Statement statement = dbConnection.getConnection().createStatement(); //connection.createStatement();
            String sql = "DROP TABLE IF EXISTS testTable";
            statement.executeUpdate(sql);
            System.out.print("dropp");
        } catch (SQLException e) {
            System.out.print("err =="+e);
        }
    }
        protected void createTable() {
        try {
            Statement statement = dbConnection.getConnection().createStatement(); //connection.createStatement();
            String sql = "CREATE TABLE testTable (id IDENTITY NOT NULL, name1 VARCHAR(255) NOT NULL, name2 VARCHAR(255) NOT NULL, name3 VARCHAR(255));"; //"CREATE TABLE testTable (id IDENTITY , value VARCHAR(255), talue VARCHAR(255))";
            statement.executeUpdate(sql);
//            System.out.print("createss");
        } catch (SQLException e) {
            System.out.print("Error: "+e);
        }
    }

    protected void fillTable(TreeMap<Empl, List<Emp>> tm) {
        Statement statement;
        try {
            statement = dbConnection.getConnection().createStatement(); //connection.createStatement();


            for (Map.Entry entry: tm.entrySet()) {
                Empl keyEmp = (Empl) entry.getKey();
                List<Emp> valueEmp = (List<Emp>) entry.getValue();

                String sql = "INSERT INTO testTable (name1,name2,name3) VALUES("+"'"+keyEmp.getName()+"'"+","+"'"+keyEmp.getSecond()+"'"+
                        ","+"'"+valueEmp.get(0)+"'"+")";
                statement.executeUpdate(sql);

            }



//            String sql = "INSERT INTO testTable (name1,name2,name3) VALUES(tm.get(""),10.50)";
//            statement.executeUpdate(sql);
//            sql = "INSERT INTO testTable (title,price) VALUES('Услуга2',11.20)";
//            statement.executeUpdate(sql);
//            sql = "INSERT INTO testTable (title,price) VALUES('Услуга3',12.30)";
//            statement.executeUpdate(sql);
//            sql = "INSERT INTO testTable (title,price) VALUES('Услуга4',23.50)";
//            statement.executeUpdate(sql);
//            sql = "INSERT INTO testTable (title,price) VALUES('Услуга5',16.20)";
//            statement.executeUpdate(sql);
            System.out.print("insertt");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void printTable() {
        Statement statement;

        try {
            statement = dbConnection.getConnection().createStatement();
            String sql = "SELECT id, name1, name2, name3 FROM testTable";
            ResultSet resultSet = statement.executeQuery(sql);


            while (resultSet.next()) {
                LOGGER.info("From db: " + resultSet.getInt(1) + " "
                        + resultSet.getString(2) + " "
                        + resultSet.getString(3)+ " "
                        + resultSet.getString(4));
            }
            System.out.print("voidd");
        } catch (SQLException e) {
            e.printStackTrace();
            LOGGER.error(e);
        }
    }


}
