/*
Using C++ Strings - Exercise 2
In this exercise you will create a program that will be used in 
a digital library to format and sort journal entries based on the authors 
last name. Each entry has room to store only the last name of the author.

Begin by removing the first name "Isaac" from the string variable journal_entry_1 
by using the string function erase. Do not forget to also remove the whitespace so 
that the string variable journal_entry_1 will then contain the string "Newton" with no whitespaces.

The journal entries should be sorted alphabetically based on the authors last name. 
For example, the last name "Brown" should come before the last name "Davis".

Create an if statement so that if the last name contained within journal_entry_2 is
alphabetically less than the last name contained within journal_entry_1, 
then the string values are swapped using the string function swap.

You may use either of the comparison operators < > in the if statement but remember that 
following ASCII, "A" is lexicographically lower than "B".

You can find my solution by clicking on the solution.txt file on the left pane. 
But please make sure you give it a go yourself first, and only check the solution 
if you really get stuck.
*/

#include <iostream>
#include <string>
using namespace std;

void cpp_strings() {
    
    string journal_entry_1 {"Isaac Newton"};
    string journal_entry_2 {"Leibniz"};
    
    //----DO NOT MODIFY THE CODE ABOVE THIS LINE----
    //----WRITE YOUR CODE BELOW THIS LINE----
    journal_entry_1.erase(0, journal_entry_1.find(" ") + 1);
    
    if(journal_entry_1 > journal_entry_2) {
        journal_entry_1.swap(journal_entry_2);
    }
    
    //----WRITE YOUR CODE ABOVE THIS LINE----
    //----DO NOT MODIFY THE CODE BELOW THIS LINE----
    
    cout << journal_entry_1 << "\n" << journal_entry_2;
}