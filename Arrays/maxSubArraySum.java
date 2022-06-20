//Find the max sum of K consecutive elements of the given array
//Sliding window technique

package Arrays;
import java.util.*;
import java.lang.Math;
public class maxSubArraySum {

    public void maxSum(int ar[] ,int n , int k){
        int sum = 0;
        for(int i =0;i<k;i++){
            sum+=ar[i];
        }
        int max_sum = sum;
        for(int i =k;i<n;i++){
            sum+=(ar[i]-ar[i-k]);
            max_sum = Math.max(max_sum , sum);
        }
        System.out.println("Max sum of K consecutive elements is : "+max_sum);
    }
    public static void main(String[] args){
        maxSubArraySum obj = new maxSubArraySum();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of elements :");
        int n = sc.nextInt();
        int ar[] = new int[n];
        for(int i =0;i<n;i++){
            System.out.println("Enter the element :");
            ar[i]=sc.nextInt();
       }
       System.out.println("Enter the value of k :");
       int k = sc.nextInt();
       obj.maxSum(ar,n ,k);
       sc.close();
    }
}

//Time Complexity : O(N)
