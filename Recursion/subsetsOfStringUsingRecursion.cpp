//Program to print all the subests of a string of length N using Recursion.

#include<iostream>
#include<string>

using namespace std;

void getSubstrings(string &s,string curr,int i){
    if(i==s.size()){
        cout<<curr<<endl;
        return;
    }
    getSubstrings(s,curr,i+1);
    getSubstrings(s,curr+s[i],i+1);
}

int main(){
    string s;
    cout<<"Enter the String :";
    cin>>s;
    getSubstrings(s,"",0);
}