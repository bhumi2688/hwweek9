package javaprogrames;

/*3. Write a Java program to create a new array list, add some colours(string)
and printout the collection using for each loop.*/

import java.util.ArrayList;
import java.util.List;

public class ColorString_Ans3 {
    public static void main(String[] args) {
        //create list and some colors to list
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Voilet");
        list_Strings.add("Indigo");
        list_Strings.add("Blue");
        list_Strings.add("Green");
        list_Strings.add("Yellow");
        list_Strings.add("Orange");
        list_Strings.add("Red");
          //Print the list
        //for loop
        for(String element : list_Strings)
        {
            System.out.println(element);
        }


    }
}
