//Program to print the sum of elements between given range 

package Arrays;
import java.util.*;
public class prefixSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements in array :");
        int n  = sc.nextInt();
        int ar[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the element :");
            ar[i]=sc.nextInt();
        }
        int prefix[] = new int[n];
        prefix[0] = ar[0];
        for(int i = 1 ; i<n;i++){
            prefix[i] = prefix[i-1]+ar[i];
        }
        int l ,r;
        System.out.println("Enter the left index");
        l = sc.nextInt();
        System.out.println("Enter the right value");
        r = sc.nextInt();
        if(l==0){
            System.out.println("Prefix Sum : "+ prefix[r]);
        }
        else 
            System.out.println("Prefix Sum : "+ (prefix[r]-prefix[l-1]));
        sc.close();
    }
}

//Time Complexity: O(N)