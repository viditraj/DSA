package Sorting;
/*
 * Quick sort using Hoare's Partiton function
 * Time Complexity: O(N^2) Avg Case or Best Case : O(NlogN)
 */
public class quickSortHoare {

    hoarePartition part = new hoarePartition();

    
    public void qSort(int ar[], int l,int h){

        if(l<h){
            int p = part.hoarePart(ar,l,h);
            qSort(ar,l,p);
            qSort(ar,p+1,h);

        }
    }

    public static void main(String[] args){
        quickSortHoare qsh = new quickSortHoare();
        int ar[] = {10,20,50,5,2,1,15,9,8,};
        int n = ar.length;
        qsh.qSort(ar,0,n-1);
        for(int i : ar){
          System.out.print(i+" ");
        }
    }
}
