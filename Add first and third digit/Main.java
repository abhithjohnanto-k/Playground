#include<stdio.h>
int main()
{
  int num, sum;
  scanf("%d",&num);
  sum = (num/100) + (num%10);
  printf("%d",sum);
  //Type your code here
  return 0;
}