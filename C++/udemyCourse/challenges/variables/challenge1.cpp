#include <iostream>
#include <string>

using namespace std;

int main()
{
    int smallRooms{0};
    int largeRooms{0};
    const int smallRoomsCharge{25};
    const int largeRoomsCharge{35};
    const double tax{0.06};
    const int validDays{30};

    cout << "Welcome to Frank's Carpet cleaning service!" << endl;
    cout << "\nHow many small and large rooms do you want to clean? respectively" << endl;

    cin >> smallRooms;
    cin >> largeRooms;

    int totalCost{smallRooms * smallRoomsCharge + largeRooms * largeRoomsCharge};
    double taxCost{totalCost * tax};

    cout << "\nEstimate for carpet cleaning service" << endl;
    cout << "\nNumber of small rooms: " << smallRooms << endl;
    cout << "\nNumber of large rooms: " << largeRooms << endl;
    cout << "\nPrice per small room: " << smallRoomsCharge << endl;
    cout << "\nPrice per large room: " << largeRoomsCharge << endl;
    cout << "\nCost: $" << totalCost << endl;
    cout << "\nTax: $" << taxCost << endl;
    cout << "\n=====================================" << endl;
    cout << "\nTotal estimate: $" << totalCost + taxCost << endl;
    cout << "\nThis estimate is valid for " << validDays << endl;
}