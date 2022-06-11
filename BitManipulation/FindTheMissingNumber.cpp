//From the given range of numbers find the missing number.
//Example: (1,2,4,5,6) missing is 3

#include<iostream>

using namespace std;

int main(){
    int n;
    cout<<"Enter count of numbers :";
    cin>>n;
    int ans=0;
     int res=0;
    for(int i=1;i<=n;i++){
        res= res^i;
    }
    for(int i=0;i<n-1;i++){
        cout<<"Enter the element :";
        int temp;
        cin>>temp;
        ans = res ^ ans ^ temp; 
    }
    cout<<ans;
}

// Time Complexity : O(N)