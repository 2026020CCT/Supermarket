/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket;

/**
 *
 * @author eska
 */
public class Employee extends Person {
    private String department;
    private String position;
    private String company;
    private double salary;

    public Employee(String fname, String lname, String gender, String email, int id, String department, String position, String company, double salary) {
        super(fname,lname,gender,email,id);
        this.department = department;
        this.position = position;
        this.company = company;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    public String getCompany() {
        return company;
    }
    
    public double getSalary(){
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + " | Position: " + position + 
               " | Dept: " + department + " | Company: " + company +" | Salary: " + salary;
    }
}
