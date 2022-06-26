//Program to find the Equilibirum point in the given array.
//Equilibrium point is the point where sum of elements to the left of it = sum of elements to its right
//Example : {4,-2,2} ep = 0 because left of ar[0] sum is zero and right of ar[0] sum is zero

package Arrays;
import java.util.*;
public class equilibriumPoint {

    public int EquiCheck(int ar[] , int n){
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=ar[i];
        }
        int lsum=0;
        for(int i =0;i<n;i++){
            if(lsum == sum-ar[i]) return i;
            else{
                lsum+=ar[i];
                sum-=ar[i];
            }
        }
        return -1;
    }
    public static void main(String[] args){
        equilibriumPoint obj = new equilibriumPoint();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements in array :");
        int n  = sc.nextInt();
        int ar[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the element :");
            ar[i]=sc.nextInt();
        }
        int ans = obj.EquiCheck(ar, n);
        if(ans ==-1) System.out.println("No equilibrium point");
        else System.out.println(" Equilibrium point found at : "+ ans);
        sc.close();
    }
}

//Time Complexity : O(N)