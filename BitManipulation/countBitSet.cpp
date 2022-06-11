/* Program to count the number of bits set in the binary representation of a number 
Brian Karningan's Algorithm : Here we do bitwise & of N with (N-1) which will make last bit set to zero and ultimatly when it will make the N =0 we get our answer */

#include <iostream>

using namespace std;

int Karningam(int n){
    int res =0;
    while(n>0){
        n = n&(n-1);
        res++;
    }
    return res;
}//Time Complexity : O(no. of set bits)


//This Approch deals with pre computation of no of set bits in a number <256 ie in a  8 bit number.
//Computes the no of set bits in last 8 bits of a number, then right shifts the number by 8 bits to check next 8bits till we have checked all 8 bits
int OptimizedSolution(int n){
    int table[256];
    table[0]=0;

    for(int i =1;i<=255;i++){
        table[i] = (i&1) + table[i/2];
    }

    int res =0;

  for(int i =1;i<=4;i++){   //32 bits Integer has 4 groups of 8 bits therefore loop runs 4 times for 64 bits loop will run 8 times
        res += table[n & 0xff];
        n=n>>8;
    }
    return res;
 
} // Time Complexity : O(1)

int main(){
    int n;
    cout<<"Enter the number :";
    cin>>n;
    int res = Karningam(n);
    cout<<"No of set bits are (By Karningam's Algorithm) :"<<res<<endl;
    res = OptimizedSolution(n);
     cout<<"No of set bits are (By Constant Time approch) :"<<res<<endl;
}