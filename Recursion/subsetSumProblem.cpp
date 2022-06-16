//Print the number of subsets of a set whos' sum of elements = the given sum. Else return 0

#include <iostream>
using namespace std;

int subsetSum(int ar[], int n ,int sum){
    if(n==0){
       return sum==0?1:0;
    }
    return subsetSum(ar , n-1 ,sum) + subsetSum(ar,n-1,sum -ar[n-1]) ;
}


int main(){
    int n;
    cout<<"Enter no of elements in the set :";
    cin>>n;
    int ar[n];
    for(int i =0;i<n;i++){
        cout<<"Enter the element :";
        cin>>ar[i];
    }
    int sum ;
    cout<<"Enter desired sum :";
    cin>>sum;
    int ans = subsetSum(ar , n , sum);
    cout<<"No. of subsets with given sum are :"<<ans<<endl;
}

//Time Complexity : O(2^N)