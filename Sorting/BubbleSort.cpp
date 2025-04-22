#include <iostream>
using namespace std;

int main() {
    int arr [] = {13, 46, 24, 52, 20, 9};
    int n = 6;

    cout << "Array before bubble sort:"<<endl;
    cout << "[";
    for(int i = 0; i < n; i++) {
        cout <<  arr[i] << ", ";
    }
    cout << "]";

    cout << "Array after bubble sort:"<< endl;
    cout << "[";

    for(int i = n-1; i > 0; i -- ) {
        for(int j = 0; j < i; j ++) {
            if(arr[j] > arr[j+1]) {
                swap(arr[j], arr[j+1]);
            }
        }
    }

    for(int i = 0; i < n; i++) {
        cout <<  arr[i] << ", ";
    }
    cout << "]";
}