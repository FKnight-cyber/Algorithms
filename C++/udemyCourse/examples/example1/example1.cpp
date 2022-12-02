#include <iostream>

using namespace std;

int main()
{
    int room_width{0};
    int room_length{0};

    cout << "Inform the room width: ";
    cin >> room_width;

    cout << "Inform the room length: ";
    cin >> room_length;

    cout << "The room area is " << room_width * room_length << endl;

    return 0;
}