//A number is said to be a Palindrome number if it is read same forward and reverse.
//Example : 1221 is palindrome but 1234 is not.

#include <iostream>

using namespace std;

int main(){
    int n,n2;
    cin>>n;
    n2=n;
    int rev=0;
    while(n!=0){
        int dig = n%10;
        rev=rev*10+dig;
        n=n/10;
    }
    if(rev==n2){
        cout<<n2<<" Is a plaindrome number"<<endl;
    }
    else{
        cout<<n2<<" Is not a plaindrome number"<<endl;
    }
}

//Time Complexity : O(log(n))