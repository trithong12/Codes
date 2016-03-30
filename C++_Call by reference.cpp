#include <cstdlib>
#include <iostream>

using namespace std;

void swap_callByReference(int& a, int& b);
int main(int argc, char *argv[])
{
    cout<<"Call by reference:"<<endl;
    int x=100, y=200;
    cout<<"Before swapping: \n"
    <<"x = "<<x<<" , y = "<<y<<endl;
    swap_callByReference(x,y);
    cout<<"After swapping: \n"
    <<"x = "<<x<<" , y = "<<y<<endl;
    system("PAUSE");
    return EXIT_SUCCESS;
}

void swap_callByReference(int& a, int& b)
{
     int temp;
     temp = a;
     a = b;
     b = temp;
}
