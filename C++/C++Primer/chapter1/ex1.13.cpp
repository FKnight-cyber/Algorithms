/*
Exercise 1.13: Rewrite the first two exercises from § 1.4.1 (p. 13) using for loops.
*/

/*
Exercises to be remade.
Exercise 1.9: Write a program that uses a while to sum the numbers from 50 to 100.
Exercise 1.10: In addition to the ++ operator that adds 1 to its operand, there is a
decrement operator (--) that subtracts 1. Use the decrement operator to write a while
that prints the numbers from ten down to zero
*/

#include <iostream>

using namespace std;

int main() {
  int sum{0};

  for(int i = 50; i <= 100; i++) {
    sum += i;
  }

  cout << "Exercise1: \n";
  cout << sum << endl;

  cout << endl;

  cout << "Exercise2: \n";

  for(int j = 10; j >= 0; j--) {
    cout << j << endl;
  }
  
  return 0;
}