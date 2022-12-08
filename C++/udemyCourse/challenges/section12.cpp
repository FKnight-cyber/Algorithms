/*
Write a C++ function named apply_all that expects two arrays of integers and their sizes and
dynamically allocates a new array of integers whose size is the product of the 2 array sizes;

The function should loop through the second array and multiple each element across 
each element of array 1 and store the product in the newly created array

The function shoudl return a pointer to the newly allocated array

You can also write a print function that expects a pointer to an array of integers
and its size and display the elements in the array.
*/

#include <iostream>
using namespace std;

int *apply_all(int [], int [], int, int);
void print(const int *const arr, size_t size);

int main() {
    const size_t sizeOfArr1 {3};
    const size_t sizeOfArr2 {2};

    int arr1[] {1,2,3};
    int arr2[] {4,5};

    print(arr1, sizeOfArr1);
    print(arr2, sizeOfArr2);

    int *result = apply_all(arr1, arr2, sizeOfArr1, sizeOfArr2);
    constexpr size_t results_size {sizeOfArr1 * sizeOfArr2};

    print(result, results_size);

    delete [] result;
    return 0;
}

int *apply_all(int arr1 [], int arr2 [], int sizeOfArr1, int sizeOfArr2) {
    int *newArr {};

    newArr = new int[sizeOfArr1 * sizeOfArr2];

    int position {0};

    for(size_t i {0}; i < sizeOfArr2; i++) {
        for(size_t j {0}; j < sizeOfArr1; j++) {
            newArr[position] = arr1[j] * arr2[i];
            position++;
        }
    }
    return newArr;
}

void print(const int *const arr, size_t size) {
    cout << "[ ";
    for(size_t i{0}; i < size; i++) {
        cout << arr[i] << " ";
    }
    cout << " ]" << endl;
}