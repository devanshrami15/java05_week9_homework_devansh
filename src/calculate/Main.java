package calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner Creation
        Scanner sc = new Scanner(System.in);
        //object creation
        Calculator calculator = new Calculator();

        char doMoreCalculation = 'Y';

        while(doMoreCalculation == 'Y' || doMoreCalculation == 'y'){

            System.out.println("Enter first number : ");
            int num1 = sc.nextInt();

            System.out.println("Enter second number :");
            int num2 = sc.nextInt();

            System.out.println("Please choose one of symbol +, -, /, * : ");
            char symbol = sc.next().charAt(0);

            calculator.calculateResult(num1, num2, symbol);

            System.out.println("Would you like to do more calculation?");
            System.out.println("Please enter 'Y' or 'N' : ");
            doMoreCalculation =sc.next().charAt(0);
            sc.close();
        }
        System.out.println("Programme Terminated");
    }
}
