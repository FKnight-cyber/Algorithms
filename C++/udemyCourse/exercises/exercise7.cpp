/*
In this exercise you will write a program that uses the assignment operator = 
to change the value of an initialized variable as well as assign the value of one variable to another. 

Begin by declaring and initializing the integer variable num1 to the value of 13 . 

Now declare and initialize the the integer variable num2  to the value 0 .

Use the assignment operator to change the value of num1 to 5 . 

Now use the assignment operator to assign the value of  num1  to  num2.

You can find my solution by clicking on the solution.txt file on the left pane. 
But please make sure you give it a go yourself first, and only check the solution if you really get stuck.
*/

#include <iostream>

using namespace std;

int main() {
    int num1 {13};
    int num2 {0};

    cout << num1 << endl;

    num1 = 5;

    cout << num1 << endl;

    num1 = num2;

    cout << num1 << endl;
}