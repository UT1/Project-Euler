class Problem6
{
  static long SumOfSquares(int n)
  {
    long sum=0L;
    for(int i=1;i<=n;i++)
    {
      sum+=(i*i);
    }
    return sum;
  }
  static long SquareOfSums(int n)
  {
    int sum=0;
    for(int i=1;i<=n;i++)
    {sum+=i;}

    long sq=sum*sum;
    return sq;
  }
public static void main(String[] args)
{
  int n=100;
  long dif=SquareOfSums(n)-SumOfSquares(n);
  System.out.println(dif);
}
}
