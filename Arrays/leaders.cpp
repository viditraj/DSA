//Program to find all the leaders in the given array . A Leader is that element which does not have any greater element on its right

#include <iostream>
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
    int lead[n];
    int leader = ar[n-1];
    cout<<"Leaders are :"<<leader<<" ";
    for(int i =n-2;i>=0;i--){
        if(ar[i]>leader){
            leader =ar[i];
            cout<<leader<<" ";
        }
        
    }
}

//Time Complexity : O(N)