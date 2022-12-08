/*
Your challenge for section 11 is to modularize your soluction to the Section 9
challenge by refactoring your solution so that it uses functions.

You decide how to modularize the program.
*/

#include <iostream>
#include <string>
#include <vector>

using namespace std;

void printNumbers(const vector<int> data);
void addNumber(vector<int> &data);
void average(const vector<int> data);
void getLowest(const vector<int> data);
void getHighest(const vector<int> data);
int exit();

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
            printNumbers(data);
            continue;
        }

        if(choice == 'A' || choice == 'a') {
            addNumber(data);
            continue;
        }

        if(choice == 'M' || choice == 'm') {
            average(data);
            continue;
        }

        if(choice == 'S' || choice == 's') {
            getLowest(data);
            continue;
        }

         if(choice == 'L' || choice == 'l') {
            getHighest(data);
            continue;
        }

        if(choice == 'Q' || choice == 'q') {
            exit();
            break;
        }

        cout << "Invalid choice!" << endl;
        continue;
    }while(choice != 'Q' || choice != 'q');
}

void printNumbers(const vector<int> data) {
    size_t size {data.size()};
    if(size == 0) {
        cout << "[] - the list is empty" << endl;  
    }else{
        cout << "[ ";
        for(auto element : data) {
            cout << element << " ";
        }
        cout << "]\n";
    }
};

void addNumber(vector<int> &data) {
    int number {};

    cout << "Choose an integer greater or equal 0: ";

    cin >> number;

    data.push_back(number);

    cout << number << " added" << endl;
}

void average(const vector<int> data) {
     if(data.size() == 0) {
        cout << "Unable to calculate the mean - no data" << endl;
    }

    double average {0.0};
    int sum {0};

    for(auto element : data) {
        sum += element;
    }

    average = static_cast<double>(sum)/data.size();

    cout << "The average of the elements is " << average << endl;
}

void getLowest(const vector<int> data) {
     if(data.size() == 0) {
        cout << "Unable to determine the smallest number - list is empty" << endl;
    }

    int lowest {data.at(0)};

    for(auto element : data) {
        if(element < lowest)
            lowest = element;
        }

    cout << "The smallest number is " << lowest << endl;
}

void getHighest(const vector<int> data) {
    if(data.size() == 0) {
        cout << "Unable to determine the largest number - list is empty" << endl;
    }

    int largest {data.at(0)};

    for(auto element : data) {
        if(element > largest)
            largest = element;
    }

    cout << "The largest number is " << largest << endl;
}

int exit() {
    cout << "Goodbye!" << endl;
    return 0;
}