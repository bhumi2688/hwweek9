import java.util.Scanner;
 /*3.Write a Java program that takes the user to provide a single character from the alphabet.
  Print Vowel of Consonant, depending on the user input.
  If the user input Is not a letter (between a and z or A and Z), or is a string of length > 1,
 print an error message. */
public class VowelConsonant_Ans3 {   //Declare class name

    public static void main(String[] args) {  //pre defined method
        char ch;
        Scanner sc = new Scanner(System.in);   //obj created

        System.out.println("Enter an alphabet: ");
        ch = sc.next().charAt(0);   //read user input

           //if else statement
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
           ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            System.out.println("\nIt is a vowel. ");   //print statement
        else
            System.out.println("\nIt is a Consonant. ");  //print statemnt


    }

}
