import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */

public class Programme5_Iterater {
    public static void main(String[] args) {
        arrayIterater();
    }

    public static void arrayIterater() {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add some numbers to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Get an Iterator for the ArrayList
        Iterator<Integer> iterator = numbers.iterator();

        // Use the Iterator to iterate through the elements
        System.out.println("Iterating through the ArrayList using Iterator:");

        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println(number);


        }
    }
}
