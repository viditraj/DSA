//Problem : Cut the rope of length N into maximum pieces where length of every peice is of given length.
//Example : Rope : N=5 a=5 b=4 c=1 therefore we make 5 peices of length 1 to get max count.
//Example 2 : N=9 a=2 b=4 c =5 not possible

#include<iostream>
#include <algorithm>
#include <climits>
using namespace std;

int maxCount(int n, int a, int b, int c){
    if(n<0) return -1;
    if(n==0) return 0;

    int res = std::max(maxCount(n-a,a,b,c),max(maxCount(n-b,a,b,c),maxCount(n-c,a,b,c)));
    if(res == -1) return -1;
    return res+1;
}

int main(){
    int n,a,b,c;
    cin>>n>>a>>b>>c;
    int res = maxCount(n,a,b,c);
    cout<<res;
}

//Time Complexity : O(3^N)