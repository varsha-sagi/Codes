
#include <iostream>
#include <bits/stdc++.h>
using namespace std;
void reverseString(string& str)
{
    int len=str.length();
    for(int j=len-1;j>=0;j--)
    {
        cout<<str[j];
    }        
}
int main()
{
    string str;
    cin>>str;
    reverseString(str);
}
