// Problem : In the given set of numbers the count of all numbers is even except one, find the odd appearing number.
//Ecample : {4,2,4,4,4,3,3} Odd appearing : 2

#include <iostream>

using namespace std;

int main(){
    int n;
    cout<<"Enter the count of numbers :";
    cin>>n;
    int ar[n];
    for(int i=0;i<n;i++){
        cout<<"Enter a number";
        cin>>ar[i];
    }
    int ans=0;
    for(int i =0;i<n;i++){
        ans = ans ^ ar[i];
    }
    cout<<"odd one is :"<<ans;
}
//Time Complexity : O(N)