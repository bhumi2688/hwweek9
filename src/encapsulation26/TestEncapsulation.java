package encapsulation26;

public class TestEncapsulation {
       //pre deifned or main method
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();  //created object

           //setting values of variables
        obj.setName("Bhavesh");
        obj.setAge(19);
        obj.setRollNo(51);

        //Displaying values of variables
        System.out.println("CodeBuster name: " + obj.getName());
        System.out.println("CodeBuster age:" + obj.getAge());
        System.out.println("CodeBuster rollNo: " + obj.getRollNo());




    }
}
