
public class HW02 {

	public static int sum100(int k)
	{
		int sum = 0;
		for (int i = k; i<=100; i++)
			sum += i;
		return sum;
	}
	public static void main (String [] args)
	{
		System.out.println(sum100(1));
	}
}