#include<stdio.h>
#include<stdlib.h>
int main()
{
int i;
char n[123];
printf("enter the number ");
gets(n);
i=atoi(n);
printf("the number in after conversion from string to int is %d",i);
return 0;
}
