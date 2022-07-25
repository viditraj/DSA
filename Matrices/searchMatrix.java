package Matrices;
/*
 * Search an element in a row-wise and column-wise sorted matrix.
 * Example of matrix : 10 20 30 40
 *                     15 25 35 45
 *                     27 29 37 48
 *                     32 33 39 50
 * Here every row is sorted and every column is also sorted
 * Time Complexity : O(R+C)
 * Start from Top right corner
 * if current element is smaller than given element go left
 * otherwise go down
 * We can also start from Bottom left corner
 * We can't start from top left corner because there we can't decide where to go(right or down) if the given element is greater than top
 * left element
 * Similary we can't start from bottom right element because there also we can't decide where to go if given element is smaller than
 * bottom right element
 */
public class searchMatrix {
    
    public static void main (String args[]){
        int ar[][] = {{10, 20, 30, 40},
                      {15, 25, 35, 45},
                      {27, 29, 37, 48},
                      {32, 33, 39, 50}};
        int element = 29;
        int i = 0, j= 3;
        boolean flag = false; 
        while(i<=3 && j>=0){
            if(ar[i][j]== element){
                System.out.println("found at : ("+i+","+j+")");
                flag = true;
                break;
            }
            else if(ar[i][j]>element){
                j--;
            }
            else{
                i++;
            }
        }
        if(flag==false){
            System.out.println("Not found");
        }
    }
}
