package com.student;

import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

            case 1:

                System.out.print("Enter Student ID: ");
                int id = sc.nextInt();

                sc.nextLine(); // Clear buffer

                System.out.print("Enter Student Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Branch: ");
                String branch = sc.nextLine();

                System.out.print("Enter Marks: ");
                int marks = sc.nextInt();

                System.out.println("\n===== STUDENT DETAILS =====");
                System.out.println("ID      : " + id);
                System.out.println("Name    : " + name);
                System.out.println("Branch  : " + branch);
                System.out.println("Marks   : " + marks);
                break;

            case 2:
                System.out.println("View Student Selected");
                break;

            case 3:
                System.out.println("Update Student Selected");
                break;

            case 4:
                System.out.println("Delete Student Selected");
                break;

            case 5:
                System.out.println("Thank You!");
                sc.close();
                return;

            default:
                System.out.println("Invalid Choice!");
            }

        }

    }

}