//Program to find the maximum profit which you can get if you buy and sell the shares during N days.

//Approch : When the prices go down, do nothing, whenever you see price is going up add the difference ar[i] -ar[i-1] to profit

#include <iostream>

using namespace std;

int main(){
    cout<<"Enter the no of days :";
    int n;
    cin>>n;
    int ar[n];
    for(int i =0;i<n;i++){
        cout<<"Enter the price of share on "<<i<<"th day :";
        cin>>ar[i];
    }
    int profit =0;

    for(int i=1;i<n;i++){
        if(ar[i]>ar[i-1]){
            profit +=(ar[i]-ar[i-1]);
        }
    }
    cout<<"Max profit is :"<<profit;
}

//Time Complexity : O(N)