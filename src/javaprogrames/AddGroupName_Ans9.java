package javaprogrames;

import java.util.ArrayList;

// 9.Write program and add all group names in to array and iterates through for each loop.
public class AddGroupName_Ans9 {  //declare class name

    public static void main(String[] args) {
        // Creating array list
        ArrayList<String> groupnames = new ArrayList<>();
        groupnames.add("Java");
        groupnames.add("Restassure");
        groupnames.add("Selenium");
        groupnames.add("Postman");
        System.out.println("Arraylist : " + groupnames);

        //using for each loop
        System.out.println("Iterating over ArrayList using for each loop");
        for(String groupname : groupnames)
        {
            System.out.print(groupname);
            System.out.print(", ");

        }
    }

}
