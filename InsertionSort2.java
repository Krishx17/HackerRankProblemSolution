package HackerRankProblemSolutions;
import java.util.*;
public class InsertionSort2{
    public static void main(String args[]){
        int[] arrayInt = returnArray();
        printArray(arrayInt);
        printArray(insertionSort(arrayInt.length, arrayInt));
    }
    static int[] returnArray(){
        int numOfElements;
        Scanner in = new Scanner(System.in);
        numOfElements = in.nextInt();
        int[] intArray = new int[numOfElements];
        for(int i = 0; i < numOfElements; i++){
            intArray[i] = in.nextInt();
        }

        return intArray;
    }

    static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    static int[] insertionSort(int numOfElem , int[] intArray){
        for(int unsortedIndex = 1; unsortedIndex < numOfElem; unsortedIndex++){
            int i , key = intArray[unsortedIndex];
            for(i = unsortedIndex; i > 0 && intArray[i-1] > key; i--){
                intArray[i] = intArray[i-1];
                printArray(intArray);
            }
            intArray[i] = key;
        }
        return intArray;
    }
}