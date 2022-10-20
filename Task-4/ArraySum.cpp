#include <bits/stdc++.h>
using namespace std;

int sum(int arr[], int n)
{
  int sum = accumulate(arr, arr+n, 0);
  return sum;
}

int main()
{
	int arr[] = {12, 3, 4, 15};
	int n = sizeof(arr) / sizeof(arr[0]);
	cout << "Sum of given array is " << sum(arr, n);
	return 0;
}

//Prints 34
