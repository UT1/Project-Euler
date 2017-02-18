#include<stdio.h>
int main()
{
  int a=1,b=2,c=0;
  int sum=2;
  while(c<4000000)
  {
    c=a+b;
    if(c%2==0)
    sum=sum+c;

    a=b;
    b=c;
  }
  printf("%d",sum);
}
