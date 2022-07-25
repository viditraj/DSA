package Sorting;
/*
 * Given an array of n integers where each value represents the number of chocolates in a packet.
 * Each packet can have a variable number of chocolates. There are m students, 
 * the task is to distribute chocolate packets such that: 
 * Each student gets one packet.
 * The difference between the number of chocolates in the packet with maximum chocolates and 
 * packet with minimum chocolates given to the students is minimum.
 * Sort the array, then calculate diff between first and last elements of every m elements subarray
 * Traverse the array and calculate this minimum
 */
import java.util.Arrays;
public class distributeChocolates {

    public static int distribute(int ar[],int m){
        int n = ar.length;
        if(m>n){
            return -1;
        }
        else {
            int res = Integer.MAX_VALUE;
            Arrays.sort(ar);
            for(int i=0;(i+m-1)<n;i++){
                res = Math.min(res, (ar[i+m-1]-ar[i]));
            }
            return res;
        }
    }
    public static void main(String[] args){
        
        int arr[] = new int[]{1,3,8,4,2,7,5,10};
        int ans = distribute(arr,3);
          System.out.print(ans);
    }
}
