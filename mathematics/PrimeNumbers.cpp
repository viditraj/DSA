/* Program to check if the given number is prime or not.*/

#include <iostream>

using namespace std;

int main(){
    int n;
    cout<<"Enter the number :";
    std::cin>>n;
    if(n==2 || n==3){
        cout<<"Prime"<<endl;
    }
    else if (n%2==0 || n%3==0){
        cout<<"Not Prime"<<endl;
    }
    else {
        bool flag=false;
        for(int i =5;i*i<=n;i=i+6){
            if(n%i==0||n%(i+2)==0){
                flag = true;
                break;
            }
        }
        if(flag){
            cout<<"Not Prime"<<endl;
        }
        else cout<<"Prime"<<endl;
    }
}