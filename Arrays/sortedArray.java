//Program to check if the given array is sorted in non decreasing order or not

package Arrays;
import java.util.*;

public class sortedArray {

    public static boolean isSorted(ArrayList<Integer> arr){
        for(int i =0;i<arr.size()-1;i++){
            if(arr.get(i)>arr.get(i+1)) return false;
        }
        return true;
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
        boolean ans = isSorted(ar);
        if(ans) System.out.println("Array is sorted in non decreasing order");
        else
        System.out.println("Array is not sorted");
        sc.close();
    }
}
//Time Complexity : O(N)