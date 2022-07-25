package Matrices;
/*
 * Print the matrix in a spiral fashion
 * Time Complexity : O(N^2)
 */
public class spiralMatrix {

    public static void printSpiral(int ar[][], int row, int col){
        System.out.println("Spiral print:");
        int top =0,left=0,bottom = row-1,right = col-1;
        while(top<=bottom && left<=right){
            //Prints top row
            for(int i = left;i<=right;i++){
                System.out.print(ar[top][i]+" ");
            }
            top++;
            //Prints right row
            for(int i =top;i<=bottom;i++){
                System.out.print(ar[i][right]+" ");
            }
            right--;
            if(top<=bottom){
                //Prints bottom row
                for(int i =right;i>=left;i--){
                    System.out.print(ar[bottom][i]+" ");
                }
                bottom--;
            }
            if(left<=right){
                //Prints left row
                for(int i=bottom;i>=top;i--){
                    System.out.print(ar[i][left]+" ");
                }
                left++;
            }
        }

    }
    public static void main(String args[]){
        int ar[][] = {{3,5,1},{8,0,9},{2,6,7}};
        int n =3;
        System.out.println("before transpose:");
        for(int i =0;i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
        printSpiral(ar,3,3);
    }
}
