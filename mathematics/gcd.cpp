#include <iostream>
#include <cmath>
#include <algorithm>
using namespace std;

int gcd(int a,int b){
    while(a!=b){
        if(a>b){
            a=a-b;
        }
        else b=b-a;
    }
    return a;
}

//Optimized version of GCD calculation. Time Complexity : O(log(n))
int gcdOptimized(int a,int b){
    if(b==0){
        return a;
    }
    else gcdOptimized(b,a%b);
}


int main()
{
    int a,b;
    std::cin>>a>>b;
    int GCD = gcdOptimized(a,b);
    cout<<GCD;
    return 0;
}
