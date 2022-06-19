//Program to left rotate the array by d positions

#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int main(){
    cout<<"Enter the no of elements :";
    int n;
    cin>>n;
    int ar[n];
    for(int i =0;i<n;i++){
        cout<<"Enter the element :";
        cin>>ar[i];
    }
    cout<<"Enter the value of d:";
    int d;
    cin>>d;
    reverse(ar , ar+d-1);
    reverse(ar+d,ar+n);
    reverse(ar,ar+n);

    for(auto i : ar){
        cout<<i<<" ";
    }
}

//Time Complexity O(N)
