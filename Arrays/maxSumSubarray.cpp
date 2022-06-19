//Program to find the maximum sum of all the subarray elements 

#include <iostream>

using namespace std;

int maxSum(int ar[] , int n){
    int maxElement = ar[0];
    int res =ar[0];
    for(int i =0;i<n;i++){
        maxElement = max(maxElement+ar[i],ar[i]);
        res = max(res , maxElement);
    }
    return res;
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
    cout<<"Maximum Sum of subarray : "<<maxSum(ar,n);
}

//Time Complexity : O(N)