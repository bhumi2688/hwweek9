package javaprogrames;

import java.util.HashMap;

//8. Write the program that tell you which line pass through particular stations. Just use Zone 1 stations name.
public class Zone1_Ans8 {  //declare class
    public static void main(String[] args) {  //main method or pre defined method
        //create HashMap object called people
        HashMap<String, String> stationslines = new HashMap<String, String>();

        //Add key(station name) and value(line name)
        stationslines.put("Elephant & Castel", "Bakerloo");
        stationslines.put("Vauxhall" , "Victoria");
        stationslines.put("Edgware Road" , "Bakerloo");
        stationslines.put("Marylebone" , "Bakerloo");
        stationslines.put("Waterloo" , "Bakerloo");
        stationslines.put("Angel" ,"Picadilly");

          //will print station and lines name of Zone1
        System.out.println("Station and Lines in Zone 1: ");
        System.out.println(stationslines);



    }
}