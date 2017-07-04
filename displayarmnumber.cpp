
#include <iostream>
using namespace std;

int main()
{
    int first,last,i;
    int t,sum,cube,ld;
    cin>>first>>last;
    for(i=first+1;i<last;i++){
        sum = 0;
        cube = 0;
        t=i;
        while(t!=0){
            ld=t%10;
            cube=ld*ld*ld;
            sum=sum+cube;
            t/=10;
        }
        if(sum == i)
            cout<<i;
    }
    return 0;
}
