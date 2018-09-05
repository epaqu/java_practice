import java.util.Scanner;
public class Practice
{
	public static void insertionSort (int[] numbers)
	{
		for (int index = 1; index < numbers.length; index++)
		{
			int key = numbers[index];
			int position = index;
			while (position > 0 && numbers[position-1] > key)
			{
					numbers[position] = numbers[position-1];
					position--;
			}
			numbers[position] = key;
		}		
	}
	public static void main (String[] args)
	{
		int pennies = 0, nickels = 0, dimes = 0, quarters = 0;
		Scanner in = new Scanner(System.in);
		boolean exit = true;
		System.out.print("You do not have any PiggyBank account yet. ");
		System.out.println("Would you like to create one? Type 1 if yes. Type 2 if no.");
		int choice0 = in.nextInt();
		if (choice0 ==1)
		{
			System.out.println("Congratulations! You have created a PiggyBank account!");
		while (exit)
		{
		System.out.println("What would you like to do? Type the number of your choice.");
		System.out.println("1. See the number of each coin.");
		System.out.println("2. See the total amount of money");
		System.out.println("3. Put more coins.");
		System.out.println("4. Take coins.");
		int choice1 = in.nextInt();
		if (choice1 == 1)
		{
		System.out.print("You currently have " + pennies + " pennie(s), " + nickels);
		System.out.print(" nickel(s), " + dimes + " dime(s), and " + quarters);
		System.out.println(" quarter(s).");
		}
		else if (choice1 == 2)
		{
			double sum = pennies *.01 + nickels * .05 + dimes * .1 + quarters * .25;
			System.out.println("The total amount of money in your account is $" + sum);
			System.out.println("How many");
		}
		else if (choice1 == 3)
		{
			System.out.println("How many pennies do you intend to add?");
			int addPennies = in.nextInt();
			System.out.println("How many nickels do you intend to add?");
			int addNickels = in.nextInt();
			System.out.println("How many dimes do you intend to add?");
			int addDimes = in.nextInt();
			System.out.println("How many quarters do you intened to add?");
			int addQuarters = in.nextInt();
			pennies = pennies + addPennies;
			nickels = nickels + addNickels;
			dimes = dimes + addDimes;
			quarters = quarters + addQuarters;
			System.out.println("Your account is updated.");
		}
		else if (choice1 == 4)
		{
			System.out.println("How many pennies do you intend to take out?");
			int takePennies = in.nextInt();
			System.out.println("How many nickels do you intend to take out?");
			int takeNickels = in.nextInt();
			System.out.println("How many dimes do you intend to take out?");
			int takeDimes = in.nextInt();
			System.out.println("How many quarters do you intened to take out?");
			int takeQuarters = in.nextInt();
			pennies = pennies - takePennies;
			nickels = nickels - takeNickels;
			dimes = dimes - takeDimes;
			quarters = quarters - takeQuarters;
			System.out.println("Your account is updated.");
		}
		System.out.println("Would you like to exit? If yes, type 1. Otherwise, type 2.");
		int respond = in.nextInt();
		if (respond == 1)
			exit = false;
		else if (respond == 2)
			exit = true;
		}
		}
		else if (choice0 == 2)
			System.out.println("Good bye. Have a great day.");
	}
}