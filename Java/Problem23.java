import java.io.*;
class Problem23
{
  private static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  public static void main(String[]args)throws IOException
  {
    int count=0;
    int arr[]=new int[6965];//Total Number of abundant numbers before 28123(Calculated Seperately)
    int index=0;
    for(int i=2;i<=28123;i++)
    {
      if(isAbundant(i)==true)
      {
      arr[index]=i;
      index++;
      }
    }
    int x,ad;
    int pSum=0;
    int flag=0;
    for(x=1;x<=28123;x++)
    {
      flag=0;
      for(int i=0;i<6965;i++)
      {
        for(int j=0;j<6965;j++)
        {
          ad=arr[i]+arr[j];
          if(ad==x)
          {
          flag=1;
          //System.out.println(x+"="+arr[i]+"+"+arr[j]);
          }
          if(flag==1)
          break;
        }
        if(flag==1)
        break;
      }
      if(flag==0)
      pSum+=x;
      //System.out.println(x+",");
    }
    System.out.println("Answer:"+pSum);
  }
  public static boolean isAbundant(int n)
  {
    int i,sum=0;
    for(i=1;i<=n/2;i++)
    {
      if(n%i==0)
      sum+=i;
    }
    if(sum>n)
    return true;
    else
    return false;
  }

}
