package com.StudentDataBase;
import java.sql.*;
import java.util.*;
public class ModifyDatabase {
    public static Connection con;
    public static void connectDB(){
        try {
              con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "Root@123"
            );
            System.out.println("Database Connected");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public static void insertStudent(){
        Scanner sc = new Scanner(System.in);
        sout
    }
}
