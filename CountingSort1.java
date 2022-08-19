package HackerRankProblemSolutions;

import java.util.Scanner;

public class CountingSort1{
    static int size;
    static int count[];
    public static void main(String[] args){
         int intArray[] = input();
         size = intArray.length;
         int maximumNumber = maxElement(intArray);
         int countArr[] = initializer(maximumNumber);
        
        }
    //Method to get the input(Array) from the user 
    static int[] input(){
        Scanner in = new Scanner(System.in);
        int numOfElements = in.nextInt();
        int inputArray[] = new int[numOfElements];
        for(int i = 0; i < numOfElements; i++){
            inputArray[i] = in.nextInt();
        }
        return inputArray;
    }

    //Method to search for the Maximum Element present in the array. 
    static int maxElement(int[] array){
        int max = array[0];
        for(int i = 1; i <= array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    //Method to initalize the count list with zero's 
    static int[] initializer(int max){
        count = new int[max + 1];
        for(int i = 0; i < max ; ++i){
            count[i] = 0;
        }
        return count;
    }

    //Method to store the count of each unique element present in the array 
    static int[] storeCount(int array[], int lengthOfArray){
        for(int i = 0; i < size; i++){
            count[array[i]]++;
        }
        return count;
    }

    //Method to store the cumulative sum of each array element;
    static int[] cumulativeCount(int array[]){
        for(int i = 1; i <= maxElement(array); i++){
            count[i] += count[i-1];
        }
        return count;
    }

    /*
    Method to find the index of each element of the original array
    in count array and place the elements in output array.
    */

    static int[] placeElement(int inputArray[], int outputArray[]){
        for(int i = size - 1; i >= 0; i--){
            outputArray[count[inputArray[i]]-1] = inputArray[i];
            count[inputArray[i]]--;
        }
        return outputArray;
    }

    static int[] copyElements(int inputArray[], int outputArray[]){
        int indexCount = 1;
        for(int i = 0; i < inputArray.length; i++){
            inputArray[i] = outputArray[indexCount];
        }
        return inputArray;
    }
}
