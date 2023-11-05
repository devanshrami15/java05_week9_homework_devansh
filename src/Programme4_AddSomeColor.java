/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */

import java.util.ArrayList;

public class Programme4_AddSomeColor {
    public static void main(String[] args) {
        colorDeclaration();
    }

    public static void colorDeclaration(){
        // Create a new ArrayList of strings to store colors
        ArrayList<String> colorList = new ArrayList<>();

        // Add some color strings to the ArrayList
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");
        colorList.add("Yellow");
        // Print out the collection using a for-each loop
        System.out.println("Colors in the ArrayList:");

        for (String color : colorList) {
            System.out.println(color);
        }
    }
}

