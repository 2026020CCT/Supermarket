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
public class Employee extends Person {

    private static int nextId = 1;
    private double salary;
    private String department;
    private String position;
    private String jobTitle;
    private String company;

    public Employee(String fname, String lname, String gender, String email, double salary, String department, String position, String jobTitle, String company) {
        super(nextId, fname, lname, gender, email);
        this.salary = salary;
        this.department = department;
        this.position = position;
        this.jobTitle = jobTitle;
        this.company = company;
        nextId++;
        
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + " | Salary: " + salary + " | Dept: " + department + " | Position: " + position + " | Job Title: " + jobTitle + " | Company: " + company;
    }
}
