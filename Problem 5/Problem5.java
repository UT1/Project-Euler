class Problem5
{
public static void main(String[] args)
{
  int k,i,count=0;
  long n=1L;
  System.out.println("****");
  for (i=1;i<=20 ;i++ )
  {
  n=n*i;
  }
  System.out.println("****"+n);
for(i=2520;i<=n;i++)
{
  count=0;
  for(k=1;k<=20;k++)
  {
    if(i%k==0)
    count++;
  }
  if(count==20)
  {
  System.out.println("Answer"+i);
  i=n;
  }
}
}
}
