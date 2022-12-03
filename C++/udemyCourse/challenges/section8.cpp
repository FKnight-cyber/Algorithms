/*
Write a program that asks the user to enter the following:
An integer representing the number of cents

You may assume that the number of cents entered is greater than or equal to zero

The program should then display how to provide that change to the user.

In the US
    1 dollar is 100 cents
    1 quarter is 25 cents
    1 dime is 10 cents
    1 nickel is 5 cents, and
    1 penny is 1 cent.

Here is a sample run

Enter an amount in cents: 92

You can provide this change as follows
    dollars: 0
    quarters: 3
    dimes: 1
    nickels: 1
    pennies: 2
*/

#include <iostream>

using namespace std;

int main() {
    int cents {0};
    int rest {0};
    cout << "Enter an amount in cents: ";

    cin >> cents;

    if(cents < 0) {
        cout << "Enter an amount equal or greater than zero";
        return 0;
    }
        
    int dollars {0};
    dollars = cents/100;
    rest = cents%100;

    int quarters {0};
    quarters = rest/25;
    rest %= 25;

    int dimes {0};
    dimes = rest/10;
    rest %= 10;

    int nickels {0};
    nickels = rest/5;
    rest %= 5;

    cout << "dollars" << ": " << dollars << endl;
    cout << "quarters" << ": " << quarters << endl;
    cout << "dimes" << ": " << dimes << endl;
    cout << "nickels" << ": " << nickels << endl;
    cout << "pennies" << ": " << rest << endl;

    return 0;
}