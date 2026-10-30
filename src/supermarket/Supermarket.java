/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supermarket;

import java.io.FileReader;

/**
 *
 * @author eska
 */
public class Supermarket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {

            // FileReader Class used
            FileReader fileReader = new FileReader("SampleData.txt");

            System.out.println("Reading char by char : \n");
            int i;

            // Using read method
            while ((i = fileReader.read()) != -1) {
                System.out.print((char) i);
            }

            System.out.println("Reading using array : \n");
            char[] charArray = new char[10];

            // Using read method for to get character array
            fileReader.read(charArray);
            System.out.print(charArray);

            // Close method called
            fileReader.close();
            System.out.println("FileReader closed!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
