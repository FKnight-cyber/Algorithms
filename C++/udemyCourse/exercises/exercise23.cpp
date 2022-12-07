/*
Using Default Argument Values - Grocery List
In this exercise you will create a program that will be used to automatically print a grocery list. 
Most weeks the grocery list is the same and so you may begin by declaring the 
function prototype print_grocery_list which has the default argument values:

mangos = 13

apples = 3

oranges = 7

The function print_grocery_list has no return statement and so the return type of the 
function prototype should be void.

IMPORTANT: Before declaring the function prototype, read the entire exercise to determine 
the proper order of arguments in the function parameter list. Remember that default argument 
values that do not change should be placed at the tail end of the parameter list, and those 
which change most often should be placed at the beginning.

Once the function prototype is declared, complete the parameter list of the function definition 
at the bottom of the file.

Now, print this weeks grocery list by calling the function print_grocery_list from the function 
body of modify_grocery_list.

The next week, you decide that you would like 5 apples instead of 3. Print the new grocery list 
by calling the function print_grocery_list from the function body of modify_grocery_list and 
passing the new apples argument.

For the final week,  you are having a party and would like to serve a fruit punch so you will 
need 7 apples, 11 oranges, and the default number of mangos. Print the new grocery list 
by calling the function print_grocery_list from the function body of modify_grocery_list and 
passing the new apples and oranges arguments. 

You can find my solution by clicking on the solution.txt file on the left pane. But please 
make sure you give it a go yourself first, and only check the solution if you really get stuck.
*/

#include <iostream>
using namespace std;

//----DO NOT MODIFY THE CODE ABOVE THIS LINE----
//----WRITE YOUR FUNCTION PROTOTYPE BELOW THIS LINE----

void print_grocery_list(int mangos = 13, int apples = 3, int oranges = 7);

//----WRITE YOUR FUNCTION PROTOTYPE ABOVE THIS LINE----
//----DO NOT MODIFY THE CODE BELOW THIS LINE----

void modify_grocery_list() {
    
    //----DO NOT MODIFY THE CODE ABOVE THIS LINE----
    //----WRITE YOUR FUNCTION CALLS BELOW THIS LINE----
    
    print_grocery_list();
    print_grocery_list(13,5);
    print_grocery_list(13,7,11);
    
    //----WRITE YOUR FUNCTION CALLS ABOVE THIS LINE----
    //----DO NOT MODIFY THE CODE BELOW THIS LINE----
}

void print_grocery_list(int mangos, int apples, int oranges) { //----WRITE THE FUNCTION PARAMETER LIST WITHIN THE PARENTHESES
                                     //----DO NOT MODIFY THE CODE BELOW THIS LINE----
    cout << apples << " apples" << "\n" << oranges << " oranges" << "\n" << mangos << " mangos" << "\n";
}