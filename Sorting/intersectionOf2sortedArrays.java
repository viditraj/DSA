package Sorting;
/*
 * Program to print the intersection of 2 sorted Arrays.
 * Time Complexity : O(M+N)
 */
class intersectionOf2sortedArrays{

    public static void intersectionOfArrays(int ar[],int ar2[]){
        int l1 = ar.length,l2 = ar2.length;
        int i=0,j=0;
        while(i<l1 && j<l2){
            if(i>0 && ar[i]==ar[i-1]) continue; // to handle duplicate elements
            
            if(ar[i]<ar[j]) i++;
            else if(ar[i]>ar[j]) j++;
            else{
                System.out.print(ar[i]+" ");
                i++;j++;
            } 

        }
    }

    public static void main(String[] args){
        int ar[] = {3,4,5,8,9,9,10,11,11};
        int ar2[] = {2,3,4,5,6,7,8,9};
        intersectionOfArrays(ar,ar2);
        
    }

}