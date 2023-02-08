/*
std::cout << "The sum of " << v1 << " and " << v2
<< " is " << v1 + v2 << std::endl;

Exercise 1.4: Our program used the addition operator, +, to add two numbers. Write
a program that uses the multiplication operator, *, to print the product instead.
*/

#include <iostream>

using namespace std;

int main() {
  int n1 = 2;
  int n2 = 7;

  cout << n1 << " times " << n2 << " is " << n1 * n2 << endl;
  return 0;
}