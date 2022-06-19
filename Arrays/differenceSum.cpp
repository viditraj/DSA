//Program to print the maximum difference sum element such that ar[j]-ar[i] = maximum and j>i

#include <iostream>
using namespace std;

int main(){
    int n;
    cout<<"Enter the no of elements :";
    cin>>n;
    int ar[n];
    for(int i =0;i<n;i++){
        cout<<"Enter the element :";
        cin>>ar[i];
    }
    int minval = ar[0];
    int sum =(ar[1]-ar[0]);
    for(int i =1;i<n;i++){
        sum = max(sum , ar[i]-minval);
        minval = min(minval,ar[i]);
    }
    cout<<"Max difference sum "<<sum;
}

//Time Complexity : O(N)