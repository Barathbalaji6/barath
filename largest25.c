#include<stdio.h>
#include<conio.h>
main()
{
	int a[25],n,i,l=-1111;
	printf("\n enter the n number");
	scanf("%d",&n);
for(i=0;i<n;i++)
{scanf("%d",&a[i]);}
for(i=0;i<n;i++)
{
if(a[i]>l)
l=a[i];}
printf("\n the large is %d",l);

getch();
return 0;

}
