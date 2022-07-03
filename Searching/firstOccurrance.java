/*Program to find the first Occurrance of an element in a sorted array.
Example : [2,4,5,6,6,6,20,21,22,22,30,30,30] first Occurance of 6 is at index = 3
Application of Binary Search */

package Searching;
public class firstOccurrance {
    public int findOcc(int ar[] , int n , int x){
           int low =0,high =n-1,mid;
           mid = (low+high)/2;
           while(low<=high){
               mid = (low+high)/2;
               if(ar[mid]==x){
                   if(mid==0||ar[mid-1]!=ar[mid]){
                       return mid;
                   }
                   else high = mid-1;
               }
               else if(ar[mid]<x){
                   low = mid+1;
               }
               else{
                   high = mid-1;
               }
           }
           return -1;
       }
       public static void main(String[] args){
          int ar[] = {2,5,5,10,10,20,20,20,20,30};
          firstOccurrance obj = new firstOccurrance();
          int index = obj.findOcc(ar,10,20);
          if(index!=-1)
          System.out.println("Element first occurred at index : " +index);
          else
          System.out.println("Not found");
       }
}

//Time Complexity : O(Log(N))