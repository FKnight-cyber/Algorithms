/*
Exercise 2.18: Write code to change the value of a pointer. Write code to change the
value to which the pointer points
*/

#include <iostream>

using namespace std;

int main() {
  int i{10}, *p1 = &i;

  cout << i << " and " << *p1 << endl;

  int i2 {20};
  p1 = &i2;

  cout << i << " and " << *p1 << endl;

  i2 = 30;

  cout << i2 << " and " << *p1 << endl;
}