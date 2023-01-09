import java.util.Scanner;

/* 5. Write a program in Java to display the pattern like a triangle with a number. For eg.
Input number of rows: 10  */
public class TianglePattern_Ans5 {  //declare class
    public static void main(String[] args) { //main method


        int i, j, n;  //declared variable
        System.out.print("Input number of rows : ");  //print statemetn
        Scanner sc = new Scanner(System.in);  //scanner obj
        n = sc.nextInt();  //read from user input

        //for loop
        for (i=1;i<=n;i++) {
            for (j = 1; j <= i; j++)
                System.out.print(j);   //print statement same line

            System.out.println("");
        }
    }
}

