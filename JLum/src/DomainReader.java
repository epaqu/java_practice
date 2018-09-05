import java.util.Scanner;
public class DomainReader {
	public static void main (String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the domain of the website: ");
		String domain = in.nextLine();
		System.out.println("www." + domain + ".com"); //concatenation
		System.out.println("Enter the number of the website: ");
		Double number = in.nextDouble();
		System.out.println(number + " cubed is " + Math.pow(number, 3));
	}
}
