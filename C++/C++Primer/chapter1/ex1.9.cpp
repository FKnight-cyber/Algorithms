// Exercise 1.9: Write a program that uses a while to sum the numbers from 50 to 100.

#include <iostream>

using namespace std;

int main() {
  int i{50};
  int sum{0};

  while ( i <= 100) {
    sum += i;
    i++;
  }

  cout << sum << endl;

  return 0;
}