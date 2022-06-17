//Program to find the 2nd largest element in the given array
//Approch : first maintain the largest element , whenever we get new largest element then update 2nd largest = largest and largest = new largest element

package Arrays;
import java.util.*;
public class SecondLargest {

    public static int findele(ArrayList<Integer>arr ){
        int res =-1; int largest = arr.get(0);
        for(int i =1;i<arr.size();i++){
            if(arr.get(i)>largest){
                res = largest;
                largest = arr.get(i);
            }
            else if(arr.get(i)!= largest){
                if(res==-1 || arr.get(i)>res ){
                    res = arr.get(i); 
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements in array :");
        int n  = sc.nextInt();
        ArrayList<Integer>ar = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            System.out.println("Enter the element :");
            ar.add(sc.nextInt());
        }
        int ans = findele(ar);
        if(ans==-1)
        System.out.println("2nd Largest Element is not available ");
        else
        System.out.println("2nd Largest Element is : "+ans);
        sc.close();
    }
}


//Time Complexity : O(N)