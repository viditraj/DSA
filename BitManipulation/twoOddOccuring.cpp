//Program to find two odd occuring elements in the given array of elements.
/**********************Algorithm*****************************
 * 1 XOR all the elements of the array {2,2,2,3,4,2,3,5,5,6}
 * 2 xor = 2^2^2^3^4^2^3^5^5^6 = 4^6
 * Now let n= 4^6 then take ~(n-1)
 * res= n xor ~(n-1) results in a number whoes rightmost bit is set and all other bits are zero
 * now if we xor this number with all the elements it will divide the array into two parts where part 1 will have those elements whoes same bit is set as of res
 * and other group will have those elements of which that bit is not set.
 * Now when we xor all the elements in both group we will get odd occuring number from both groups hence answer
 */

#include <iostream>

using namespace std;

int main(){
    int n;
    cout<<"Enter the number of elements";
    cin>>n;
    int ar[n];
    int x=0,res=0,res2=0;
    for(int i =0;i<n;i++){
        cout<<"Enter the element :";
        cin>>ar[i];
        x=x^ar[i];
    }

    x = x & (~(x-1));
    for(int i =0;i<n;i++){
        if((ar[i] & x)==0){
            res=ar[i] ^ res;
        }
        else {
            res2=ar[i] ^ res2;
        }
    }
    cout<<"Odd elements are "<<res<<" and "<<res2<<endl;

}