import java.util.Scanner;
/*- 2. Read the numbers from the console entered by the user and
print the minimum and maximum number the user has entered.
 */
public class MinandMaxInputChallenge_Ans2 {   //Declare class name

    public static void main(String[] args) {  //pre definer method

        int count = 0;
        int max = 0;
        int min = 0;
        boolean first = true;

        Scanner minimumMAximumInput = new Scanner(System.in);  //scanner class
        while(true){

            System.out.println("Enter a number: ");
            boolean hashNextInt = minimumMAximumInput.hasNextInt();  //read from user input

            count += 1;
            if(hashNextInt) {    //if statement

                int storedNumber = minimumMAximumInput.nextInt();  //user input

                if(first){
                    first = false;
                    min = storedNumber;
                    max = storedNumber;
                }

                if(storedNumber > max) {
                    max = storedNumber;
                }

                if(storedNumber < min) {
                    min = storedNumber;
                }

                if(count == 5) {
                    break;
                }
            } else {   //else statement

                System.out.println("Invalid number");
                break;
            }

            minimumMAximumInput.nextLine();
        }

        System.out.println("The minimum number of this: " + min);  //print statement
        System.out.println("The maximum number of this: " + max);  //print statement


        minimumMAximumInput.close();

    }



}
