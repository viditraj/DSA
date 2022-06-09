/* Problem Statement : Find the largest size square tile which can be used to cover AxB rectangular area
Solution : GCD of sides is the side of sqaure
Answer : GCD(a,b) */

#include <iostream>

using namespace std;
int gcd(int a,int b){
    if(b==0) return a;
    else gcd(b,b%a);
}

int main(){
    int a,b;
    std::cout<<"Enter the length of rectangle:";
    std::cin>>a;
    std::cout<<"Enter the breath of rectangle:";
    std::cin>>b;
    int ans = gcd(a,b);
    std::cout<<"Size of largest square tile which can fill the whole rectangle of area 12" <<a*b<<" is :" <<ans*ans<<endl;

}