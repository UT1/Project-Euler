class Problem19
{
public static void main(String[] args)
{

  int sun=0;
int months[]={31,28,31,30,31,30,31,31,30,31,30,31};
String days[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

int point=0;
int years=2001;
int y=1901;
while(y<years)
{
  if(y%4==0 && y%400==0)
  {
    months[1]=29;
  }
  else
  months[1]=28;

  for(int i=0;i<12;i++)
  {
    for(int j=0;j<months[i];j++)
    {
      if((j+1)==1 && days[point].equals("Sunday") )
      sun++;

      point++;
      if(point==7)
      point=0;
    }

  }
  y++;
}
System.out.println("Answer is:"+sun);

}
}
