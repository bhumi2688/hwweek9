
// 12. Cylinder
public class Circle {   //Declare class name
     private double radius;

     public Circle(double radius)  //instance method with parameter
     {
         this.radius = radius;
     }
     public double getRadius()  //get method to access private variable
     {
         if(radius < 0)   //if else
         {
             radius = 0;
             return radius;
         }else{
             return radius;
         }
     }
     public double getArea()  //get method
     {
         double area = (radius * radius * Math.PI);
         return area;
     }

}
