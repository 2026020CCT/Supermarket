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
            quickSortRecursive(list, pivotIndex, high);
        }

    }

    public static int partition(ArrayList<Employee> list, int i, int size) {
        Employee employeeA, employeeB;
        while (i < size) {
            employeeA = list.get(i);
            employeeB = list.get(size);
            if (employeeA.getFname().compareToIgnoreCase(employeeB.getFname()) > 0) {
                list.set(i, list.get(size));
                list.set(size, employeeA);
                list.set(size - 1, employeeB);
                size--;
            } else {
                i++;
            }
        }
        return size;
    }
}
