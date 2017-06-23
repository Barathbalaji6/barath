#include<stdio.h>
int main()
{
int i,b,pow,tb;
printf("enter the base");
scanf("%d",&b);
tb=b;
printf("enter the power for the base");
scanf("%d",&pow);
if(tb==0)
printf("the power of base zero will be always zero");
else if(pow==0)
{
printf("when power is zero the value is always one");
}
else if(pow==1)
{
printf("when the power is one thn the value is %d",tb);
}
else
{
tb=b;
for(i=2;i<=pow;i++)
{
b=b*tb;
}
printf(" when the power is %d for the base %d then the value is%d",pow,tb,b);
}
return 0;
}
