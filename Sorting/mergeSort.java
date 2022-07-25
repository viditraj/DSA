package Sorting;
/*
 * Stable out of place algorithm
 * works in O(Nlog(N)) time complexity and requires O(N) Aux Space 
 * Best for Linked Lists works in O(1) Aux Space
 * Divde and Conquer Algorithm
 */
public class mergeSort {

    public static void merge(int ar[] , int low , int mid , int high){
        int n1 = mid-low+1;
        int n2 = high-mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for(int i =0;i<n1;i++){
            left[i] = ar[i+low];
        }
        for(int j =0;j<n2;j++){
            right[j] = ar[mid+1+j];
        }
        int i=0,j=0,k=low;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                ar[k]=left[i];
                k++;i++;
            }
            else{
                ar[k]=right[j];
                k++;j++;
            }
        }
        while(i<n1){
            ar[k]=left[i];
            i++;
            k++;
        }
        while(j<n2){
            ar[k]=right[j];
            j++;k++;
        }
    }

    public static void mergeSorting(int arr[],int low, int high ){
       if(high>low){
        int mid = low +(high-low)/2;
        mergeSorting(arr, low, mid);
        mergeSorting(arr, mid+1, high);
        merge(arr,low,mid,high);
       }
    }

    public static void main(String[] args){
        int ar[] = {10,20,50,5,2,1,15,9,8,8};
         mergeSorting(ar,0,9);
        for(int i : ar){
          System.out.print(i+" ");
        }
    }

}
