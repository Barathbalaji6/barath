#include <stdio.h>
#include <stdlib.h>
 
main()
{
   char c;
 
   printf("Do you want to shutdown your computer now (y/n)\n");
   scanf("%c",&c);
 
   if (c == 'y' || c == 'Y')
      system("C:\\WINDOWS\\System32\\shutdown /s");
 
   return 0;
}
