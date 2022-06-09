/*Computes the number of digits in the factorial of a number
Approch : log(n!) = log(1x2x3x4x5...x n-2 x n-1 x n) = log(1)+log(2)+log(3)+ ... +log(n-1)+log(n) = sum;
no. of digits = floor(sum)+1; */

#include <iostream>
#include <cmath>
using namespace std;

int main(){
    int n;
    cout<<"Enter the number :";
    cin>>n;
    cout<<"No. of digits in factorial of "<<n<<" are :";
    if(n<=1) cout <<"1";
    else{
         double sum =0;
        for(int i =2;i<=n;i++){
            sum+= log10(i);
        }
        int dig = floor(sum)+1;
        cout<<dig;
    }
}   

//Time Complexity : O(n)