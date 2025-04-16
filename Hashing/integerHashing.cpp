#include <iostream>
using namespace std;

int main()
{
    int n;
    cout << "Enter the size of array: ";
    cin >> n;

    int arr[n];

    for (int i = 0; i < n; i++)
    {
        cout << "Value for arr[" << i << "]: ";
        cin >> arr[i];
    }

    // precompute
    int hash[13] = {0};
    for (int i = 0; i < n; i++)
    {
        hash[arr[i]]++;
    }

    int q;
    cout << "How many numbers you want to check? ";
    cin >> q;

    while (q--)
    {
        int number;
        cout << "Enter numbers to check: ";
        cin >> number;

        // fetch
        cout << number << " appread for : " << hash[number] << " times." << endl;
    }

    return 0;
}