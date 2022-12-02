#include <iostream>
#include <string>
using namespace std;

int main()
{

    string name{""};
    int age{0};
    double hourly_wage{23.50};

    cout << "Inform your name: ";
    cin >> name;
    cout << "Inform your age: ";
    cin >> age;

    //----WRITE YOUR CODE ABOVE THIS LINE----
    //----DO NOT MODIFY THE CODE BELOW THIS LINE----

    cout << name << " is " << age << " years old, his payment is " << hourly_wage << "$ per hour";
}