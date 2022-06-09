/*This Program implements the efficient algorithm to calculate the LCM 
 Tip : for any 2 numbers A and B we know A*B = LCM(A,B) * HCF(A,B)
Therefore, LCM(A,B) = (A*B)/ HCF(A,B) */

#include <iostream>
#include <cmath>

using namespace std;

int gcd(int a,int b){
    if(b==0){
        return a;
    }
    else gcd(b,a%b);
}


int main()
{
    int a,b;
    std::cin>>a>>b;
    int gc = gcd(a,b);
    int lcm = (a*b)/gc;
    std::cout<<lcm<<endl;
    return 0;
}

//Time Complexity : O(log(min(a,b)))