/*
Exercise 1.11: Write a program that prompts the user for two integers. Print each
number in the range specified by those two integers.
*/

#include <iostream>

using namespace std;

int main() {
  int n1{0};
  int n2{0};

  cout << "Initial number: ";
  cin >> n1;

  cout << "Final number: ";
  cin >> n2;

  while( n1 < n2 && n1+1 < n2) {
    n1++;
    cout << n1 << endl;
  }

  return 0;
}