
// 13. Pool Area
public class Rectangle {  //Declare class name
    private double width;    //Declare private variable
    private double length;   //Declare private variable

    public Rectangle (double width , double length)   //method with parameter
    {
        if((width < 0) && (length < 0))    //if else if
        {
         this.width = 0;
         this.length = 0;
        } else if ((width < 0) && (length > 0))
        {
            this.width = 0;
            this.length = length;
        }else if((width > 0) && (length < 0)){
            this.width = width;
            this.length = 0;
        }else {
            this.width = width;
            this.length = length;
        }
    }
    public double getWidth()   //get method to access private variable
    {
        return width;
    }
    public double getLength()  //get method to access private variable
    {
        return length;
    }
    public double getArea()   //get method to access Area
    {
        return (width * length);
    }
}
