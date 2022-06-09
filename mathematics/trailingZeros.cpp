/* Problem : Find the trailing zeros in a factorial of a number
 Solution : Divide the given number by a = 5,25,125... till the a<=number 
 Example : trailing zeros in 124! are = 124/5 + 124/25 ... */

 #include <iostream>
 using namespace std;

 int main(){
     int n;
     cout<<"Enter the number :";
     cin>>n;
     int fact=5;
     int tz =0;
     while(fact<=n){
         tz+= n/fact;
         fact*=5;
     }
     cout<<"No. of trailing zeros in "<<n<<" are :"<<tz;
 }