#include <iostream>
using namespace std;
 
bool checkLeapYear(int year)
{
    return false;
}

int main()
{
    checkLeapYear(2000) ? cout << "Leap Year": cout << "Not a Leap Year";
    // 2000 was a Leap Year
                    
    checkLeapYear(2022) ? cout << "Leap Year": cout << "Not a Leap Year";
    // 2020 was not a Leap Year
    
    return 0;
}