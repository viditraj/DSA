package Sorting;
import java.util.Arrays;
/*
 * Find the minimum difference between two elements of the given array.
 * Ex: arr={2,1,10,12,15,6,9,17} here min difference =(2-1) =1
 * Sort the array
 * Traverse the array and find the difference ar[i] -ar[i-1]
 * compare the previous minimum with new minimum and change the min accordingly
 * Time complexity : O(NlogN) + O(N) = O(NlogN)
 */
public class minDiffInArray {
    public static void main(String[] args){
        int ar[] = {10,20,50,5,2,1,15,9,8,28};
        Arrays.sort(ar); //O(NlogN) 
        int mindiff =Integer.MAX_VALUE;
        for(int i  =1 ;i<ar.length;i++){ //O(N)
            int diff = ar[i]-ar[i-1];
          mindiff = Math.min(mindiff , diff);
        }
        System.out.println(mindiff);
    }
}
