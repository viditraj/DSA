/*Program to find the given element in the sorted and rotated Array
 * Uses Binary Search Approch.
 * In the rotated array it is guranteed that one half of the array will be sorted.
 *  First Determine which half of the array is sorted, then check if the given element lies in that half
 * If yes? then apply Bs in that half otherwise apply BS in other half
 */

package Searching;

public class searchInSortedRotatedArray {
    public static int findElement(int arr[],int n, int x){
        int low =0,high = n-1, mid;
        while(low<=high){
            mid = (low+high)/2;
            if(arr[mid] == x) return mid;
            if(arr[mid]>arr[low]){
                if(arr[low]<=x && x<arr[mid] ){
                    high = mid-1;
                }
                else low = mid+1;
            }
            else{
                if(arr[mid]<x && x <=arr[high]){
                    low = mid+1;
                }
                else high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int ar[] = {10,20,30,40,50,51,52,1,2,5};
        int index = findElement(ar,10,1);
        if(index!=-1)
        System.out.println("Element found at index : " +index);
        else
        System.out.println("Not found");
     }
}

//Time Complexity : O(log(N))