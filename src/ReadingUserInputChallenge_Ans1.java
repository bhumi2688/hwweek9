import java.util.Scanner;

/* 1. Read 10 numbers from the console entered by the user and print the sum of those numbers.
-Use the hasNextInt() method from the scanner to check if the user has entered an int value.
-If hasNextInt() returns false, print the message Invalid Number.
Continue reading until you have read 10 numbers.
-Use the nextInt() method to get the number and add it to the sum.
-Before the user enters each number, print the message Enter number #x: where x represents the count, i.e. 1, 2, 3, 4, etc.
*/
public class ReadingUserInputChallenge_Ans1 {  //Class name
    public static void main(String[] args) {  //Pre defined method or main method
        Scanner sc = new Scanner(System.in);  //scanner object
        System.out.println("Please enter 10 numbers");  //print statemtn

        int number = 0;
        int total = 0;
        int counter = 0 ;    //Declare variable counter
            //while loop
        while (counter < 10) {
            System.out.println("Enter number #" + (counter + 1));
            boolean hasNextInt = sc.hasNextInt();  //read from user input

            if (hasNextInt) {
                number = sc.nextInt();
                counter++;
                total += number;
            } else {
                System.out.println("Invalid input");
                sc = new Scanner(System.in);
            }
        }
        sc.close();   //close
        System.out.println("Total is : " + total);  //print total
    }
}











