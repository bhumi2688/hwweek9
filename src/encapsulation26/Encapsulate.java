package encapsulation26;

public class Encapsulate {

    // private variables declared these can only be accessed by public methos of class
    private String name;
    private int rollNo;
    private int age;

    //get method for name to access private variable name
    public String getName ()
    {
        return name;
    }
    //set method for name to aceess private name
    public void setName(String name)
    {
        this.name = name;
    }
    //get method to roll to access private variable roll no.
    public int getRollNo()
    {
        return rollNo;
    }
    //set method for roll no to access private variable rollno
    public void setRollNo(int rollNo)
    {
        this.rollNo = rollNo;
    }
    //get method for age to access private variable age
    public int getAge()
    {
        return age;
    }
    //set method for age to access private variable age
    public void setAge(int age)
    {
        this.age = age;
    }
}
