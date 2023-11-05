import java.util.ArrayList;

/**
 * Declare following two arrylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 *      c1.add("Red");
 *      c1.add("Green");
 *      c1.add("Black");
 *      c1.add("White");
 *      c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 *      c2.add("Red");
 *      c2.add("Green");
 *      c2.add("Black");
 *      c2.add("Pink");
 */
public class Programme11_TwoArryListAndCompare {

    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("Red");
        arrayList1.add("Green");
        arrayList1.add("Black");
        arrayList1.add("White");
        arrayList1.add("Pink");

        ArrayList<String> arrayList2= new ArrayList<String>();
        arrayList2.add("Red");
        arrayList2.add("Green");
        arrayList2.add("Black");
        arrayList2.add("Pink");

        boolean flag = arrayList1.equals(arrayList2);
        if(flag){
            System.out.println("The arraylist are equal");
        }else{
            System.out.println("The arraylist are not equal");
        }

    }
}
