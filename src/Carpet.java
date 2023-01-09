public class Carpet {   //declare class
    private double cost;

    public Carpet(double cost)   //instance method with parameter
    {
        this.cost = cost;
    }
    public double getCost() //get method to access private variable
    {
        if(cost < 0)  {
            cost = 0;
        }
        return this.cost;

    }
}
