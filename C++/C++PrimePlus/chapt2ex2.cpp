/*
Write a C++ program that asks for a distance in furlongs and converts it to yards.
(One furlong is 220 yards.)
*/

#include <iostream>

using namespace std;

int main() {
  int distance{0};

  cout << "Inform the distance in furlongs: ";
  cin >> distance;

  cout << "Distance in yards is: " << (distance * 220) << endl;
  
  return 0;
}