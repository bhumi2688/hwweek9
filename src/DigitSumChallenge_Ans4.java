
// 4.4. Digit Sum Challenge
public class DigitSumChallenge_Ans4 {   //declare class name
    public static void main(String[] args) {  //main method
        int n = 123456789;   //declare variable
        System.out.println("Sum of all digits for number " + n + " = " + sumDigits(n));  //print statemtnt
    }

    public static int sumDigits(int number)   //static method
    {
        //if else
        if(number < 10)
        {
            return  - 1;
        }else {
            int sum = 0;
            int temp = number;  //temp number
            while (temp > 0)   //while
            {
                sum += temp % 10;
                temp /= 10;
            }
            return sum;
        }
    }
}
