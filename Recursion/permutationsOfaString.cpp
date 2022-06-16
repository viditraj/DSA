//Print all the permutations of a string.
//Example : "ABC" then print "ABC","BAC","CAB","ACB"...etc

#include <iostream>
#include <string>

using namespace std;
void permutations(string &s , int i){
    if(i==s.size()-1){
        cout<<s<<endl;
        return;
    }
    for(int j =i;j<s.size();j++){
         swap(s[j],s[i]);
         permutations(s , i+1);
         swap(s[j],s[i]);
    }
   
}

int main(){
    string s;
    cout<<"Enter the string :";
    cin>>s;
    cout<<"Permutations are :"<<endl;
    permutations(s,0);
    cout<<"final :"<<s;
}
