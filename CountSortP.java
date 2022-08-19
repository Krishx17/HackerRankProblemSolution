public class CountSortP {
    public static void main(String[] args){
        CountingSort cs = new CountingSort();
        int array[] = {9, 8,7,5,4,2,1,9,9,9};
        int sizeOfArray = array.length;
        cs.countSort(array, sizeOfArray);
    }
}

class CountingSort{
    void countSort(int array[], int sizeOfArray){
        int[] output = new int[sizeOfArray+1];
        //block of code to find the maximum element in array input by the user.
        int max = array[0];
        for(int i = 1; i < sizeOfArray; i++){
            if(max < array[i]){
                max = array[i];
            }
        }

        //block of code initializing count array with zeros
        int count[] = new int[max+1]; //we take size of count array one more than maximum element found in the array input by the user.
        //initializing the count array with zeros
        for(int j = 0; j < max + 1; j++){
            count[j] = 0;
        }

        //block of code to find the count of each unique element present in array input by the user.
        for(int k = 0; k < sizeOfArray; k++){
            count[array[k]]++;
        }

        // for(int i = 0; i < max+1; i++){
        //     System.out.print(count[i]+" ");
        // }
        //block of code to find the cumulative sum of elements in the count array.
        for(int l = 1; l <= max; l++){
            count[l] += count[l-1];
        }

        // for(int i = 0; i < max+1; i++){
        //     System.out.print(count[i]+" ");
        // }

        for(int m = sizeOfArray-1; m >= 0; m--){
            output[count[array[m]]-1] = array[m];
            count[array[m]]--;
        }
        for(int i = 0; i < sizeOfArray; i++){
            System.out.print(output[i]+" ");
        }

    }
}