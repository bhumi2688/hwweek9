package javaprogrames;

import java.util.ArrayList;

//10. Write program and add all group members names in to array and iterates through for each loop and print your name.
public class GroupMember_Ans10 {  //declare class name
    public static void main(String[] args) {  //main method or pre defined method
        // Creating array list
        ArrayList<String> groupmember = new ArrayList<>();
        groupmember.add("Bhumi");
        groupmember.add("Dipali");
        groupmember.add("Kludip");
        groupmember.add("Urvi");
        groupmember.add("Sonia");
        System.out.println("Arraylist : " + groupmember);

        //using for each loop
        System.out.println("Iterating over ArrayList using for each loop");
        for(String name : groupmember)
        {
            System.out.println("Bhumi");   //will print statement
            break;

        }
    }

    }


