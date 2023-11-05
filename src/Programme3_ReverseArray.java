import java.util.Arrays;

/**
 * Write a Java program to reverse an array of integer values.
 */

public class Programme3_ReverseArray {
//    public static void main(String[] args) {
//        int [] normalArray = {1,2,3,4,5};
//        int [] reverseArray = reverseArray(normalArray);
//
//        //Scanner sc = new Scanner(System.in);
//        System.out.println("Print Normal Array: ");
//      //  int i = sc.nextInt();
//        System.out.println("Print Reverse Array: ");
//    }
//
//    public static int[] reverseArray(int[] array){
//        int length = array.length;
//        int[] reverseArray = new int[length];
//
//        for (int i = 0; i < length; i++) {
//            reverseArray[i] = array[length - 1 - i];
//        }
//
//        return reverseArray;
//    }
//
//    public static void printArray(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//    }

    public static void main(String[] args) {
        int[] my_array1 = {
                5021, 5685, 1899, 1456, 2013,
                3256, 2458, 5245, 1472, 2365,
                1456, 2165, 2537, 1987};

        System.out.println("Original array : "+ Arrays.toString(my_array1));

        for(int i = 0; i < my_array1.length / 2; i++)
        {
            int temp = my_array1[i];
            my_array1[i] = my_array1[my_array1.length - i - 1];
            my_array1[my_array1.length - i - 1] = temp;
        }

        System.out.println("Reverse array : "+Arrays.toString(my_array1));

    }
}
