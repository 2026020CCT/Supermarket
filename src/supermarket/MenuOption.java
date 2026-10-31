/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket;

/**
 *
 * @author eska
 */
public enum MenuOption {
    SORT(1, "Sort the list of applicants"),
    SEARCH(2, "Search for a person"),
    ADD_RECORDS(3, "Add new employee record"),
    CREATE_BINARY_TREE(4, "Create Employee Hierarchy (Binary Tree)"),
    EXIT(5, "Exit the program");

    private final int optionNumber;
    private final String description;

    // Constructor
    MenuOption(int optionNumber, String description) {
        this.optionNumber = optionNumber;
        this.description = description;
    }

    public int getOptionNumber() {
        return optionNumber;
    }

    public String getDescription() {
        return description;
    }

    // Method to display all menu options
    public static void displayMenu() {
        System.out.println("\n========== SUPERMARKET MENU ==========");
        for (MenuOption option : MenuOption.values()) {
            System.out.println(option.getOptionNumber() + ". " + option.getDescription());
        }
        System.out.println("======================================");
    }

    // Method to get the Enum from the number the user types
    public static MenuOption fromNumber(int number) {
        for (MenuOption option : MenuOption.values()) {
            if (option.getOptionNumber() == number) {
                return option;
            }
        }
        return null; // invalid option
    }
}
