class Problem14
{

public static void main(String[] args)
{
  double st=System.currentTimeMillis();
  long i;
  int m;
  int count=0,max=0,maxi=1000000;
  long n[]=new long[1000000];
  int coll_co[]=new int[1000000];
  for (int k=0;k<1000000 ;k++ )
  {
  n[k]=k+1;
  }
  for(m=999999;m>0;m--)
  {
    i=n[m];
    count=0;
    while(i>1)
    {
    //System.out.print(i+"->");
    if(i%2==0)
    {
    i=i/2;
    }
    else
    i=i*3+1;
    count++;
    coll_co[m]++;
    }

    count++;
    coll_co[m]++;

    }
    int k,pos=0;
    for (k=0;k<1000000;k++)
     {
       count=coll_co[k];
       if(count>max)
       {
         max=count;
         pos=k;
       }

    }

    System.out.print("Max counts were "+max+" of "+n[pos]+"\n");
double fi=System.currentTimeMillis();
System.out.println("It took "+ (fi-st)+" ms");
}
}
