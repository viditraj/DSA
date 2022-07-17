//Program to find the element which appears atleast N/2 times in an array of size N . This element is known as majority element

#include <iostream>
#include <unordered_map>
using namespace std;


//Using HashMap Time Complexity : O(Nlog(N))
int majorityElementHM(int ar[] ,int n){
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


//Time Complexity without HM: O(N)
int majorityElement(int ar[] ,int n){
    int candid=ar[0];
    int count=1;
    for(int i =1;i<n;i++){
        if(ar[i]==candid){
            count++;
            candid =ar[i];
        }
        else{
            count--;
        }
        if(count==0){
            count=1;
            candid = ar[i];
        }
    }
    int ans = 0;
    for(int i =0;i<n;i++){
        if(ar[i]==candid){
            ans++;
        }
    }
    if(ans>=n/2){
        return candid;
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
    int ans = majorityElementHM(ar,n); //Using Hashmap O(NlogN) time and O(N) space complexity solution
    int ans2 = majorityElement(ar,n);  //Without using hashmap O(N) and O(1) space complexity solution
    if(ans!=-1)
        cout<<"Majority Element is : "<<ans<<endl;
    else
        cout<<"No Majority Element present"<<endl;
    if(ans2!=-1)
        cout<<"Majority Element is : "<<ans2<<endl;
    else
        cout<<"No Majority Element present"<<endl;
}