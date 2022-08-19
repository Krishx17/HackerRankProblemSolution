package HackerRankProblemSolutions;

public class InsertionRecursiveApproachSoln{
    public static void main(String args[]){
        int intArray[] = {3,2,1};
        insertionSort(intArray, intArray.length);

        for(int j = 0; j < intArray.length; j++){
            System.out.print(intArray[j]+" ");
        }

    }
    public static void insertionSort(int[] input, int numItems){
        if(numItems < 2){
            return;
        }
        insertionSort(input , numItems - 1);
        
        int key = input[numItems - 1];
        
        int i;

        for(i = numItems - 1; i > 0 && input[i - 1] > key; i--){
            input[i] = input[i - 1];
        }
        input[i] = key;
        
    }
    
}
















































//     public static void main(String args[]){
//         int intArray[] = {9,4,5,3,32,1};
//         for(int unsortedIndex = 1; unsortedIndex < intArray.length ; unsortedIndex++){
//             int key = intArray[unsortedIndex];
//             int i = unsortedIndex;
//             position(intArray, i, key);
//             intArray[i] = key;
//             System.out.print("Sorted Array");
//             for(int j = 0; j < intArray.length; j++){
//                 System.out.print(intArray[j]+" ");
//             }
//         }

//     }
//     static int position(int[] array , int i ,int key){
//         if(array[i-1] < key){
//             return i;
//         }
//         else{
//             return position(array, i-1, key);
//         }
//     }
    
// }
