package Matrices;
/*
 * Rotate the given matrix by 90 degree 
 * First transpose the matrix then reverse each column to get the rotated matrix
 * Time Complexity : O(N^2)
 * Space Complexity : O(1)
 */
public class rotateMatrix90degAntiClockwise {

    public static void print(int ar[][]){
        for(int i =0;i<ar.length;i++){
            for(int j =0;j<ar[i].length;j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int ar[][] = {{3,5,1},{8,0,9},{2,6,7}};
        int n =3;
        System.out.println("before transpose:");
        print(ar);
        //Transposing the array;
        for(int i=0;i<n;i++){
            for(int j = i+1;j<n;j++){
                int temp = ar[i][j];
                ar[i][j] = ar[j][i];
                ar[j][i] = temp;
            }
        }
        System.out.println("after transpose :");
        print(ar);
        //Reversing each column
        for(int i=0;i<n;i++){
            int low =0,high =n-1;
            while(low<=high){
                int temp = ar[low][i];
                ar[low][i] = ar[high][i];
                ar[high][i] = temp;
                low++;
                high--;
            }
            System.out.println("step:"+i);
            print(ar);
        }
        System.out.println("90 deg rotated matrix:");
        print(ar);

    }
}
