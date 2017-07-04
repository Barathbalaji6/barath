#include<stdio.h>
int main()
{
int start,end,i,flag=0,n;
printf("enter the starting and ending interval");
scanf("%d%d",&start,&end);
for(i=start;i<=end;i++)
{
  for(n=2;n<i;n++)
{
if(i%n==0)
{
flag=1;
}
}
if(flag==0)
printf("%d",&i);
}

printf("the above is the prime number series");
return 0;
}
