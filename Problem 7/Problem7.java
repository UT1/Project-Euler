class Problem7
{
  static int isPrime(long k)
  {
    for(int i=2;i<=Math.sqrt(k);i++)
    {
      if(k%i==0)
      return 0;
    }
    return 1;
  }
  public static void main(String[] args)
  {
    int n=10001,count=0;
    long i=-1L;
    while(count!=n)
    {
      i+=2;
      if(isPrime(i)==1)
      count++;


    }
    System.out.println(i);
  }

}
