/*
Write a C++ program that uses three user-defined functions (counting main() as
one) and produces the following output:
Three blind mice
Three blind mice
See how they run
See how they run
*/

#include <iostream>

using namespace std;

string func1() {
  return "Three blind mice";
}

string func2() {
  return "See how they run";
}

int main() {
  cout << func1() << endl;
  cout << func1() << endl;
  cout << func2() << endl;
  cout << func2() << endl;

  return 0;
}