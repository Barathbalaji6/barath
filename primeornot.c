#include <stdio.h>
int main(void) {
	int num;
	int i,flag=0;
	scanf("%d",&num);
	for(i=2;i<=n/2;i++)
	{
		if(num%i==0)
		{
			 flag=1;
			 break;
		}
	}
   	printf("%d is %s",num,(flag==1)?"not a prime":"prime");
		return 0;
}
