#include <iostream>
using namespace std;
 
bool checkLeapYear(int year)
{
    return year % 4 == 0 && year % 400 != 0;
}

void outputLeapYear(int year) {
    cout << year << " was ";
    checkLeapYear(year) ? cout << "a Leap Year": cout << "Not a Leap Year";
    cout << "\n";
}

int main()
{
    outputLeapYear(1900);
    // 2000 was not a Leap Year
    
    outputLeapYear(2000);
    // 2000 was a Leap Year
    
    outputLeapYear(2004);
    // 2000 was a Leap Year
                    
    outputLeapYear(2022);
    // 2022 was not a Leap Year
    
    return 0;
}