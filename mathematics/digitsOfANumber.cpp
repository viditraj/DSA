
/* Elucid algorithm to count number of digits in a given number */ 

#include<iostream>

using namespace std;
int main(){
    int n;
    std::cin>>n;
    int digits=0;
    while(n!=0){
        digits++;
        n=n/10;
    }
    std::cout<<digits<<endl;
    return 0;

}

/* Time Complexity : O(log(n)) */