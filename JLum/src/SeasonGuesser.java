import java.util.Scanner;

public class SeasonGuesser {
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the temperature as a whole number: ");
		int temp = in.nextInt();
		if (temp >= 90 && temp <= 110)
			System.out.println("It is probably summer.");
			else if (temp >= 70 && temp <90)
			System.out.println("It is probably spring.");
			else if (temp >= 50 && temp < 70)
			System.out.println("It is probably fall.");
			else if (temp < 50 && temp >= -5)
			System.out.println("It is probably winter.");
			else if (temp < -5 || temp > 110)
			System.out.println("The temperature entered is outisde the valid range.");
	}
}
