#include<bits/stdc++.h>
#include<iostream>
using namespace std;
// Write a function that will find the nth number in the Fibonacci Sequence
 int fib(int n) {
        int prev1=1;
        int prev2=0;
        if( n==0){
            return prev2;
        }
        for( int i=2; i<=n; i++){
            int curri=prev1+prev2;
            prev2=prev1;
            prev1=curri;
        }
        return prev1;
    }
    int main(){
        cout<<fib(20)<<endl;
    }