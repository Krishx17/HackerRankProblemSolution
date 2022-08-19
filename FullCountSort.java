package HackerRankProblemSolutions;
import java.util.*;
import java.io.*;
import java.lang.*;

public class FullCountSort {
    public static void main(String[] args){
        String[][] strArray = {{"0", "a"}, {"1", "b"}, {"0", "c"}, {"1", "d"}};
        int tempArray[] = new int[strArray.length];
        int x = 0;
        for(int i = 0; i < strArray.length; i++){
            tempArray[x++] = Integer.parseInt(strArray[i][0]);
        }

        for(int i = 0; i < tempArray.length; i++){
            System.out.print(tempArray[i]+" ");
        }
    }
    
 
}





// static void input(){
//     Scanner in = new Scanner(System.in);
//     int j;
//     int numOfItems = in.nextInt();
//     int inputArray[] = new int[numOfItems];
//     for(int i = 0; i < numOfItems; i++){
//       for(j = 0; j < 2; j++){
//           inputArray[]
//       }
//     }
// }
