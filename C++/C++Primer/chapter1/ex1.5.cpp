/*
Exercise 1.5: We wrote the output in one large statement. Rewrite the program to use
a separate statement to print each operand.
*/

#include <iostream>

using namespace std;

int main() {

  int n1 = 2;
  int n2 = 8;

  cout << "The sum of " << n1;
  cout << " and " << n2;
  cout << " is " << n1 + n2 << endl;
  
  return 0;
}