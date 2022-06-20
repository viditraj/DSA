//Given a binary array, we need to find the minimum of number of group flips to make all array elements same.  In a group flip, we can flip any set of consecutive 1s or 0s.
//flip not allowed for 1 element
package Arrays;
import java.util.*;

public class flips {


    public void minFlip(int ar[] , int n){
        for(int i =1;i<n;i++){
            if(ar[i]!=ar[i-1]){
                if(ar[i]!=ar[0])
                   System.out.print("Flip from "+i);
                else
                   System.out.println(" to " + (i-1));
            }
        }
        if(ar[n-1]!=ar[0]){
            System.out.println(" to "+ (n-1));
        }
    }
    public static void main(String[] args){
        flips fp = new flips();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the no. of elements :");
       int n = sc.nextInt();
       int ar[] = new int[n];
       for(int i =0;i<n;i++){
        System.out.println("Enter the element (0/1) :");
        ar[i]=sc.nextInt();
       }
       fp.minFlip(ar,n);
       sc.close();
    }
}

//Time Complexity : O(N)