package com.StudentDataBase;
import java.sql.*;
import java.util.*;
public class ModifyDatabase {
    public static Connection con;

    public static void connectDB() {
        try {
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "Root@123"
            );
            System.out.println("Database Connected");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void insertStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student ID:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Student Name:");
        String name = sc.nextLine();
        System.out.println("Enter Student Age:");
        int age = sc.nextInt();
        System.out.println("Enter Student Mark:");
        double mark = sc.nextDouble();
        try {
            String query = "INSERT INTO students VALUES(?,?,?);";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, age);
            ps.setDouble(4, mark);
            int row = ps.executeUpdate();
            System.out.println(row + " rows inserted successfully");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void viewStudents(){
        try{
            String query = "SELECT * FROM students;";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                System.out.println("Id: "+rs.getInt(1));
                System.out.println("Name: "+rs.getString(2));
                System.out.println("Age: "+rs.getInt(3));
                System.out.println("Mark: "+rs.getDouble(4));
            }
            System.out.println("All student details!!");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
