/*Program to find the Square Root of the given integer. If the Square Root is not Integer value then return floor value 
  Example : sqrt(9) = 3 sqrt(17) = 4 (floor value of sqrt of 17)
  Application of Binary Search
*/
package Searching;
import java.util.Scanner;
public class squareRoot {
    public static int SqRt(int n){
        int low = 1,high =n,ans =-1;
        while(low<=high){
            int mid = (low+high)/2;
            int msqr = mid*mid;
            if(msqr == n){
                return mid;
            }
            else if(msqr>n){
                high = mid-1;
            }
            else{
                low= mid+1;
                ans = mid;
            }
        }
        return ans;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        System.out.println("Square Root of n is :"+ SqRt(n));
        sc.close();
    }
}

//Time Complexity : O(log(N))
