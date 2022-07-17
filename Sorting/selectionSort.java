package Sorting;
/*
 * Selection sort is O(N^2) sorting algorithm
 * Does less memory writes as compared to Quick sort,insertion sort,merger sort.But Cycle sort is optimal in
 * terms of memory writes
 * Unstable and in place 
 * Comparison based algorithm
 */
public class selectionSort {
    public static void selectionSorting(int ar[]){
        int l =ar.length;
        for(int i =0;i<l-1;i++){
            int min_ind =i;
            for(int j =i+1;j<l;j++){
                if(ar[j]<ar[min_ind]){
                    min_ind = j;
                }
            }
            int temp = ar[i];
            ar[i]=ar[min_ind];
            ar[min_ind] = temp;
        }
        for(int i =0;i<l;i++){
            System.out.print( ar[i]+" ");
        }
    }
    public static void main(String[] args){
        int ar[] = {2,1,4,5,3,7,9,8,13,11};
        selectionSorting(ar);
        
    }
}
