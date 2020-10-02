import java.util.Arrays;

public class LinearSearch {
    public static int linearSearch(int arr[], int x) 
    { 
       int n = arr.length; 
       for(int i = 0; i < n; i++) 
       { 
          if(arr[i] == x) 
             return i; 
       } 
    return -1; 
    }
    
    public static void main(String[] args){
        int arr_size, searchValue;
        arr_size= Utility.getPositive("Enter number of array: ");
        int arr[] = new int[arr_size];
        for(int i=0; i<arr.length; i++){
            arr[i] = Utility.getRandomInRange(arr_size, 1);
        }
        System.out.println("The array: "+Arrays.toString(arr));
        searchValue = Utility.getPositive("Enter search value: ");
        if(linearSearch(arr, searchValue)!=-1)
            System.out.println("Found "+searchValue+" at index: "+linearSearch(arr, searchValue));
        else 
            System.out.println("Value not found!!");
    }
}
