#include <bits/stdc++.h>
using namespace std;
int main(){
    int n, r, s = 0, temp;
    cin >> n;
    temp = n;
    while (n != 0){
      r = n % 10;
      s = (s * 10) + r;
      n = n / 10;
    }
    if (temp == s)
      cout << "true" << endl;
    else
      cout << "false" << endl;
}

