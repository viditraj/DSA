package Matrices;
 /*
  * Program to transpose the given matrix 
  Time Complexity : O(N^2)
  Space Complexity : O(1)
  In place
  One Traversal
  */
public class transpose {
    
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
            for(int j = i+1;j<n;j++){
                int temp = ar[i][j];
                ar[i][j]=ar[j][i];
                ar[j][i]=temp;
            }
        }
        System.out.println("after transpose:");
        for(int i =0;i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }

    }
}
