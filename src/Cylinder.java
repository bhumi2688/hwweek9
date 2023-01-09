public class Cylinder extends Circle{    //extend parent class
    private double height;   //declare private variable
    public Cylinder (double radius , double height)   //methgod with argment
    {
        super(radius);
        this.height = height;
    }
    public double getHeight()  //get method to access private variable
    {
        if(height > 0)
        {
            return height;
        }else{
            height = 0;
            return height;
        }
    }
    public double getVolume()   // get method to access private variable
    {
        double area = getArea() * getHeight();
        return area;
    }
}
