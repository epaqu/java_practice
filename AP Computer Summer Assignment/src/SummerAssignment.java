import java.util.*;
import java.io.*;
public class SummerAssignment
{
	public static void main (String args[]) throws IOException
	{
		TreeSet<Integer> series = new TreeSet<Integer>();
		Scanner in = new Scanner(new FileReader("numbers.txt"));
		Integer sum = 0;
		while (in.hasNext())
		{
			Integer next = Integer.parseInt(in.nextLine());
			sum = sum + next;
			series.add(next);
		}
		int first = series.first();
		int last = series.last();
		Integer total = (first + last) * (last - first + 1) / 2;
		Integer missing = total - sum;
		System.out.println("The missing number is " + missing);
	}
}