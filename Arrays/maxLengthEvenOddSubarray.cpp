//Program to find the length of max even odd subarray
//https://ide.geeksforgeeks.org/Uz3vWPUUNM

#include <iostream>
#include <vector>
using namespace std;

int  maxEvenOdd(int ar[] ,int n){
    int res=1,curr=1;
    for(int i=1;i<n;i++){
        if((ar[i]%2==0 && ar[i-1]%2!=0)||(ar[i]%2!=0 && ar[i-1]%2==0)){
            curr++;
            res = max(res,curr);
        }   
        else{
            curr =1;
        }
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
    cout<<"Max length of subarray is : " <<maxEvenOdd(ar,n);
}
//Time Complexity : O(N)