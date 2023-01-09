
// 9. Point
public class Point {
     private int x;
    private int y;

    public Point()     //constructor method1
    {
        System.out.println("Zero argument constructor");
    }
    public Point(int x , int y)  //constructor method2 with parameters
    {
        //System.out.println(x);
        //System.out.println(y);
        this.x=x;
        this.y=y;
    }

    public int getX() {  //instance method without parameter
        return x;
    }

    public int getY() { //instance method without parameter
        return y;
    }
    public void setX(int x)  //instance method with parameter
    {
        this.x = x;
    }
    public void setY(int y)  //instance method with parameter
    {
        this.y = y;
    }
    public double distance()   //instance method without parameter
    {
         return distance(0,0);
    }
    public double distance(int x , int y)   //instance method with parameter
    {
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y)  * (y - this.y));
    }
    public double distance(Point secondPoint)
    {
        return distance(secondPoint.x , secondPoint.y);
    }

         //main method or pre defined method
         public static void main(String[] args) {
        Point first = new Point(6, 5); Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point(); System.out.println("distance()= " + point.distance());


         }

}
