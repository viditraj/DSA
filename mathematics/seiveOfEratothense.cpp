/* Seive of Eratothense is the most efficient algorithm to calculate all the prime numbers upto given number N.
It makes use of an array to mark all the prime numbers between 2 and N and then prints them */

#include <iostream>
#include <vector>
using namespace std;

int main(){
    int n;
    cout<<"Enter a number :";
    cin>>n;
    vector<int> primes(n+1,true);
    for(int i =2 ;i*i<=n;i++){
        if(primes[i]){
            for(int j = i*i;j<=n;j+=i){
                primes[j]=false;
            }
        }
    }
    for(int i =2;i<=n;i++){
        if(primes[i]) cout<<i<<" ";
    }
}

//Time Complexity : O(nloglog(n))