import java.io.*;
import java.math.*;
class Problem25
{
  public static void main(String [] args)
  {
    BigInteger a=new BigInteger("1");
    BigInteger b=new BigInteger("1");
  //  System.out.println(a);
    //System.out.println(b);
    int flag=1;
    int count=2;
    fib(a,b,count,flag);
  }
  static void fib(BigInteger a,BigInteger b,int count,int flag)
  {
    if(flag==1)
    {
    BigInteger x=new BigInteger("0");
    x=a;
    a=a.add(b);
    count++;
//    System.out.println(a);
    int m=(a.toString()).length();
    if(m==1000)
    flag=0;
    fib(a,x,count,flag);

    }
    else
    System.out.println(count);
  }
}
