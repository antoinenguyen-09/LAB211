import java.util.Arrays;

public class InsertionSort {
    public static void insertionsort(int arr[]){
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
  
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        }
    }
    
    public static void main(String[] args){
        int arr_size;
        arr_size= Utility.getPositive("Enter number of array: ");
        int arr[] = new int[arr_size];
        for(int i=0; i<arr.length; i++){
            arr[i] = Utility.getRandomInRange(arr_size, 1);
        }
        System.out.println("Unsorted array: "+Arrays.toString(arr));
        insertionsort(arr);
        System.out.println("Sorted array: "+Arrays.toString(arr));
    }
}
