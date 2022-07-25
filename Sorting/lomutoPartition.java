package Sorting;

/*
 * Lomuto Partition is a partition in which the pivot element is always the LAST element
 *  and we have to find the correct position of the pivot element in the sorted array .
 * Time Complexity : O(N)
 * Approach : Traverse the array and when we find a smaller element increase the i and swap it with the index i
 * In the end we will have all the smaller elements than pivot till the ith index hence we can place the pivot at
 * (i+1)th element which will be its correct place.
 * Not Stable
 */

public class lomutoPartition {
    
    public static int lomtPart(int ar[],int l ,int h){

        int pivot = ar[h-1]; 
        int k=l-1;
        for(int i =l;i<h;i++){
            if(ar[i]<pivot){
                k++;
                int temp = ar[i];
                ar[i]= ar[k];
                ar[k]=temp;
            }
        }
        int temp = ar[k+1];
        ar[k+1] =ar[h-1];
        ar[h-1] =temp;
        return k+1;
    }

    public static void main(String[] args){
        
        int arr[] = new int[]{2,4,5,3,1};
        
        int n = arr.length;
        int ans = lomtPart(arr,0,n);
          System.out.print(ans);
    }
}
