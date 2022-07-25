package Sorting;
/*
 * Divide and Conquer Algorithm
 * Time Complexity : O(N^2)
 * Considered faster than merge sort because :
  1.In-place(no auxilary array is created. only space required for recursice stack calls)
  2.Cache friendly
  3.Average Time Complexity : O(NlogN)
  4.Tail Recursive, hence compilers like Java and C can internally optimize it 
  by removing recursive call and implement it as a loop. Python does not do this optimization automatically we have to do 
  it manually in Python
 * In merge sort ,merge function was the main function
 * In quick sort, partition function is the main function
 * Quick sort is stable if we use Naive partitioning, but then it will require 3 traversals of the array to sort 1 element
 * Quick sort is unstable if we use Hoare's and Lomuto Partition, but then it will be faster more efficient
 * as it will then require only 1 traversal of the array to sort 1 element
 * Hoar's is the most stable
 */
public class quickSort {
    
}
