//import Scanner
import java.util.Scanner;

public class p383q1 {
	public static void main (String[] args)
	{
		//create a scanner called in
		Scanner in = new Scanner(System.in);
		//ask the user for the total number of numbers
		System.out.print("How many numbers do you have? ");
		//receives the value
		int number = in.nextInt();
		//declares an array of integers with the size of [number] that the user entered.
		int[] listNums = new int [number];
		//use loop to collect the numbers
		for (int i = 0; i < number; i++)
		{
			System.out.print("Enter a number between 0 and 50 inclusive: ");
			int input = in.nextInt();
			//if the number is out of the range 0-50 inclusive,
			if (input < 0 || input > 50)
			{
				//then display error message
				System.out.println("Error: The number you entered is not between 0 and 50.");
				//decrease i so that the user can re-enter the value.
				i--;
			}
			//otherwise, save the value into the array
			else
				listNums[i] = input;
		}

		//use for loop to see what and how many integers between 0 to 50 inclusive are repeated.
		for (int i = 1; i <= 50; i++)
		{
			//declare count;
			int count = 0;
			for (int j = 0; j < number; j++)
			{
				//if the element equals to a certain number, increase count by 1.
				if (listNums[j] == i)
					count++;
			}
			if (count != 0)
				System.out.println("There are " + count + " " + i +"'s.");
		}
	}
}
