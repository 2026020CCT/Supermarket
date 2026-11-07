package supermarket;

import java.util.ArrayList;

public class Search {

    public static void search(ArrayList<Employee> list, String searchingName) {
        int index = searchRecursive(list, searchingName, 0, list.size() - 1);

        if (index == -1) {
            System.out.println("No employee found with first name: " + searchingName);
            return;
        }

        // Expand left and right to catch every employee with the same first name
        int low = index;
        while (low > 0 && list.get(low - 1).getFname().equalsIgnoreCase(searchingName)) {
            low--;
        }
        int high = index;
        while (high < list.size() - 1 && list.get(high + 1).getFname().equalsIgnoreCase(searchingName)) {
            high++;
        }

        for (int position = low; position <= high; position++) {
            Employee e = list.get(position);
            System.out.println("|| Full name: " + e.getFullName()
                    + "|| Job title: " + e.getJobTitle()
                    + "|| Department: " + e.getDepartment());
        }
    }

    // Recursive binary search: returns the index of a match, or -1 if not found
    public static int searchRecursive(ArrayList<Employee> list, String name, int low, int high) {
        if (low > high) {
            return -1; // base case: not found
        }

        int mid = low + (high - low) / 2;
        int cmp = list.get(mid).getFname().compareToIgnoreCase(name);

        if (cmp == 0) {
            return mid;
        } else if (cmp < 0) {
            return searchRecursive(list, name, mid + 1, high); // name is later in the list
        } else {
            return searchRecursive(list, name, low, mid - 1);  // name is earlier in the list
        }
    }
}
