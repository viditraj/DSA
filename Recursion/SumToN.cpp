//Print sum of first N natural numbers using recursion.
//If N=3 then sum= 1+2+3

#include <iostream>
using namespace std;

int sumOfN(int n){
    if(n<=0) return 0;
    if(n==1){
        return 1;
    }
    return n + sumOfN(n-1);
}


int main()
{
    int n;
    cin>>n;
    int sum = sumOfN(n);
    cout<<sum;
}

//Time Complexity : O(n)