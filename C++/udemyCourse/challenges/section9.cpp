/*
Your program should display a menu options to the user as follows:

    P - Print numbers
    A - Add a number
    M - Display mean of the numbers
    S - Display the smallest number
    L - Display the largets number
    Q - Quit

    Enter your choice:

The program should accept only valid choices from the user, both upper and lowercase selections
should be allowed. If an illegal choice is made, you should display. "Unknown selection, please try
again" and the menu options should be displayed again.

If the user enters 'P' or 'p', you should all of the elements {ints} in the list.
If the list is empty you should display "[] - the list is empty".
If the list is not empty then all the list elements should be displayed inside square brackets
separated by a space.
For example, [ 1 2 3 4 5 ]

If the user enters 'A' or 'a' then you should prompt the user for an integer to add to the list
which you will add to the list and then display it was added. For example, if the user enters 5
You should display, "5 added".
Duplicate list entries are ok.

If the user enters 'M' or 'm' you should calculate the mean or average of the elements in the list
and display it.
If the list is empty you should display, "Unable to calculate the mean - no data".

If the user enters 'S' or 's' you should display the smallest element in the list.
For example, if the list contains [2 4 5 1], you should display, "The smallest number is 1".
If the list is empty you should display "Unable to determine the smallest number - list is empty".

If the user enters 'L' or 'l' you should display the largest element in the list.
For example, if the list contains [2 4 5 1], you should display, "The largest number is 5".
If the list is empty you should display "Unable to determine the largest number - list is empty".

If the user enters 'Q' or 'q' then you should display "Goodbye" and the program should terminate;
*/

#include <iostream>
#include <vector>

using namespace std;

int main() {

    char choice {};
    vector <int> data{};

    do{
        cout << "\nP - Print numbers" << endl;
        cout << "A - Add a number" << endl;
        cout << "M - Display mean of the numbers" << endl;
        cout << "S - Display the smallest number" << endl;
        cout << "L - Display the largets number" << endl;
        cout << "Q - Quit" << endl;
        cout << "\nEnter your choice: ";

        cin >> choice;

        if(choice == 'P' || choice == 'p') {
            const int size {data.size()};
            if(size == 0) {
                cout << "[] - the list is empty" << endl;
                continue;
            }else{
                cout << "[ ";
                for(auto element : data) {
                    cout << element << " ";
                }
                cout << "]\n";
                continue;
            }
        }

        if(choice == 'A' || choice == 'a') {
            int number {};

            cout << "Choose an integer greater or equal 0: ";
            cin >> number;

            data.push_back(number);
            cout << number << " added" << endl;
            continue;
        }

        if(choice == 'M' || choice == 'm') {
            if(data.size() == 0) {
                cout << "Unable to calculate the mean - no data" << endl;
                continue;
            }

            double average {0.0};
            int sum {0};

            for(auto element : data) {
                sum += element;
            }

            average = static_cast<double>(sum)/data.size();

            cout << "The average of the elements is " << average << endl;
            continue;
        }

        if(choice == 'S' || choice == 's') {
            if(data.size() == 0) {
                cout << "Unable to determine the smallest number - list is empty" << endl;
                continue;
            }

            int lowest {data.at(0)};

            for(auto element : data) {
                if(element < lowest)
                    lowest = element;
            }

            cout << "The smallest number is " << lowest << endl;
            continue;
        }

         if(choice == 'L' || choice == 'l') {
            if(data.size() == 0) {
                cout << "Unable to determine the largest number - list is empty" << endl;
                continue;
            }

            int largest {data.at(0)};

            for(auto element : data) {
                if(element > largest)
                    largest = element;
            }

            cout << "The largest number is " << largest << endl;
            continue;
        }

        if(choice == 'Q' || choice == 'q') {
            cout << "Goobye!" << endl;
            return 0;
        }

        cout << "Invalid choice!" << endl;
        continue;
    }while(choice != 'Q' || choice != 'q');
}