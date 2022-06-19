//Program to print the maximum value of circluar subarray 


#include <iostream>

using namespace std;

int maxSum(int ar[] , int n){
    int maxElement = ar[0];
    int res =ar[0];
    for(int i =1;i<n;i++){
        maxElement = max(maxElement+ar[i],ar[i]);
        res = max(res , maxElement);
    }
    return res;
}

int maxSumCircular(int ar[] , int n){
    int sumCircular =0;
    //Use Kaden's to find the max subarray sum
    int maxSumNormal = maxSum(ar,n);
    if(maxSumNormal<0)
    return maxSumNormal;
        int arr_sum=0;
        for(int i=0;i<n;i++){
            arr_sum += ar[i];
            ar[i] = -ar[i];  //Invert the array to call kaden's again to find the minimum subarray sum
        }
        sumCircular = (arr_sum + maxSum(ar,n)); // calculate cirular sum by {(sum of all elements) + (minimum sum of subarrays calculated by inverting elements and calling Kadens)
    return max(sumCircular ,maxSumNormal); // Print the max of Normal and Circular sum

}
int main(){
    cout<<"Enter the no. of elements :";
    int n;
    cin>>n;
    int ar[n];
    for(int i =0;i<n;i++){
        cout<<"Enter the "<<i<<"th element :";
        cin>>ar[i];
    }
    cout<<"Max Sum of circular subarray :"<<maxSumCircular(ar,n);
}

//Time Complexity : O(N)