#include<stdio.h>
#include<conio.h>
void main()
{
int a;
printf("Enter the number");
scanf("%d",&a);
if(a>0)
  {
  printf("The number %d is positive",a);
  }
else if(a<0)
  {
  printf("The number %d is negative",a);
  }
else
  {
  printf("The number is zero");
  }
getch();
}
