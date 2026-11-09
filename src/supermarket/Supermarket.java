/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supermarket;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author eska
 */
public class Supermarket {

    private static ArrayList<Employee> employeeList = new ArrayList<>();
    private static ArrayList<String> departmentList = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO code application logic here

        loadSampleData();

        while (true) {
            // Display the menu using Enum
            MenuOption.displayMenu();

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear the buffer

            MenuOption selected = MenuOption.fromNumber(choice);

            if (selected == null) {
                System.out.println("Invalid option. Please try again.\n");
                continue;
            }

            // Call the correct method based on user choice
            switch (selected) {
                case SORT:
                    sortEmployees();
                    break;

                case SEARCH:
                    searchEmployee(sc);
                    break;

                case ADD_RECORDS:
                    addNewEmployee(sc);
                    break;

                case CREATE_BINARY_TREE:
                    createBinaryTree();
                    break;

                case EXIT:
                    System.out.println("Thank you for using the Supermarket System. Goodbye!");
                    sc.close();
                    return;
            }
        }
    }

    // ========== METHODS ==========
    // 1. Sort method
    public static void sortEmployees() {
        System.out.println("\n--- Sorting Employees ---");
        Sorting.quickSort(employeeList);
        for (int i = 0; i < 20; i++) {
            System.out.println(employeeList.get(i).toString());
        }
    }

    // 2. Search method
    public static void searchEmployee(Scanner sc) {
        System.out.println("!! Reminder !!! list is going to be sorting !!");
        Sorting.quickSort(employeeList);
        System.out.println("\n--- Search Employee ---");
        System.out.print("Enter name to search:  ");
        String name = sc.nextLine();
        Search.search(employeeList, name);
    }

    // 3. Add new employee method
    public static void addNewEmployee(Scanner sc) {
        System.out.println("\n--- Add New Employee ---");
        Employee newEmployee = AddEmployee.addEmployee(sc, departmentList, employeeList);
        Sorting.addToArray(employeeList, newEmployee);
        
    }

    // 4. Binary Tree method
    public static void createBinaryTree() {
        System.out.println("\n--- Creating Employee Hierarchy (Binary Tree) ---");
    }

    // Optional: Load some sample data
    public static void loadSampleData() {
        employeeList = WithFile.readEmployeesFromFile("SampleData.txt",departmentList);
        System.out.println("Sample data loaded successfully.");
    }
}
