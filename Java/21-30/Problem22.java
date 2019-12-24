import java.io.*;
import java.util.*;

public class Problem22
{
	private static ArrayList<String> Mylist = new ArrayList<String>();
	private static String readFile(String filename)throws IOException
	{
		File f = new File(filename);
		BufferedReader br;
		String list = "";

			StringBuffer contents = new StringBuffer();
			String text = null;
			br = new BufferedReader(new FileReader(f));
			while ((text = br.readLine()) != null)
			{
				contents.append(text).append(System.getProperty("line.separator"));
			}
			list = contents.toString();


		return list;
	}
	private static void nudge(String s)
	{
		String rand = "";
		boolean bool = false;
		int i = 0;
		while (i < s.length())
		{
			if (s.charAt(i) == '\"')
			{bool = !bool;
				i++;
			}
			if (bool)
			{rand += s.charAt(i);
			}
			else
			{
				if (rand == "")
				{break;
				}
				else
				{
					Mylist.add(rand);
					rand = "";
				}
			}
			i++;
		}
		Collections.sort(Mylist);
	}
	private static long calcValue()
	{
		long Total = 0;
		int i = 1;
		Iterator<String> itr = Mylist.iterator();
		while(itr.hasNext())
		{
			String rand2 = itr.next().toString();
			int sum = 0;

			for (int j = 0; j < rand2.length(); j++)
			{
				sum+=((int)rand2.charAt(j)-64);
			}
			sum *= (i);
			Total += sum;
			i++;
		}

		return Total;
	}

	public static void main(String[] args)throws IOException
	{

		nudge(readFile("p022_names.txt"));
		System.out.println(calcValue());
	}
}
