
// 8. Display left angle triangle of * using nested for loops
public class LeftAngle_Ans8 {  //Declare class name
    public static void main(String[] args) {  //Pre defined method
        int rows = 5;
        //for loop
        for(int x = 1; x <= rows; x++)
        {
            for(int i = 1; i <= x; i++)

            {
                System.out.print("* ");  //print statement in same line using * symbol
            }
            System.out.println("");
        }


    }
}
