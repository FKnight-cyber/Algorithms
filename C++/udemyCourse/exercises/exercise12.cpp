/*
In this exercise you will use nested if  statements to decide if someone can drive.
Let's assume that anyone 16 or older can legally drive, but they must also own a car to drive.

If the person is not 16 or older then you should display, "Sorry, come back in n
years and be sure you own a car when you come back.",
where n is how many years until the person turns 16 year old.

If the person is 16 or older but they do NOT own a car, then your program should display,
"Sorry, you need to buy a car before you can drive!" .

If the person is 16 or older and they DO own a car, then your program should display,
"Yes - you can drive!"

The age  will be provided for you, you do NOT need to declare age .We will also automatically
provide a boolean variable named has_car  which will be true  if the person owns a car or false
otherwise.  Our test cases will provide different values for age  and has_car  to test your code.

Please do NOT provide '\n ' or endl  in your display statements.
*/

#include <iostream>

using namespace std;

bool canDrive(int age, bool hasCar)
{
    if (age >= 16 && hasCar)
    {
        return true;
    }
    if (age >= 16 && !hasCar)
    {
        cout << "Sorry, you need to buy a car before you can drive!" << endl;
        return false;
    }
    if (age < 16)
    {
        cout << "Sorry, come back in " << 16 - age << " years and be sure you own a car when you come back." << endl;
        return false;
    }
    return false;
}

int main()
{
    int age{15};
    bool hasCar{true};

    if (canDrive(age, hasCar))
    {
        cout << "Yes - you can drive!" << endl;
        return 0;
    }
    return 0;
}