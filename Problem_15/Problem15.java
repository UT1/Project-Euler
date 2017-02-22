import java.math.BigInteger;//The lattice path problem can be solved by using combination of (m+n n)
class Problem15
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
  BigInteger m=new BigInteger("20");
  BigInteger n=new BigInteger("20");
  BigInteger x=new BigInteger("0");
  BigInteger y=new BigInteger("0");
  BigInteger z=new BigInteger("0");
  x=fac(m.add(n));
  y=fac(m).multiply(fac(n));
  z=x.divide(y);
  System.out.println("The answer is:"+z);
}
}
