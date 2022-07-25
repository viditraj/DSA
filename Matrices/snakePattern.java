package Matrices;
/*
 * Print the elements of the matrix in the snake traversal pattern
 * Time Complexity : O(N^2)
 * 
 */
public class snakePattern {
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

        for(int i =0;i<n;i++){
            System.out.println();
            if(i%2==0){
                for(int j =0;j<ar[i].length;j++){
                    System.out.print(ar[i][j] + " ");
                }
            }
            else{
                for(int j =ar[i].length-1;j>=0;j--){
                    System.out.print(ar[i][j] +" ");
                }
            }
        }
    }
}
