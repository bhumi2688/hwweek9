
// 7.Write a programme to input any number and check if it is prime or not.
public class PrimeNumber_Ans7 {  //Declare class name
    public static void main(String[] args) {  //Main method or pre define method
        int num = 30;   //int variable
        boolean flag = false;

            //for loop
        for(int i = 2; i <= num/2; ++i )
        {
            //condition for non prime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }
        if(!flag)

            System.out.println(num + "is s prime number. ");
            else
            System.out.println(num + "is not a prime number. ");


    }
}
