/**
 * Project Euler :Problem1
 */
class Problem1
{
    public static void main(String[] args) 
    {
        
        int i;
        int sum=0; 
        for(i=1;i<1000;i++)
        {
            if((i%3==0)||(i%5==0))
            sum=sum+i;
        }
        System.out.println("Answer:"+sum);
    }

}