#include <stdio.h>
#include <stdlib.h>

/*
int main()
{
    int num[10]={10,20,30,40,50,60,70,80,90,100};
    int *ptr=num;
    int numLength=sizeof(num)/sizeof(int);
    int i, total=0;
    for (i=0; i<numLength; i++)
        total+=ptr[i];
    printf("Total of array is %d\n",total);
    system("PAUSE");
    return 0;
}        
*/

int main()
{
    int Fibonacci[15], i;
    Fibonacci[0]=0;
    Fibonacci[1]=1;
    
    for (i=2; i<15; i++)
        Fibonacci[i]=Fibonacci[i-2]+Fibonacci[i-1];
    for (i=1; i<15; i++)
        printf("Fibonacci[%d] = %d\n",i,Fibonacci[i]);
    system("PAUSE");
    return 0;
}
