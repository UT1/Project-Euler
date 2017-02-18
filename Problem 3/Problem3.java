class Problem3
{
static int isPrime(long n)
{
  for(long k=3L;k<=Math.sqrt(n);k+=2)
  {
      if(n%k==0)
      return 0;
  }
  return 1;
}
public static void main(String[] args)
{
  long x=600851475143L;
  long i;
  long k;
  for(i=2L;i<=(x/2);i++)
  {
      if(x%i == 0)
      {

        if(isPrime(x/i)==1)
        System.out.println(","+(x/i));
      }
  }

}
}
