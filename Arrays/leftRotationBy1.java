//Program to left rotate the given array by 1 position

package Arrays;
import java.util.*;
public class leftRotationBy1 {
    public static void rotate(int ar[],int n){
        int temp =ar[0];
        for(int i =1;i<n;i++){
            ar[i-1]=ar[i];
        }
        ar[n-1]= temp;
        for(int i =0;i<n;i++){
            System.out.print(ar[i]+" ");
        }
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
        System.out.println("Array after left rotation : ");
        rotate(ar,n);
        sc.close();
    }
}

//Time Complexity : O(N)