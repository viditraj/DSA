//Program to reverse the  array without using any extra space

package Arrays;
import java.util.*;
public class reverseArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements in array :");
        int n  = sc.nextInt();
        int ar[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the element :");
            ar[i]= sc.nextInt();
        }
        System.out.println("Array before reversal was :");
        for(int i =0 ;i<n;i++){
            System.out.print(ar[i]+", ");
        }
        System.out.println();
        int low =0,high =n-1;
        while(low<high){
            int temp =ar[low];
            ar[low] = ar[high];
            ar[high] = temp;
            low++;
            high--;
        }
        System.out.println("Array after reversal is :");
        for(int i =0 ;i<n;i++){
            System.out.print(ar[i]+", ");
        }
        sc.close();
    }
}
//Time Complexity : O(N) Space Complexity : O(1)