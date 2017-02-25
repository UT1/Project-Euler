import java.math.BigInteger;//The lattice path problem can be solved by using combination of (m+n n)
class Problem20
{

public static BigInteger fac(BigInteger x)
{
  BigInteger va;
  BigInteger one=new BigInteger("1");
  BigInteger zero=new BigInteger("0");
  if(x.compareTo(zero)==1)
  {
  va=x.multiply(fac(x.subtract(one)));
  return va;
  }
  else
  {
  va=new BigInteger(String.valueOf("1"));
  return va;
  }
}
public static void main(String[] args)
{
  BigInteger n=new BigInteger("100");
  BigInteger n_fac=new BigInteger("0");
  BigInteger rem=new BigInteger("0");
  BigInteger zero=new BigInteger("0");
  BigInteger ten=new BigInteger("10");
  BigInteger sum=new BigInteger("0");
  n_fac=fac(n);

  while((n_fac.compareTo(zero))!=0)
  {
    rem=n_fac.remainder(ten);
    n_fac=n_fac.divide(ten);
    //System.out.println(rem+","+n_fac);
    sum=sum.add(rem);
  }
  System.out.println("The sum of the digits is:"+sum);
}
}
