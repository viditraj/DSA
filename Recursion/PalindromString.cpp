//Program to check if given string is palindrome or not

#include<string>
#include<iostream>

using namespace std;

bool checkPalindrome(string &s , int start , int end){
    if(start>=end) return true;
    return(s[start]==s[end]) && checkPalindrome(s,start+1,end-1);
    
}

int main(){
    string s;
    cin>>s;
    int start = 0;
    int end = s.size();
    if(checkPalindrome(s,start,end-1))
    cout<<"Yes";
    else cout<<"No";
}

//Time Complexity : O(N)