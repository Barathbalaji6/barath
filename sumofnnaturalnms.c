#include<stdio.h>
int main()
{
int i=1,s=0,n;
printf("the natural no count till howmany consecutive numbers");
scanf("%d",&n);
for(i=1;i<=n;i++)
{
s=s+i;
}
printf("the sum of natural numbers is %d",s);
return 0;
}
