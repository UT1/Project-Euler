/**
 * Project Euler :Problem2
 */
public class Problem2 {

   public static void main(String[] args) {
    int a=1,b=2,c=0;
    int sum=2;
    while(c<4000000)
    {
      c=a+b;
      if(c%2==0)
      sum=sum+c;
  
      a=b;
      b=c;
    }
    System.out.println("Answer:"+sum);
   } 
}