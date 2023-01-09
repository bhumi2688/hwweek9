
// 11.Sum Calculator
public class SimpleCalculator {  //Class name
    private double firstNumber;   //private varisble declared
    private double secondNumber;  //declared private variable

    public double getFirstNumber()   //instance method without parameter
    {
        return firstNumber;
    }
    public double getSecondNumber()  //method without paramtere
    {
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    public double getAdditionResult()   //get method to access private variable
    {
        return firstNumber + secondNumber;
    }
    public double getSubtractionResult( )   // get method to access private variable
    {
        return firstNumber - secondNumber;
    }
    public double getMultiplicationResult()   //get method
    {
        return firstNumber * secondNumber;
    }
    public double getDivisionResult()   // get method
    {
        if(secondNumber == 0)   //if else stamtement
        {
            return this.secondNumber = 0;
        }else {
            return firstNumber / secondNumber;
        }
    }

    public static void main(String[] args) {  //main method or pre defined method
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());

    }

}
