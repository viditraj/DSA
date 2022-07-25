package Sorting;

/*
 * Find the kth smallest element present in the given array.
 * Naive Solution is to use the inbuilt sort function and then return (k-1)th index element.
 * Time Complexity of Naive solution : O(NlogN)
 * Efficient Solution will be to use to Lomuto partition which will have TC: O(N^2)
 * But on avg it can be O(N)
 */
public class kthSamllest {
    
    public static int partition(int ar[], int l,int h){

        int pivot = ar[h];
        int k =l-1,i=l;
        for( i =l;i<h;i++){
            if(ar[i]<pivot){ 
                k++;
                int temp = ar[k];
                ar[k]=ar[i];
                ar[i]=temp;
            }
        }
        int temp = ar[i];
        ar[i] = ar[k+1];
        ar[k+1] = temp;
        return k+1;
    }

    public static int ksmallest(int ar[],int k){
        int l =0;
        int h = ar.length-1;
        while(l<=h){
            int p = partition(ar, l, h); //find the index of pivot element
            if(p==k-1){    // if index of pivot element is = k-1 then pivot itself is the kth smallest element
                return ar[p];
            }
            else if(p>k-1){ //if index of pivot is greater than kth smallest, that means our kth smallest is present in left part of pivot
                h = p-1;  // to make the function search in left subarray
            }
            else l = p+1; // else search in right subsarray
        }
        return -1;
    }
    public static void main(String[] args){
        
        int arr[] = new int[]{2,7,5,3,1};
        int ans = ksmallest(arr,4);
          System.out.print(ans);
    }
}
