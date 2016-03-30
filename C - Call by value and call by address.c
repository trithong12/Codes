#include <stdio.h>
#include <stdlib.h>

void swap_callByValue(int,int);
void swap_callByAddress(int*,int*);
int main(int argc, char *argv[])
{
 //Call by value
  printf("Call by value:\n");
  int x=100, y=200;
  printf("Before swapping:\n");
  printf("x = %d , y = %d\n",x,y);
  swap_callByValue(x,y);
  printf("After swapping:\n");
  printf("x = %d , y = %d\n",x,y);
 //Space
  printf("\n");
 //Call by address
  printf("Call by address:\n");
  int m=100, n=200;
  printf("Before swapping:\n");
  printf("m = %d , n = %d\n",m,n);
  swap_callByAddress(&m,&n);
  printf("After swapping:\n");
  printf("m = %d , n = %d\n",m,n);
  
  system("PAUSE");	
  return 0;
}

void swap_callByValue(int a, int b)
{
     int temp;
     temp=a;
     a=b;
     b=temp;
}

void swap_callByAddress(int *a, int *b)
{
     int temp;
     temp=*a;
     *a=*b;
     *b=temp;
}
