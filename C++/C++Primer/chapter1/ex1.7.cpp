/*
Exercise 1.7: Compile a program that has incorrectly nested comments.
*/

#include <iostream>

using namespace std;

int main() {
  //This should fail

  /*
  // Alright
  /*
  Not allowed!!!!!
  */
  */
  return 0;
}