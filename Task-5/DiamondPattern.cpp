/* Diamond Pattern 15
        *
      *   *
    *       *
  *           *
*               *
  *           *
    *       *
      *   *
        *
*/
#include <iostream>
using namespace std;

int main()
{
    int n;
    cin>>n;       //Total number of rows in the diamond

    for(int i=1;i<=n/2+1;i++)       //printing the upper half of the diamond
    {
        for(int j=1;j<=(n/2+1-i)*2;j++)
            cout<<' ';
        if(i!=1)
            cout<<'*';
        for(int k=1;k<=(i-1)*4-1;k++)
            cout<<' ';
        cout<<'*'<<endl;
    }

    for(int i=1;i<=n/2;i++)        //printing the lower half of the diamond
    {
        for(int j=1;j<=i*2;j++)
            cout<<' ';
        if(i!=n/2)
            cout<<'*';
        for(int k=1;k<=(n/2-i)*4-1;k++)
            cout<<' ';
        cout<<'*'<<endl;
    }
    
    return 0;
}
