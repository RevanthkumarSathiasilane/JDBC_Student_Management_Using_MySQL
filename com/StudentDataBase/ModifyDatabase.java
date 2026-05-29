package com.StudentDataBase;
import java.sql.*;
import java.util.*;
public class ModifyDatabase {
    public static Connection con;

    public void connectDB() {
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

    public void insertStudent() {
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
            String query = "INSERT INTO students VALUES(?,?,?,?);";
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
    public void viewStudents(){
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
    public void searchByID(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Stundent ID to view :");
        int id = sc.nextInt();
        try{
            String query = "SELECT * FROM students WHERE id = ?;";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println("ID: "+rs.getInt(1));
                System.out.println("Name: "+rs.getString(2));
                System.out.println("Age: "+rs.getInt(3));
                System.out.println("Mark: "+rs.getDouble(4));
            }
            System.out.println("Selected the Id- "+ id +" you gave to recover");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public void updateMark(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student ID:");
        int id = sc.nextInt();
        System.out.println("Enter New mark :");
        double mark = sc.nextDouble();
        try{
            String query = "UPDATE students SET mark = ? WHERE id = ?;";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setDouble(1,mark);
            ps.setInt(2,id);
            int rows = ps.executeUpdate();
            System.out.println(rows+" rows updated");

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public void deleteStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student ID to delete:");
        int id = sc.nextInt();
        try{
            String query = "DELETE FROM students WHERE id = ?;";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1,id);
            int rows = ps.executeUpdate();
            System.out.println(rows+" rows deleted");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void viewOnlyNames(){
        String query = "SELECT name from students;";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                System.out.println("Name:" + rs.getString(1));
            }
            System.out.println("Name printed");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public void viewAboveSpecificMark(){
        try{
            String query = "SELECT * FROM students WHERE mark >= 80";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                System.out.println("Id :"+rs.getInt(1));
                System.out.println("Name :"+rs.getString(2));
                System.out.println("Age :"+rs.getInt(3));
                System.out.println("Mark :"+rs.getDouble(4));
            }
            System.out.println("Shown!!");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
   public void countStudents(){
        try{
            String query = "SELECT COUNT(*) FROM students;";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            System.out.println("No.of Records: "+rs.getInt(1));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
   }
   public void sortByMarks(){
        try{
            String query = "SELECT * FROM students ORDER BY mark ASC;";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                System.out.println("ID:"+rs.getInt(1));
                System.out.println("Name:"+rs.getString(2));
                System.out.println("Age:"+rs.getInt(3));
                System.out.println("Mark:"+rs.getDouble(4));
            }
            System.out.println("Sorted Data");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
   }
}
