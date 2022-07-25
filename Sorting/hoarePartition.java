package Sorting;
/*
 * Hoare's Partition uses First element as the pivot.
 * Not stable.
 * The pivot element may not be at its correct position. But in Lomuto pivot is always fixed at the end of the loop
 * It returns the index of the last element smaller than pivot.
 * Time Complexity: O(N) and Space Complexity : O(1)
 * 3 times faster than Lomuto Partition
 */
public class hoarePartition{
    
    public  int hoarePart(int ar[] , int l , int h){
        int pivot = ar[l];
        int i = l-1,j=h+1;
        while(true){
            do{
                i++;
            }while(ar[i]<pivot);
            do{
                j--;
            }while(ar[j]>pivot);
            if(i>=j) return j;
            int temp = ar[i];
            ar[i]= ar[j];
            ar[j]=temp;
        }
    }
    public static void main(String[] args){
        
        int arr[] = new int[]{1,3,8,4,2,7,5,10};
        hoarePartition hp = new hoarePartition();
        int n = arr.length;
        int ans = hp.hoarePart(arr,0,n-1);
          System.out.print(ans);
    }
    
}