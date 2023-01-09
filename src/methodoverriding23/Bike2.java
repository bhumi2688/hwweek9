package methodoverriding23;

//creating a child class
 class Bike2 extends Vehicle {
     //defining same method as in Parent class
    public void run()
    {
        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {
        Bike2 obj = new Bike2();   //creating object
        obj.run();  // calling method
    }
}
