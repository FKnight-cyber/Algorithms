/*
Write a program that asks the user to enter an hour value and a minute value.The
main() function should then pass these two values to a type void function that displays the two values in the format shown in the following sample run:
Enter the number of hours: 9
Enter the number of minutes: 28
Time: 9:28
*/

#include <iostream>
#include <string>

using namespace std;

string formatTime(int hour, int minutes) {
  string str1 = to_string(hour);
  string str2 = to_string(minutes);
  return "Time: " + str1 + ":" + str2 + "\n";
}

int main() {
  int hour{0};
  int minutes{0};

  cout << "Enter the number of hours: ";
  cin >> hour;

  cout << "Enter the number of minutes: ";
  cin >> minutes;

  cout << formatTime(hour, minutes);

  return 0;
}