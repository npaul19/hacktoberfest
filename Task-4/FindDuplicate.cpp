#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main()
{
  int arr[]={1,3,2,4,2,5,7,8,1,4};
  int l= sizeof(arr)/sizeof(int);
  
  for(int i=0;i<l;i++)
  {
    arr[arr[i]%l]=arr[arr[i]%l]+l;
  }
  cout << "Duplicates: "<<endl;
  for(int i=0;i<l;i++)
  {
    if(arr[i]>=l*2)
      cout << i << endl;
  }
  return 0;
}
