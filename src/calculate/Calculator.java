package calculate;

public class Calculator {   //declare class

    public void addition(int a , int b) // instance method parameters
    {
        System.out.println(a+b);
    }
    public void subtraction(int a , int b)  //instance method parameters
    {
        System.out.println(a-b);

    }
    public void division(int a , int b) //instance method paramaeters
    {
        System.out.println(a/b);
    }
    public void multiplication(int a, int b)  //instance method with paramteres
    {
        System.out.println(a*b);

    }
    public static int calculateResult(int a , int b , char symbol) //instance method with parameter
    {
        int ans = 0;
        if(symbol == '+'){
            ans = a + b;
        } else if (symbol == '-') {
            ans = a - b;
        } else if (symbol == '*') {
            ans = a * b;
        } else if (symbol == '/') {
            ans = a / b;
        }
        System.out.println("Your answer is "+ ans);
        return ans;
    }
}
