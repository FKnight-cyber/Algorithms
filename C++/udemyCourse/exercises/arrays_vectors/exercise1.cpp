/*
Declare an array of 10  integers named arr  and initialize the array so that all 10 integers are 0 .

Then assign 100  to the first element of the array and 1000  to the last element of the array.

You can find my solution by clicking on the solution.txt file on the left pane. But please make sure you give it a go yourself first,
and only check the solution if you really get stuck.
*/

#include <iostream>
#include <string>

using namespace std;

int main()
{
    int arr[10]{};

    arr[0] = 100;
    arr[9] = 1000;

    cout << arr[0] << endl;
    cout << arr[5] << endl;
    cout << arr[9] << endl;
}