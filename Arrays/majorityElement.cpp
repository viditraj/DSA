//Program to find the element which appears atleast N/2 times in an array of size N . This element is known as majority element

#include <iostream>
#include <unordered_map>
using namespace std;


//Using HashMap Time Complexity : O(Nlog(N))
int majorityElement(int ar[] ,int n){
    unordered_map<int,int>major;
    for(int i =0;i<n;i++){
        major[ar[i]]++;
    }
    for(auto i :major){
        if(i.second>=n/2){
            return i.first;
        }
    }
    return -1;
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
    int ans = majorityElement(ar,n);
    if(ans!=-1)
        cout<<"Majority Element is : "<<ans;
    else
        cout<<"No Majority Element present";
}