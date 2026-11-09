/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket;

/**
 *
 * @author eska
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class WithFile {

    public static ArrayList<Employee> readEmployeesFromFile(String filename, ArrayList<String> deplist) {
        ArrayList<Employee> list = new ArrayList<>();
//        ArrayList<String> departmentList = new ArrayList<>();
        try {
            File file = new File(filename);
            Scanner fileScanner = new Scanner(file);

            // Skip the header line (if your file has one)
            if (fileScanner.hasNextLine()) {
                fileScanner.nextLine();
            }

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] data = line.split(",");
                System.out.println(data[0] + data[1] + data[2] + data[3] + data[4] + data[5] + data[6] + data[7] + data[8]);
                // Example assuming the file format is:
                // FirstName,LastName,Department,Position,ManagerType,Salary
                if (data.length >= 6) {
                    if (!deplist.contains(data[5])) {
                        deplist.add(data[5]);
                    }
                    double salary = Double.parseDouble(data[4].trim());
                    Employee emp = new Employee(data[0].trim(), data[1].trim(), data[2].trim(), data[3].trim(), salary, data[5].trim(), data[6].trim(), data[7].trim(), data[8].trim());
                    list.add(emp);
                }
            }

            fileScanner.close();
            System.out.println("File read successfully. Total employees loaded: " + list.size());

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + filename);
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return list;
    }
    public static void toFile(ArrayList<Employee> list){
        
    }
}
