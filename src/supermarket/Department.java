/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket;

/**
 *
 * @author eska
 */
public class Department {
    private String departmentName;
    private String departmentId;
    private int numberOfEmployees;
    private String location;          // e.g. "Ground Floor", "Aisle 3"

    // Constructor
    public Department(String departmentName, String departmentId, String location) {
        this.departmentName = departmentName;
        this.departmentId = departmentId;
        this.location = location;
        this.numberOfEmployees = 0;
    }

    // Getters
    public String getDepartmentName() {
        return departmentName;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public String getLocation() {
        return location;
    }

    // Setters
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // Method to increase employee count
    public void addEmployee() {
        this.numberOfEmployees++;
    }

    // Method to decrease employee count
    public void removeEmployee() {
        if (this.numberOfEmployees > 0) {
            this.numberOfEmployees--;
        }
    }

    @Override
    public String toString() {
        return "Department ID: " + departmentId +
               " | Name: " + departmentName +
               " | Location: " + location +
               " | Employees: " + numberOfEmployees;
    }
}