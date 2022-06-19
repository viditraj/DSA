//Program to calculate the maximum amount of water which can be trapped within blocks of different heights

#include <iostream>
using namespace std;

int main(){
    cout<<"Enter the no. of blocks :";
    int n;
    cin>>n;
    int ar[n];
    for(int i =0;i<n;i++){
        cout<<"Enter the height of "<<i<<"th block :";
        cin>>ar[i];
    }
    int lmax[n];
    int rmax[n];
    
    
    //Pre-computing the left most highest block for every element 
    lmax[0]=ar[0];
    for(int i =1;i<n;i++){
        lmax[i] = max(ar[i],lmax[i-1]);
    }
    //Pre-computing the right most highest block for every element 
    rmax[n-1] = ar[n-1];
     for(int i =n-2;i>=0;i--){
        rmax[i] = max(ar[i],rmax[i+1]);
    }
    int res =0;
    for(int i =1;i<n-1;i++){
        res = res + (min(lmax[i],rmax[i])-ar[i]);
    }
    cout<<"Maximum water that can be trapped is :"<<res;
}

//Time Complexity : O(N)