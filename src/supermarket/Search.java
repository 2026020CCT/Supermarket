/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket;

import java.util.ArrayList;

/**
 *
 * @author eska
 */
public class Search {

    public static void search(ArrayList<Employee> list, String searchingName) {

        searchRecursive(list, searchingName, 0, list.size());
    }

    public static void searchRecursive(ArrayList<Employee> list, String name, int low, int high) {

        int half = low + (high - low) / 2;
        if (list.get(half).getFname() != name) {

            if (list.get(half).getFname().compareToIgnoreCase(name) < 0) {
                searchRecursive(list, name, low, half - 1);
            } else {
                searchRecursive(list, name, half + 1, high);
            }
        }
        low = half;
        high = half;
        while (list.get(half).getFname().compareToIgnoreCase(list.get(low - 1).getFname()) == 0) {
            low--;
        }
        while (list.get(half).getFname().compareToIgnoreCase(list.get(high).getFname()) == 0) {
            high++;
        }
        for (int position = low; position < high; position++) {
            String returnvalue = "|| Full name: " + list.get(position).getFullName() + "|| Job title: " + list.get(position).getJobTitle() + "|| Department: " + list.get(position).getDepartment();
            System.out.println(returnvalue);
        }
    }

}
