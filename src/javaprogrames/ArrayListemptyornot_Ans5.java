package javaprogrames;

import java.util.ArrayList;

//5. Write a Java program to test an array list is empty or not. Define array list with underground tube names
public class ArrayListemptyornot_Ans5 {   //class name
    public static void main(String[] args) {  //main method or pre define method
        ArrayList<String> c1 = new ArrayList<String>();
            //tube list
        c1.add("Bakerloo");
        c1.add("Jubliee");
        c1.add("Metropolitan");
        c1.add("District");
        c1.add("Hammersmith & City");
        c1.add("Central");
        c1.add("Piccadilly");
        c1.add("Waterloo & City");
          //will print original array list
        System.out.println("Original array list : " + c1);
        //will check if array list is empty or not
        System.out.println("Checking the above array list is empty or not! " +c1.isEmpty());


    }

}
