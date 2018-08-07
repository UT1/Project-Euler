public class Problem4
{
static int isPalindrome(long n)
{
  long copy=n;
  long rev=0L;
  while(copy>0)
  {
    rev=rev*10+(copy%10);
    copy/=10;
  }
  if(rev==n)
  return 1;
  else return 0;
}
public static void main(String[] args)
{
  long max=0L,k;
  int i,j;
for(i=100;i<999;i++)
{
  for (j=100;j<999 ;j++)
   {
     k=i*j;
     if(isPalindrome(k)==1)
     {
       if(k>max)
       max=k;
     }
  }
}
System.out.println(max);
}
}
