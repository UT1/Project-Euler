class Problem18
{
public static void main(String[] args)
{
  int arr[][]={
{75,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
{95,64,0,0,0,0,0,0,0,0,0,0,0,0,0},
{17,47,82,0,0,0,0,0,0,0,0,0,0,0,0},
{18,35,87,10,0,0,0,0,0,0,0,0,0,0,0},
{20,04,82,47,65,0,0,0,0,0,0,0,0,0,0},
{19,01,23,75,03,34,0,0,0,0,0,0,0,0,0},
{88,02,77,73,07,63,67,0,0,0,0,0,0,0,0},
{99,65,04,28,06,16,70,92,0,0,0,0,0,0,0},
{41,41,26,56,83,40,80,70,33,0,0,0,0,0,0},
{41,48,72,33,47,32,37,16,94,29,0,0,0,0,0},
{53,71,44,65,25,43,91,52,97,51,14,0,0,0,0},
{70,11,33,28,77,73,17,78,39,68,17,57,0,0,0},
{91,71,52,38,17,14,91,43,58,50,27,29,48,0,0},
{63,66,04,68,89,53,67,30,73,16,69,87,40,31,0},
{4,62,98,27,23,9,70,98,73,93,38,53,60,04,23}};
System.out.println("The working Triangle is:");
for(int i=0;i<arr.length;i++)
{
  for(int j=0;j<=i;j++)
  {
    System.out.print(arr[i][j]+"\t");
  }
  System.out.println();
}
int i=0,j=0,a1,a2;
int sum=0;
for (i=13;i>=0;i--)
{
          for (j=0;j<=i;j++)
          {
              int max=0;

              if (arr[i+1][j]>max)
              {
                  max=arr[i+1][j];
              }
              if (arr[i+1][j+1]>max)
              {
                  max=arr[i+1][j+1];
              }
              arr[i][j]+=max;
          }
      }
      System.out.println("The maximum possible sum is:"+arr[0][0]);
}
}
