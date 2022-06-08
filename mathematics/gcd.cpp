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

int main()
{
    int a,b;
    std::cin>>a>>b;
    cout<<gcd(a,b)<<endl;
    return 0;
}
