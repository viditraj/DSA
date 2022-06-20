//Program to find subarray with given sum (Limited to Positive elements only, this solution doesnot work for array with negative elements)

package Arrays;
import java.util.*;
public class subArrayWithGivenSum {

    public boolean subArraySum(int ar[] , int n,int sum){

        int curr_sum =ar[0];
        int start =0;
        for(int i =1;i<n;i++){
            while(curr_sum > sum && start <i-1){
                curr_sum-=ar[start];
                start++;
            }
            if(curr_sum == sum){
                System.out.println("SubArray with given sum found between "+ start +" and "+(i-1));
                return true;
            }
            if(i<n){
                curr_sum+=ar[i];
            }
        }
        System.out.println("Subarray not found ");
        return false;
    }
    public static void main(String[] args){
        subArrayWithGivenSum obj = new subArrayWithGivenSum();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of elements :");
        int n = sc.nextInt();
        int ar[] = new int[n];
        for(int i =0;i<n;i++){
            System.out.println("Enter the element(Positive Integers only) :");
            ar[i]=sc.nextInt();
       }
       System.out.println("Enter the required sum :");
       int sum = sc.nextInt();
       obj.subArraySum(ar, n, sum);
       sc.close();
    }
}
//Time Complexity: O(N) Space Complexity : O(1)