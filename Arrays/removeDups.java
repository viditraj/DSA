//Program to remove the duplicates from the array without using extra space

package Arrays;
import java.util.*;
public class removeDups {
    
    public static void removeDupElements(int ar[]){
        int res =1;
        for(int i =1;i<ar.length;i++){
            if(ar[i]!=ar[res-1]){
                ar[res]=ar[i];
                res++;
            }
        }
        for(int j =0;j<res-1;j++){
            System.out.print(ar[j]+" ,");
        }
        System.out.print(ar[res-1]);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements in array :");
        int n  = sc.nextInt();
        int ar[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the element :");
            ar[i]=sc.nextInt();
        }
        System.out.println("Array after removing duplicates : ");
         removeDupElements(ar);
       
        sc.close();
    }
}


//Time Complexity : O(N)