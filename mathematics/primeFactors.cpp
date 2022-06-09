/* Problem : Print all the prime factors of the given Number */
#include<iostream>

using namespace std;
int main()
{
   int n;
   cout<<"Enter a number :";
   cin>>n;
   if(n==1) cout<<"1";
   while(n%2==0){
       cout<<"2 ";
       n=n/2;
   }
   while(n%3==0){
       cout<<"3 ";
       n=n/3;
   }
   for(int i=5;i*i<=n;i+=6){
       while(n%i==0){
           cout<<i<<" ";
           n=n/i;
       }
       while(n%(i+2)==0){
           cout<<i+2;
           n=n/(i+2);
       }
   }
   if(n>3){
       cout<<n;
   }
}

//Time Complexity : O(sqrt(N)) when n is prime itself