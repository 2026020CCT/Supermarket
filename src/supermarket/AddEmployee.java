/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author eska
 */
public class AddEmployee {

    public static Employee addEmployee(Scanner sc, ArrayList<String> deplist, ArrayList<Employee> list) {
        System.out.println("Enter the information of new employee.");
        System.out.println("First name: ");
        String fName = getStr(sc);
        System.out.println("Last name: ");
        String lName = getStr(sc);
        System.out.println("Gender: ");
        String gender = getStr(sc);
        System.out.println("Email: ");
        String mail = getStr(sc);
        double salary = getint(sc);
        System.out.println("Department: ");
        String department = getDep(sc, deplist);
        System.out.println("Position: ");
        String position = getStr(sc);
        System.out.println("Job title: ");
        String jobTitle = getStr(sc);
        System.out.println("Company: ");
        String company = getStr(sc);

        Employee newEmployee = new Employee(fName, lName, gender, mail, salary, department, position, jobTitle, company);
        return newEmployee;
    }

    public static String getDep(Scanner sc, ArrayList<String> deplist) {
        System.out.println("\nAvailable Departments:");
        for (int i = 0; i < deplist.size(); i++) {
            System.out.println((i + 1) + ". " + deplist.get(i));
        }
        String department;
        while (true) {
            department = getStr(sc);
            if (deplist.contains(department)) {
                return department;
            } else {
                System.out.println("Error: Department does not exist.");
                System.out.println("Check it and try again: ");
            }
        }

    }

    public static String getStr(Scanner sc) {
        String name = sc.nextLine().trim();;
        while (name.isEmpty()) {
            System.out.println("This field must not be empty!!!");
            name = sc.nextLine().trim();
        }
        return name;
    }

    public static double getint(Scanner sc) {
        while (true) {
            try {
                System.out.print("Salary: ");
                double n = sc.nextDouble();
                sc.nextLine(); // clear the buffer
                return n;
            } catch (Exception e) {
                System.out.println("Please enter a valid number!");
                sc.nextLine(); // clear the wrong input
            }
        }
    }

}
