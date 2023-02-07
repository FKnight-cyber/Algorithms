/*
Write a program that asks the user to enter his or her age.The program then should
display the age in months:
Enter your age: 29
Your age in months is 348.
*/

#include <iostream>

using namespace std;

int main() {
  int age {0};

  cout << "Enter your age: ";
  cin >> age;

  cout << "Your age in months is " << age*12 << "." << endl;

  return 0;
}