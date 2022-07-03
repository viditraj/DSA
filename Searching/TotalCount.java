/*Program to count the total Occurance of an element in a sorted array.
  Note : This program make use of the firstOccurance and lastOccurance program functions
*/

package Searching;

public class TotalCount {
    public static void main(String[] args){
        firstOccurrance obj1 = new firstOccurrance();
        lastOccurance obj2 = new lastOccurance();
        int ar[] = {2,5,5,10,10,20,20,20,20,30};
        int arr[] = {1,1,1,1,1,1,1,1};
        int first = obj1.findOcc(arr, 8, 1);
        if(first == -1){
            System.out.println("Not Found");
        }
        else{
            int last = obj2.findOcc(ar, 10, 20);
            System.out.println("Element first occurred at index : "+first+ " and last occurred at index : "+last);
        }
    }
}
//Time Complexity : O(Log(N))