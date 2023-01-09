package javaprogrames;

import java.util.Scanner;

//2. Re write the student mark sheet program using if else and while loop.
public class Marksheet_Ans2 {  //class name
    public static void main(String[] args) {   //Main method or pre defined method
        Scanner sc = new Scanner(System.in);   //scanner class
        System.out.println("MarkSheet");

        System.out.println("Student Name");
        String name = sc.next();  //reads from user input
        System.out.println("Roll No");
        int rollNo = sc.nextInt();  //read from user input
        System.out.println("Subject :");
        System.out.println("Enter Maths Marks :");
        int maths = sc.nextInt();  //read from user input
        System.out.println("Enter English Marks :");
        int english = sc.nextInt();  //read from user input
        System.out.println("Enter Science Marks :");
        int science = sc.nextInt();  //read from user input

        String Result;
        String Grade;

        int total = 300;
        float sum = maths + english + science;
        System.out.println("Total marks is :" + total);

        float percentage = sum / total * 100;   //percentage formula
        System.out.println("Total Percentage is :" + percentage);

        //nested if else
        if (percentage >= 35) {
            System.out.println("Result is Pass");
        }
        if (percentage >= 80) {
            System.out.println("The Grade is A+");
        } else if (percentage >= 60) {
            System.out.println("The Grade is A");
        } else if (percentage >= 50) {
            System.out.println("The Grade is B");
        } else if (percentage >= 35) {
            System.out.println("The Grade is C");
        } else {
            System.out.println("Fail");
        }
        while (percentage<35)    //while loop
        {
            System.out.println("Grade not pass");
            break;
        }

    }

}
