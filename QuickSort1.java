package HackerRankProblemSolutions;
import java.util.*;
public class QuickSort1 {
    public static void main(String[] args){
        // int array[] = {5,7,4,3,8};
        printArray(partition(inputArray()));

    }
    static int[] partition(int[] array){
         int[] lessThanP =new int[array.length] , moreThanP = new int[array.length], equalToP = new int[array.length];
         int pivot = array[0] , count1 = 0, count2 = 0, count3 = 0;
         for(int i = 0; i < array.length; i++){
             if(array[i] > pivot){
                moreThanP[count2++] = array[i];
             }
             else if(array[i] < pivot){
                 lessThanP[count1++] = array[i];
             }
             else{
                 equalToP[count3++] = array[i];
             }
         }
         //merging process 
         int count4 = 0;
         int[] finalArray = new int[array.length];
         for(int i = 0; i < array.length; i++){
             if(count1 > 0){
             finalArray[count4++] = lessThanP[--count1];
             }
             else if(count1 <= 0 && count3 > 0){
                 finalArray[count4++] = equalToP[--count3];
             }
             else{
                 finalArray[count4++] = moreThanP[--count2];
             }
         }
         return finalArray;
    }
    static void printArray(int array[]){
        // System.out.print("Partitioned Array : ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
    
    static int[] inputArray(){
        Scanner in = new Scanner(System.in);
        int inputArray[] = new int[in.nextInt()];
        for(int i = 0; i < inputArray.length; i++){
            inputArray[i] = in.nextInt();
        }
        return inputArray;
    }
}
