//Optimized version of Elucid Algorithm where it calculates the no. of digits in O(1) time complexity

#include <iostream>
#include <cmath>
using namespace std;

int main(){
    int n;
    std::cin>>n;
    int digits = log10(n)+1;
    cout<<digits<<endl;
    return 0;
}