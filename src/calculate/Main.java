package calculate;

import java.util.Scanner;

import static calculate.Calculator.calculateResult;

public class Main { //declare class
    public static void main(String[] args) {  //main method
        char c;
        do {
            //scanner object
            Scanner sc = new Scanner(System.in);
            //ask user to enter first number
            System.out.println("Enter first number: ");
            int a = sc.nextInt();
            //ask user to enter symbol
            System.out.print("Please enter one of the symbol +,-,*,/ :");
            char symbol = sc.next().charAt(0);
            //ask user to enter second number
            System.out.println("Enter second number: ");
            int b = sc.nextInt();
            //print total
            System.out.println("Total : ");
            calculateResult(a,b,symbol);


            System.out.println("Would you like to do more calculation? y or n " );
            c = sc.next().charAt(0);
        }
        while (c == 'Y' || c == 'y');
    }

}
