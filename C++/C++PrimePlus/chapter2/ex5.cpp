/*
Write a program that has main() call a user-defined function that takes a Celsius
temperature value as an argument and then returns the equivalent Fahrenheit value.
The program should request the Celsius value as input from the user and display
the result,as shown in the following code:
Please enter a Celsius value: 20
20 degrees Celsius is 68 degrees Fahrenheit.
*/

#include <iostream>

using namespace std;

double convertToFahrenheit(double celsius) {
  return celsius * 1.8 + 32;
}

int main() {

  double celsius{0.0};

  cout << "Please enter a Celsius value: ";
  cin >> celsius;

  cout << celsius << " degrees Celsius is " << convertToFahrenheit(celsius)  << " degrees Fahrenheit." << endl;

  return 0;
}