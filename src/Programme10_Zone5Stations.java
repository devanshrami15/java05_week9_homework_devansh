/**
 * Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */

import java.util.HashMap;
import java.util.Scanner;

public class Programme10_Zone5Stations {

    public static void main(String[] args) {

        System.out.println("This is Zone 1 Station list : ");
        System.out.println(" ");

        System.out.println("ALDGATE, EUSTON SQUARE, OXFORD CIRCUS, WATERLOO LU, TOWER HILL, OLD STREET,");
        System.out.println("SOUTH KENSINGTON, VICTORIA LU, LANCASTER GATE, GREEN PARK, FARRINGDON, EDGWARE ROAD,");

        stationList();

    }

    public static void stationList() {
        char result;

        HashMap<String, String> zone = new HashMap<String, String>();
        zone.put("ALDGATE", "Circle/Metropolitan");
        zone.put("ANGEL", "Northern");
        zone.put("BAKERSTREET", "Bakerloo/Circle/Hammersmith & City/Jubilee/Metropolitan");
        zone.put("BAYSWATER", "Circle/District");
        zone.put("BOND STREET", "Circle/Jubilee");
        zone.put("CHARING CROSS LU", "Northern/Bakerloo");
        zone.put("COVENT GARDEN", "Piccadilly");
        zone.put("EDGWARE ROAD", "Circle/District/Hammersmith & City");
        zone.put("EUSTON LU", "Victoria/Northern");

        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter any station name from above list :");

            String name1 = input.nextLine();
            name1 = name1.toUpperCase();

            for (String i : zone.keySet()) {
                if (name1.equals(i)) {
                    System.out.println("Available Tube Lines  : " + zone.get(i));
                }
            }
            System.out.println("Do you want to try again : 'Y' or 'N' ");
            result = input.next().charAt(0);
        } while (result == 'Y' || result == 'y');

    }
}




