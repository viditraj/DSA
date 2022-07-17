/*Program to find the given element in the infinitely long array 
As we don't know the upper the range to apply binary search directly we first try to find the index of the element which is
next largest  to the given element and then apply BS in this range.
*/

package Searching;

public class searchInInfiniteArray {
    public static int Search(int arr[] , int n){
        if(arr[0]==n) return 0;
        int i = 1;
        while(true){
            if(arr[i]==n) return i;
            if(arr[i]<n) i++;
            else return binarySearch(arr,(i/2+1),i-1,n);
        }
    }

    public static int binarySearch(int arr[] , int low, int high , int n){
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == n) 
               return mid;
            else if(arr[mid]>n) 
               high = mid-1;
            else   
               low = mid+1;
        }
        return -1;
    }

    public static void main(String[] args){
        int ar[] = {2,3,4,5,10,15,16,20,18,20};
        int index = Search(ar,14);
        if(index!=-1)
        System.out.println("Element found at index : "+index);
        else
        System.out.println("Not found");
    }
}
//Time Complexity : O(Log(N))