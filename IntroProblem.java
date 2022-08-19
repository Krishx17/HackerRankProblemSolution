package HackerRankProblemSolutions;
import java.util.Scanner;

public class IntroProblem {
    public static void main(String args[]){
        System.out.println(input());
    }
    static int input(){
        Scanner in = new Scanner(System.in);
        int V = in.nextInt() , numOfElements = in.nextInt();
        int inputArray[] = new int[numOfElements];
        for(int i = 0; i < numOfElements; i++){
            inputArray[i] = in.nextInt();
        }

        //Searching for the Item 
        for(int j = 0; j < numOfElements; j++){
            if(inputArray[j] == V){
                return j;
            }
        }
        return 1;
    }
}
