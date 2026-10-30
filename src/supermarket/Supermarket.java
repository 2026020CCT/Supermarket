/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supermarket;

import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author eska
 */
public class Supermarket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO code application logic here
        try {

            // FileReader Class used
            FileReader fileReader = new FileReader("SampleData.txt");

            System.out.println("Reading char by char : \n");
            int i;

            // Using read method
//            while ((i = fileReader.read()) != -1) {
//                System.out.print((char) i);
//            }
//            System.out.println("Reading using array : \n");
//            char[] charArray = new char[10];
            // Using read method for to get character array
//            fileReader.read(charArray);
//            System.out.print(charArray);
            // Close method called
//            fileReader.close();
//            System.out.println("FileReader closed!");
        } catch (Exception e) {
            System.out.println(e);
        }
        while (true) {
            System.out.println("1: Sort");
            System.out.println("2: Search");
            System.out.println("3: Add record");
            System.out.println("4: Create Binary Tree");
            System.out.println("5: Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice){
                case 1: 
            } 
            }
        }

    }
