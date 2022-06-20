//Program to print the M elements of N-Bonacci numbers . Fibonacci is 2-Bonacci  Tribonacci is 3-Bonacci and so on

//N- Bonnaci =  Mth element = sum of previous N elements . First N-1 elements are always 0


package Arrays;
import java.util.*;
public class NBonacciNumber {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of N :");
        int n = sc.nextInt();
        System.out.println("Enter the value of M :");
        int m = sc.nextInt();

        int ar[] =new int[m];
        Arrays.fill(ar,0);
        ar[n-1] =1;
        ar[n] =1;
        for(int i = n+1;i<m;i++){
            ar[i] = 2*ar[i-1] - ar[i-n-1];
        }
        System.out.println("Nbonacci Numbers are :");
        for( int i : ar){
            System.out.print(i+" ");
        }
        sc.close();
    }

}
//Time Complexity : O(N)