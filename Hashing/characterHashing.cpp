#include <iostream>
using namespace std;

int main()
{
    string s;
    cout << "Enter the string:";
    cin >> s;

    // pre compute
    int hash[26] = {0};

    for (int i = 0; i < s.size(); i++)
    {
        hash[s[i] - 'a']++;
    }

    int q;
    cout << "Enter the number queries: ";
    cin >> q;

    cout << "Enter query elements:" << endl;

    while (q--)
    {
        char c;
        cin >> c;

        // fetch
        cout << c << " occurs for " << hash[c - 'a'] << " times" << endl;
    }

    return 0;
}