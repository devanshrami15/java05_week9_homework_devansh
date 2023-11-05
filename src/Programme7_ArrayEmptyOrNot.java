import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not.
 */
public class Programme7_ArrayEmptyOrNot {
    public static void main(String[] args) {

        //initializing ArrayList
        ArrayList<String> testinglanguages = new ArrayList<String>();


        testinglanguages.add("Java");
        testinglanguages.add("Python");
        testinglanguages.add("Ruby");
        testinglanguages.add("Kotlin");
        testinglanguages.add("JavaScript");
        testinglanguages.add("DotNet");


        //Checking array list is empty or not

        boolean ans = testinglanguages.isEmpty();
        if (ans == true)
            System.out.println("The ArrayList is empty");
        else
            System.out.println("The ArrayList is not empty");
    }
}
