#ifndef __DOG_H__
#define __DOG_H__
#include <string>
#include <iostream>
using namespace std;

class Dog {
private:
    string name;
    int age;
public:

//---- WRITE YOUR CLASS FUNCTIONS BELOW THIS LINE----
string get_name() {
    return name;
}

void set_name(string newName) {
    name = newName;
    cout << "Dog's new name is " << name << endl;
 }

int get_age() {
    return age;
}

void set_age(int newAge) {
    age = newAge;
    cout << "Dog's new age is " << age << endl;
}

//---- WRITE YOUR CLASS FUNCTIONS ABOVE THIS LINE----
};
#endif 