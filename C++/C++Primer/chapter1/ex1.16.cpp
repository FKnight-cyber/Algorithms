/*
Exercise 1.16: Write your own version of a program that prints the sum of a set of
integers read from cin.
*/

#include <iostream>

using namespace std;

int main() {
  int n1{0};
  int n2{0};
  int n3{0};

  cout << "Inform number 1: ";
  cin >> n1;

  cout << "Inform number 2: ";
  cin >> n2;

  cout << "Inform number 3: ";
  cin >> n3;

  cout << "Sum is: " << n1 + n2 + n3 << endl;

  return 0;
}