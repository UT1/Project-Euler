import java.io.*;
class Problem17
{
private static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public static void main(String[] args)throws IOException
{
  String ans;
 int n;
 int sum=0;
for (n=1;n<=1000;n++)
{
 int th=n/1000;
 int hu=(n%1000)/100;
 int m=n%100;
 String mp="";
 String thp="";
 String hup="";
 String ones[]={"","one","two","three","four","five","six","seven","eight","nine"};
 String le[]={"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
 String tens[]={"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
 if(m/10==0)
 mp=ones[m];
 else if(m/10==1)
 {
     mp=le[m%10];
 }
 else
 {
     mp=tens[m/10]+" "+ones[m%10];
 }
 if(hu!=0)
 hup=ones[hu]+" "+"hundred";
 if(th/10==0)
 thp=ones[th];
 else if(th/10==1)
 {
     thp=le[th%10];
 }
 else
 {
     thp=tens[th/10]+" "+ones[th%10];
 }
 if(th!=0)
 thp=thp+" thousand";

 if(hu!=0 && m!=0)
 ans=thp+" "+hup+" and "+mp;
 else
 ans=thp+" "+hup+" "+mp;
 System.out.println("The answer is:"+ans);
 for (int i=0;i<ans.length();i++)
 {
   if(ans.charAt(i)!=' ')
   sum++;
 }
 }
 System.out.println("Total characters:"+sum);
}
}
