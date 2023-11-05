/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */

import java.util.HashMap;
import java.util.Map;

public class Programme9_HashMap {
    public static void main(String[] args) {

        Map<Integer, String> people = new HashMap<>();
        people.put(1, "Devansh");
        people.put(2, "Dev");
        people.put(3, "Dipesh");
        people.put(4, "Kishan");
        people.put(5, "Manish");
        people.put(6, "Kavit");

        for(int i : people.keySet())
        {
            System.out.println(i);
        }


    }

}
