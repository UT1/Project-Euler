class Problem9
{
  static int isTriplet(int a,int b,int c)
  {
    int val=a*a+b*b;
    if(val==(c*c))
    return 1;

    return 0;
  }
public static void main(String[] args)
 {
  int i,j,k,sum=0,prod=1;
  for(i=1;i<1000;i++)
  {
    for(j=i;j<1000;j++)
    {
      for(k=j;k<1000;k++)
      {
        sum=i+j+k;
        prod=i*j*k;
        if(sum==1000 && isTriplet(i,j,k)==1)
        System.out.println(prod);

      }
    }
  }
}
}
