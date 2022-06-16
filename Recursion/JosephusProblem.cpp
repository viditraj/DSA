/*Josephus Problem : There are N people in a circle and in each round every Kth person is killed. The next round starts with the person having the gun who is standing
next to the person who got killed in the previous round. Find the person who will survive till the last*/

#include<iostream>

using namespace std;

int Josephus(int n, int k){

    if(n==1) return 0;
    return (Josephus(n-1,k)+k) % n;
}

int main(){
    int n,k;
    cout<<"Enter the value of N :";
    cin>>n;
    cout<<"Enter the value of K :";
    cin>>k;
    int ans0 = Josephus(n,k); //If Positions begin from index 0
    int ans1 = ans0+1; //If Positions begin from index 1
    cout<<"Last person to survive if the position starts from 0th index is the "<<ans0<<"th person"<<endl;
    cout<<"Last person to survive if the position starts from 1th index is the "<<ans1<<"th person";
}


//Time Complexity : O(N)