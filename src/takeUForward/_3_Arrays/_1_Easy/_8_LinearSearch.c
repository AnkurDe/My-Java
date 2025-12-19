#include <stdio.h>

int search(int* arr, int length, int element) {
    for (int i = 0; i < length; i++) {
        if (arr[i] == element)
            return i
    }
    return -1;
}

int main() {
    int arr[] = {1,2,3,4,5};
    int length = 5;
    int ele = 10;
    printf("The element %d is found in position %d", ele, search(arr, length, ele));
    printf("The element %d is found in position %d", ele, search(arr, length, 5));
}