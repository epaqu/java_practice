
public class logicalExpressions {
	public static void main (String[] args)
	{
		double a = 2, b = 3;
		boolean c =	! ((a < b) && (a < (b + a)));
		System.out.println(c);
	}
}
