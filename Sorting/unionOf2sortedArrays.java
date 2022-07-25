package Sorting;
/*
 * Program to print union elements of 2 sorted arrays.
 * Time Complexity:O(M+N)
 */
public class unionOf2sortedArrays {
    public static void unionOfArrays(int ar[],int ar2[]){
        int l1 = ar.length,l2 = ar2.length;
        int i=0,j=0;
        while(i<l1 && j<l2){
            if(i>0 && ar[i]==ar[i-1]){
                i++;
                continue; // to handle duplicate elements
            } 
            if(j>0 && ar2[j]==ar2[j-1]){
                j++;
                continue; // to handle duplicate elements
            } 
            
            if(ar[i]<ar2[j]){
                System.out.print(ar[i]+" ");
                i++;
            } 
            else if(ar[i]>ar2[j]){
                System.out.print(ar2[j]+" ");
                j++;
            } 
            else{
                System.out.print(ar[i]+" ");
                i++;j++;
            } 

        }
        //To process remaining elements
        while(i<l1){
            if(i>0 && ar[i]!=ar[i-1])
            System.out.print(ar[i]+" ");
            i++;
        }
        while(j<l2){
            if(j>0 && ar2[j]!=ar[j-1])
            System.out.print(ar[j]+" ");
            j++;
        }
    }

    public static void main(String[] args){
        int ar[] = {3,4,5,8,9,9,10,11,11};
        int ar2[] = {2,3,4,5,6,7,8,9};
        unionOfArrays(ar,ar2);
        
    }
}
