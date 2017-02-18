class Problem12
{
  public static int prime[]=new int[1500];
  public static int fac_co[]=new int [1500];

static int factors(long n)
{
  int val=1;
  for(int i=0;i<1500;i++)
  {
    fac_co[i]=0;

  }

  for(int i=0;prime[i]<=n;i++)
  {
    while(n%prime[i]==0)
    {

      fac_co[i]++;
      n=n/prime[i];

    }

  }

  for(int i=0;i<1500;i++)
  {
    if(fac_co[i]!=0)
    {
    val=(fac_co[i]+1)*val;

  }
  }

  return val;
}
  public static void main(String[] args)
  {
    prime[0]=2;
    prime[1]=3;
    int i=2,c=0,k,j;
    for(j=5;i<1500;j++)
    {
      c=0;
      for(k=2;k<=Math.sqrt(j);k++)
      {
        if(j%k==0)
        {c=1;break;}
      }
      if(c==0)
      {
        prime[i]=j;
        i++;
      }

    }
int fac=0;
long x=7L;
long n=0L;
    int top,flag=0,count;
   while(flag!=1)
    {
      n=(x*(x+1))/2;
      fac=factors(n);
      x++;
      if(fac>500)
      flag=1;

    }

System.out.println("Answer is "+n+" with "+fac+" factors.");
  }
}
