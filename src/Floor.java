
// 10. Carpet Cost Calculator
public class Floor {  //Declare class
    private double width;   //declare private variable
    private double length;  //declare private variable

    public Floor (double width, double length) {   //methhod with parameter
        this.width = width;
        this.length = length;
        if (length < 0) {
            this.length = 0;
        } else if (width < 0) {
            this.width = 0;
        }
    }
    public double getArea()   //get method to access area
    {
        return this.width*length;
    }

          }





