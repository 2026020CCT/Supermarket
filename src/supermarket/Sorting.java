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
public class Sorting {

    public static void quickSort(ArrayList<Employee> list) {
        quickSortRecursive(list, 0, list.size() - 1);
    }

    public static void quickSortRecursive(ArrayList<Employee> list, int low, int high) {
        if (low < high) {

            int pivotIndex = partition(list, low, high);

            quickSortRecursive(list, low, pivotIndex - 1);
            quickSortRecursive(list, pivotIndex+1, high);
        }
    }

    public static int partition(ArrayList<Employee> list, int low, int high) {
        Employee employeeA, employeeB;
        while (low < high) {
            employeeA = list.get(low);
            employeeB = list.get(high);
            if (employeeA.getFullName().compareToIgnoreCase(employeeB.getFullName()) > 0) {
                list.set(low, list.get(high-1));
                list.set(high, employeeA);
                list.set(high - 1, employeeB);
                high--;
            } else {
                low++;
            }
        }
        return high;
    }
}
