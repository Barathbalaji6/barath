#include<stdio.h>
int main()
{
int rem,num,t,arm=0;
printf("enter the number");
scanf("%d",&num);
t=num;
while(num!=0)
{
rem=num%10;
rem=rem*rem*rem;
num=num/10;
arm=arm+rem;
}
if(t==arm)
printf("\n%d is a armstrong number",t);
else
printf("\n%d is not a armstrong number",t);
return 0;
}
