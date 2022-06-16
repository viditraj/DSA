//Program to print the solution for tower of hanoi problem

#include<iostream>

using namespace std;

void Tower(int n, char s , char h , char d){

    if(n==1){
        cout<<"Transfer disk "<<n<<" from "<<s<<" to "<<d<<endl;
        return;
    }
    Tower(n-1, s, d, h);
    cout<<"Transfer disk "<<n<<" from "<<s<<" to "<<d<<endl;
    Tower(n-1, h , s , d);
}

int main(){
    int n;
    cout<<"Enter the number of disks :";
    cin>>n;

    Tower(n , 'S' , 'H', 'D');
}

//Time Complexity : O(2^N)