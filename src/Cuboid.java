public class Cuboid extends Rectangle{
    private double height;

    public Cuboid(double width , double length , double height)  //method with parameter
    {
        super(width, length);   //super keyword
        if(height < 0){    //if else
            this.height = 0;
        }else{
            this.height = height;
        }
    }

    public double getHeight()   // get method to access private variable
    {
        return height;
    }
    public double getVolume()  //get method
    {
        return (getArea() * height);
    }

}
