//Program to print all the subsets of a string of length N using bit masking lexographically

#include<iostream>
#include<vector>
#include<string>
#include<math.h>
#include<algorithm>

using namespace std;

bool compareSize(string s1 , string s2){
    if(s1.length()<s2.length()) return true;
    else{
        return false;
    }
}


int main(){
    string s;
    cout<<"Enter the string :";
    cin>>s;
    int n = s.size();
    int powsize = pow(2,n);
    string temp="";
    vector<string>subsets;
    for(int i = 0; i<powsize; i++){
        for(int j =0;j<n;j++){
            if((i & (1<<j))!=0){
                //cout<<i;
               temp+=s.at(j);
            }
        }
        subsets.push_back(temp);
        temp="";
    }
    sort(subsets.begin(),subsets.end(),compareSize);
    for(auto i : subsets){
        cout<<i<<endl;
    }
 }