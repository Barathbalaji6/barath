#include<stdio.h>

int main()
{
    int num,t,rev=0,r;
    printf("Enter Number: ");
    scanf("%d",&num);
    t=num;
    while(num>0)
    {
        r=num%10;
        rev=(rev*10)+r;
        n=num/10;
    }
    if(t==rev)
    printf("Number %d is Palindrome\n",t);
    else
    printf("Number %d is not Palindrome\n",t);
    return 0;
}
