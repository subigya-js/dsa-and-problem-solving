#include <iostream>
using namespace std;

int main()
{
    int arr[] = {14, 9, 15, 12, 6, 8, 1};
    int n = 7;

    cout << "The array before sorting: [";
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << ",";
    }
    cout << "]" << endl;

    cout << "The array after sorting: [";

    for (int i = 1; i < n; i++)
    {
        int a = i;
        while (arr[a] < arr[a - 1])
        {
            if (a < 0)
            {
                break;
            }
            swap(arr[a], arr[a - 1]);
            a--;
        }
    }

    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << ",";
    }
    cout << "]";

    return 0;
}