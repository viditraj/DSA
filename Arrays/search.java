package Arrays;
import java.util.*;

public class search{

    public static int findele(int n , int[] arr , int ele){
        for(int i =0; i<n;i++){
            if(arr[i]==ele){
                return i;
            }
        }
        return -1;
    }

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of Array :");
        n = sc.nextInt();
        int ar[] =new int[n];
        for(int i =0;i<n;i++){
            System.out.println("Enter the element");
            ar[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched :");
        int ans = findele(n,ar,sc.nextInt());
        if(ans!=-1)
        System.out.println("Element found at position :"+ans);
        else
        System.out.println("Sorry not found");
        sc.close();
    }
}