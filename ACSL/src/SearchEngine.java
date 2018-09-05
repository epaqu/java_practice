import java.util.Scanner;
import java.util.ArrayList;
public class SearchEngine
{
	public static void main (String[] args)
	{
		int index;
		ArrayList<String> result = new ArrayList<String>();
		String[] list = new String[10];
		Scanner in = new Scanner (System.in);
		System.out.print("Enter the 10 Strings that will comprise the search data:");
		for (int i = 0; i < 10; i++)
		{
			String x = in.nextLine();
			list[i] = x;
		}
		for (int i = 0; i < 5; i++)
		{			
			System.out.print("Search: ");
			String y = in.nextLine();
			if (y.indexOf("?") != -1)
			{
				if (y.indexOf("[") == -1 && y.indexOf("]") == -1)
				{
					if (y.indexOf("*") == -1)
					{
						index = y.indexOf("?");
						for (int j = 0; j < 10; j ++)
						{
							if (list[j].substring(0, index).equals(y.substring(0, index)) && list[j].substring(index+1).equals(y.substring(index+1)))
								result.add(list[j]);
						}
						for (int k = 0; k < result.size(); k++)
						{
							System.out.print(result.get(k));
							result.remove(k);
						}
					}
					else
					{
						
					}
				}
				else
				{
					if (y.indexOf("*") == -1)
					{
						
					}
				}
			}
		}
		
	}
}
