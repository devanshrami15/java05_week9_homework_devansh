import java.util.Scanner;

/**
 * Rewrite the student mark sheet programme (From java-homework-week3
 * programmes) using if else and while loop.
 */

public class Programme2_StudentMarkSheet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student Name: ");
        String name = sc.next();
        System.out.print("Enter Roll No  :  ");
        int rollno = sc.nextInt();
        System.out.print("Enter Math marks  :  ");
        int math = sc.nextInt();

        while (math < 0 || math > 100) {
            System.out.println("Invalid math marks, marks between 0 to 100");
            System.out.println(" \n Please enter correct marks\t: ");
            math = sc.nextInt();
        }
        System.out.print("Enter Science marks  :  ");
        int science = sc.nextInt();
        while (science < 0 || science > 100) {
            System.out.println("Invalid science marks, marks between 0 to 100");
            System.out.println(" \n Please enter correct marks\t : ");
            science = sc.nextInt();
        }
        System.out.print("Enter English marks  :  ");
        int english = sc.nextInt();
        while (english < 0 || english > 100) {
            System.out.println("Invalid english marks, marks between 0 to 100");
            System.out.println("\n Please enter correct marks\t :");
            english = sc.nextInt();
            sc.close();
        }

        int total = (math + science + english);
        double percentage = (total * 100 / 300);

        String grade = " ";
        if (percentage >= 80) {
            //System.out.println("A+");
            grade = "A+";
        } else if (percentage >= 60) {
            //System.out.println("A");
            grade = "A";
        } else if (percentage >= 50) {
            //System.out.println("B");
            grade = "B";
        } else if (percentage >= 35) {
            //System.out.println("C");
            grade = "C";
        }
        //int result = 0;
        String rs = " ";
        if (percentage >= 35) {
            // System.out.println("Fail");
            rs = "PASS";
        } else {
            //System.out.println("Pass");
            rs = "FAIL";
        }


        System.out.println("-----------------------------------");
        System.out.println("|                                 |");
        System.out.println("| Mark Sheet                      |");
        System.out.println("|                                 |");
        System.out.println("|Name :           "+name+"           |");
        System.out.println("|Roll No :        "+rollno+"               |");
        System.out.println("|_________________________________|");
        System.out.println("|Subjects :         Marks         |");
        System.out.println("|Maths  :         "+math +"              |");
        System.out.println("|Science  :       "+science +"              |");
        System.out.println("|English  :       "+english +"              |");
        System.out.println("|_________________________________|");
        System.out.println("|Total    :       "+total +"             |");
        System.out.println("|_________________________________|");
        System.out.println("|Percentage :     "+percentage +"            |");
        System.out.println("|Result :         " +rs +"            |");
        System.out.println("|Grade :          " + grade + "               |");
        System.out.println("|_________________________________|");

    }
}
