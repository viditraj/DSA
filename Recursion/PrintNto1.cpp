//Program to print no. from N to 1 and then 1 to N recursively

#include <iostream>

using namespace std;

void printrecursiveNto1(int n){
    if(n==0) return;
    else{
        cout<<n<<" ";
        printrecursiveNto1(n-1);
    }
}

void printrecursive1toN(int n){
    if(n==0) return;
    else{
        printrecursive1toN(n-1);
           cout<<n<<" ";
    }
}


int main(){
    int n;
    cin>>n;
    cout<<"N to 1"<<endl;
    printrecursiveNto1(n);
    cout<<endl;
    cout<<"1 to N"<<endl;
    printrecursive1toN(n);
}