/* Print all the divisors of a given number */

#include <iostream>
using namespace std;

int main(){
    int n;
    cout<<"Enter a number :";
    cin>>n;
    int i =0;
    cout<<"Divisor of "<<n<<" are: ";
    for(i=1;i*i<n;i++){
        if(n%i==0){
            cout<<i<<" ";
        }
    }
    for(;i>=1;i--){
        if(n%i==0){
            cout<<n/i<<" ";
        }
    }
}

//Time Complexity : O(sqrt(n));