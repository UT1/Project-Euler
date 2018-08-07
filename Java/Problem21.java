import java.util.ArrayList;
import java.util.Iterator;

public class Problem21
{
	private static int x;
	private static int yt;

	private static int sumList(ArrayList<Integer> list)
	{
		int sum = 0;

		for (Iterator<Integer> iter = list.iterator(); iter.hasNext();)
		{
			sum += iter.next();
		}

		return sum;
	}

	private static ArrayList<Integer> createList(int n)
	{
		long flee = Math.round(Math.sqrt(n)) + 1;

		ArrayList<Integer> fun = new ArrayList<Integer>();
		fun.add(1);

		for (int i = 2; i <= flee; i++)
		{
			if (n % i == 0)
			{
				fun.add(i);
				fun.add(n/i);
			}
		}

		return fun;
	}

	private static boolean isAmicable(int n)
	{
		ArrayList<Integer> NList = new ArrayList<Integer>(createList(n));

		yt = sumList(NList);

		ArrayList<Integer> MList = new ArrayList<Integer>(createList(yt));

		x = sumList(MList);

		if ((x == n) && (x != yt))
			return true;

		return false;
	}

	public static void main(String[] args)
	{

		int sum = 0;
		for (int i = 0; i < 10000; i++)
		{
			if (isAmicable(i))
			{
				sum += yt;
			}
		}
		System.out.println(sum);


	}
}
