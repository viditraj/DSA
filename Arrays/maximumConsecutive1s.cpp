//Find the count of maximum consecutive 1s in the given binary array
//Example : {0,1,0,1,1,0,1,1,1,1,0,0,1} ans = 4

#include<iostream>

using namespace std;

int consecutiveOnes(int ar[], int n){
    int curr=0,res =0;
    for(int i =0;i<n;i++){
        if(ar[i]==0){
            curr=0;
        }
        else{
            curr++;
            res = max(res,curr);
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
    cout<<"Maximum consecutive 1s are :"<<consecutiveOnes(ar,n);
}

//Time Complexity : O(N)