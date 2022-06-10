//Program to check if k-th bit of a number is set or not
//Example: to check if 3rd bit (from right) of 5 is set or not : Represent 5 into 32 bit binary and then see if 3rd bit is 1 or not 00.....00101 .
//Here it is 1 therefore set

#include <iostream>

using namespace std;


int main (){
    int n;
    cout<<"Enter the number";
    cin>>n;
    int k;
    cout<<"Enter the value of k ";
    cin>>k;

    if(n&(1<<(k-1))!=0) cout<<"Yes bit is set";
    else cout<<"No not set";
}