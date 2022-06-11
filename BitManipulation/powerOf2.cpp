//Program to check if a number is in the power of 2 or not
//Example :2,4,8,16,32,64...etc are in power of 2
//Hint : Power of 2 number has only 1 bit set and if N is the power of 2 then N-1 has N-1 bits set
//Approach : Bitwise of N with N-1 will result in 0 if N is in the power of 2 


#include <iostream>

using namespace std;

int main(){

    int n;
    cout<<"Enter the Number :";
    cin>>n;
    if(n==0) cout<<"No";
    else if((n & (n-1)) ==0)
    cout<<"Yes "<<n<<" is in the power of 2";
    else cout<<"No ";
}

//Time Complexity : O(1)