
// 6. Display right angle triangle of @ using nested for loops

import java.util.Scanner;

public class RightAngle_Ans6 {  //declare class

    public static void main(String[] args) {  //main method

            int height;   //declared int variable
            Scanner sc = new Scanner(System.in);  //scanner obj

            System.out.println("Enter the height of the triangle: "); //print statement
            height = sc.nextInt();  //read from user input
            System.out.println();

               //nested loop
            for (int i = 1; i <= height; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("@" + " ");   //print statement in same line with given character
                }
                System.out.println();
            }


        }
}
