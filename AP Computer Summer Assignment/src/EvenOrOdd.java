import java.util.Scanner;
public class EvenOrOdd {
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int input = in.nextInt();
		if (input%2 == 0)
			System.out.println("The integer " + input + " is even.");
		else
			System.out.println("The integer " + input + " is odd.");
	}
}
