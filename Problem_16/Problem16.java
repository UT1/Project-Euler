import java.math.BigInteger;
class Problem16
{
public static void main(String[] args)
{
  int n=1000;
  BigInteger x=new BigInteger("0");
  BigInteger two=new BigInteger("2");
  BigInteger ten=new BigInteger("10");
  BigInteger dig=new BigInteger("0");
  BigInteger zero=new BigInteger("0");
  BigInteger sum=new BigInteger("0");
    x=two.pow(n);

    System.out.println("Result:"+x);
    while(x.compareTo(zero)==1)
    {
      dig=x.remainder(ten);
      x=x.divide(ten);
      sum=sum.add(dig);
    }
  System.out.print("The answer is:"+sum);
}
}
