package Matrices;
/*
 * Print the boundary elements of the matrix
 * Time complexity : O(N)
 */
public class boundaryTravesal {
    public static void main(String args[]){
        int ar[][] = {{3,5,1},{8,0,9},{2,6,7}};
        int n =3;
        for(int i =0;i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("boundary elements are:");
        for(int j =0;j<n;j++){
            System.out.print(ar[0][j]+" ");
        }
       
        for(int i =1;i<n;i++ ){
            System.out.print(ar[i][n-1]+" ");
        }
        
        for(int j=n-2;j>=0;j--){
            System.out.print(ar[n-1][j]+" ");
        }
        
        for(int i=n-2;i>=1;i--){
            System.out.print(ar[i][0]+" ");
        }
        
    }
}
