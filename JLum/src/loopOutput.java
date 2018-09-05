
public class loopOutput {
	public static void main (String[] args)
	{
		int i = 10, sum = 0;
		while (i <= 20)
		{
			sum = sum + i;
			i++;
		}
		System.out.println("The sum of the integers from 10 to 20 (inclusive) is " + sum);
	}
}
