package Sorting;
/*
 * Given an array count all the number of inversions present in the array
 * Inversions are pair of elements where i<j but ar[i]>ar[j].
 * Implementation of merge sort. 
 * Time complexity : O(NlogN) Space: O(N)
 */
public class countInversion {
    
    public static int findInversions(int ar[],int low,int mid,int high){
        int n1 = mid-low+1;
        int n2 = high-mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for(int i =0;i<n1;i++){
            left[i] = ar[low+i];
        }
        for(int j =0;j<n2;j++){
            right[j] = ar[mid+1+j];
        }
        int i=0,j=0,k=low,res=0;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                ar[k++] = left[i++];
            }
            else{
                ar[k++]= right[j++];
                res= res+(n1-i);
            }
        }
        while(i<n1){
            ar[k++] = left[i++];
        }
        while(j<n2){
            ar[k++] = right[j++]; 
        }
        return res;
    }


    public static int countInversions(int ar[], int low, int high){
        int res =0;
        if(low<high){
            int mid = (low+high)/2;
            res += countInversions(ar, low, mid);
            res += countInversions(ar, mid+1, high);
            res += findInversions(ar,low,mid,high);
        }
        return res;
    }

    public static void main(String[] args){
        
        int arr[] = new int[]{2,4,1,3,5};
        
        int n = arr.length;
        int ans = countInversions(arr,0,n-1);
          System.out.print(ans);
    }
}
