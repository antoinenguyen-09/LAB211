import java.util.Arrays;

public class BinarySearch {
    // Returns index of x if it is present in arr[l.. 
    // r], else return -1 
    int binarySearch(int arr[], int x) 
    { 
        int l = 0, r = arr.length - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
  
            // Check if x is present at mid 
            if (arr[m] == x) 
                return m; 
  
            // If x greater, ignore left half 
            if (arr[m] < x) 
                l = m + 1; 
  
            // If x is smaller, ignore right half 
            else
                r = m - 1; 
        } 
  
        // if we reach here, then element was not present 
        return -1; 
    }  
    
    void sort(int arr[]) //insertion sort
    { 
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
         BinarySearch bs = new BinarySearch();
         int arr_size, searchValue;
         do{
            arr_size= Utility.getInt("Enter number of array: ");
         } while(arr_size<=0);
         int arr[] = new int[arr_size];
         for(int i=0; i<arr.length; i++){
             arr[i] = Utility.getRandomInRange(30, 10);
         }
         bs.sort(arr);
         System.out.println("Sorted array: "+Arrays.toString(arr));
         searchValue = Utility.getInt("Enter search value: ");
         if(bs.binarySearch(arr, searchValue)!=-1)
            System.out.println("Found "+searchValue+" at index: "+bs.binarySearch(arr, searchValue));
         else
            System.out.println("Value not found!!");
    }
}
