package Sorting;
/*
 * Quick Sort implementation using Lomuto Partition.
 */
public class quickSortLomuto {
    
    public static int lomutoPart(int ar[] , int low , int high){
        int pivot = ar[high];
        int k = low -1;
        for(int i=low;i<high;i++){
            if(ar[i]<pivot){
                k++;
                int temp = ar[i];
                ar[i]= ar[k];
                ar[k] = temp;
            }
        }
        int temp = ar[k+1];
        ar[k+1] = ar[high];
        ar[high] = temp;
        return k+1;
    }

    public static void quickPartition(int ar[], int low,int high){
        if(low<high){
            int p = lomutoPart(ar,low,high);
            quickPartition(ar,low,p-1);
            quickPartition(ar,p+1,high);
        }
    }
    public static void main(String[] args){
        int ar[] = {10,20,50,5,2,1,15,9,8,};
        quickPartition(ar,0,8);
        for(int i : ar){
          System.out.print(i+" ");
        }
    }
}
