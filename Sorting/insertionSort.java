package Sorting;
/*
 * Insertion Sort is the in place and stable sorting algorithm. It maintains 2 parts One is sorted and other is unsorted.
 * From the unsorted part it picks one element and places it into correct place in sorted array.
 * Time Complexity : WorstCase = O(N^2) : BestCase = O(N) when the array is already sorted.
 */
public class insertionSort {
    
    public static void sortArray(int arr[]){
        int l = arr.length;
        for(int i =0;i<l;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){ //We dont have arr[j]>=key to make algorithm stable. If we have = then it will become unstable
                arr[j+1]= arr[j]; 
                j--;
            }
            arr[j+1] = key;
        }
        for(int i =0;i<l;i++){
            System.out.print( arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int ar[] = {2,1,4,5,3,7,9,8,13,11};
        sortArray(ar);
        
    }
}
