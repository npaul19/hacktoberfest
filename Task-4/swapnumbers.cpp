#include <iostream>
using namespace std;
 
void swap2Numbers(int *x, int *y)
{
    // Insert code here
}

int main()
{
    int a = 10, b = 20;
    cout << "Before Swapping ::: " << endl;
    cout << a << " " << b << endl;
    swap2Numbers(&a, &b);
    cout << "After Swapping ::: " << endl;
    cout << a << " " << b << endl;
    return 0;
}