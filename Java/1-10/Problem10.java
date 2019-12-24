class Problem10
{
  static int isPrime(int n)
  {
    int i;
    for(i=2;i<=Math.sqrt(n);i++)
    {
      if(n%i==0)
      return 0;
    }
    return 1;
  }
public static void main(String[] args)
 {
long sum=0;
int i;
  for(i=2;i<2000000;i++)
  {
    if(isPrime(i)==1)
    sum=sum+i;
    System.out.println(sum+",");
  }
  System.out.println("Sum of primes below 2,000,000 is:"+sum);
}
}
