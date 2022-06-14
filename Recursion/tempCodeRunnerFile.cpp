//Program to print no. from N to 1 recursively

#include <iostream>

using namespace std;

void printrecursive(int n){
    if(n==0) return;
    else{
        cout<<n<<" ";
        printrecursive(n-1);
    }
}


void main(){
    int n;
    cin>>n;
    cout<<"Ans is"<<endl;
    
}