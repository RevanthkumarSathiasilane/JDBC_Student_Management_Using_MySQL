package com.StudentDataBase;
import java.util.*;
public class StudentDatabase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ModifyDatabase md = new ModifyDatabase();
        md.connectDB();
        System.out.println("---STUDENT DATABASE---");
        while(true){
            System.out.println("1.Add Student");
            System.out.println("2.View All Students");
            System.out.println("3.Search Student By ID");
            System.out.println("4.Update Student Mark");
            System.out.println("5.Delete Student");
            System.out.println("6.View Only Names");
            System.out.println("7.View Students Above Mark");
            System.out.println("8.Count Total Students");
            System.out.println("9.Sort Students By Mark");
            System.out.println("10.Exit");
            System.out.print("Enter your choice:");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    md.insertStudent();
                    break;
                case 2:
                    md.viewStudents();
                    break;
                case 3:
                    md.searchByID();
                    break;
                case 4:
                    md.updateMark();
                    break;
                case 5:
                    md.deleteStudent();
                    break;
                case 6:
                    md.viewOnlyNames();
                    break;
                case 7:
                    md.viewAboveSpecificMark();
                    break;
                case 8:
                    md.countStudents();
                    break;
                case 9:
                    md.sortByMarks();
                    break;
                case 10:
                    System.out.println("Thank you");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
                }
            }
        }
    }

