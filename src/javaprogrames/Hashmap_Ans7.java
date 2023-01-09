package javaprogrames;

import java.util.HashMap;

/* 7. Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map
*/
public class Hashmap_Ans7 {   //class name
    public static void main(String[] args) {  //main method or pre defined method
        //create HashMap object called people
        HashMap<String , Integer> people = new HashMap<String , Integer>();

           //Add key and value (String and Integer)
        people.put("Bhumi",32);
        people.put("Urvi" , 31);
        people.put("Sonia" ,30);
        people.put("Diplali" ,29);
        people.put("Kuldip" ,28);

        //for loop
        for(String i : people.keySet())
        {
            System.out.println("key : " + i + " value : " + people.get(i));
        }

    }
}
