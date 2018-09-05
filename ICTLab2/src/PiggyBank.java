import java.util.Scanner; //import Scanner
class PiggyBank
{
	private int pennies; //declaring pennies as private integer
	private int nickels; //declaring nickels as private integer
	private int dimes; //declaring dimes as private integer
	private int quarters; //declaring quarters as private integer
	private double sum; //declaring sum as private double

	public PiggyBank (int changePennies, int changeNickels, int changeDimes, int changeQuarters)
	//making constructor PiggyBank
	{
		pennies = changePennies; //assigning pennies = changePennies
		nickels = changeNickels; //assigning nickels = changeNickels
		dimes = changeDimes; //assigning dimes = changeDimes
		quarters = changeQuarters; //assigning quarters = changeQuarters
		sum = pennies *.01 + nickels * .05 + dimes * .1 + quarters * .25;
		 //a equation for total sum
	}	
	public int getPennies()
	{
		return pennies; //returning the value of pennies
	}
	public int getNickels()
	{
		return nickels; //returning the value of nickels
	}
	public int getDimes()
	{
		return dimes; //returning the value of dimes
	}
	public int getQuarters()
	{
		return quarters; //returning the value of quarters
	}
	public double getSum()
	{
		return sum; //returning the value of sum
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in); //making a scanner called in
		System.out.print("You do not have any PiggyBank account yet. ");
		System.out.println("Would you like to create one? Type 1 if yes. Type 2 if no.");
		//Question. if the user inputs 1, then make an account. if 2, then end the program.
		int choice0 = in.nextInt();//reading the input
		int a = 0, b = 0, c = 0, d = 0; //assignment 0 to integers a, b, c, d.
		//a, b, c, d represent the numbers of pennies, nickels, dimes, and quarters
		if (choice0 ==1)
		//first condition. it decides whether to end the program or make an account.
		{
			System.out.println("Congratulations! You have created a PiggyBank account!");
			//message informing that the user created an account
		boolean exit = true; //assigning true to boolean exit.
		while (exit) //starting loop
		{
		System.out.println("What would you like to do? Type the number of your choice.");
		System.out.println("1. See the number of each coin.");
		System.out.println("2. See the total amount of money.");
		System.out.println("3. Put more coins in.");
		System.out.println("4. Take coins out.");
		//suggesting options
		int choice1 = in.nextInt();//reading the input
		if (choice1 == 1)
			//when the condition (choice1 ==1) is satisfied, the below code is executed.
		{
			PiggyBank account = new PiggyBank(a,b,c,d);
			//calling the values of pennies, nickels, dimes, and quarters.
			System.out.println("You have currently " + account.getPennies() + " pennies.");
			System.out.println("You have currently " + account.getNickels() + " nickels.");
			System.out.println("You have currently " + account.getDimes() + " dimes.");
			System.out.println("You have currently " + account.getQuarters() + " quarters.");
			//displaying the numbers of coins.
		}
		else if (choice1 == 2)
			//second case. when choice1 ==2, the code below is executed.
		{
			PiggyBank account = new PiggyBank(a,b,c,d);	
			//calling the values of pennies, nickels, dimes, and quarters.
			System.out.println("The total amount of money in your account is $" + account.getSum());
			//displaying the total amount of money
		}
		else if (choice1 == 3)
			//third case. when choice ==3, the code below is executed.
		{
			System.out.println("How many pennies do you intend to add?");
			//asking question
			int addPennies = in.nextInt();
			//getting the input(=the number of pennies added)
			System.out.println("How many nickels do you intend to add?");
			//asking question
			int addNickels = in.nextInt();
			//getting the input(=the number of nickels added)
			System.out.println("How many dimes do you intend to add?");
			//asking question
			int addDimes = in.nextInt();
			//getting the input(=the number of dimes added)
			System.out.println("How many quarters do you intened to add?");
			//asking question
			int addQuarters = in.nextInt();
			//getting the input(=the number of quarters added)
			a = a + addPennies;
			b = b + addNickels;
			c = c + addDimes;
			d = d + addQuarters; //refreshing the values of a,b,c,d
			PiggyBank account = new PiggyBank(a,b,c,d);
			//refreshing the numbers of pennies, nickels, dimes, & quarters
			System.out.println("Your account is updated.");
			System.out.println("You now have " + account.getPennies() + " pennies.");
			System.out.println("You now have " + account.getNickels() + " nickels.");
			System.out.println("You now have " + account.getDimes() + " dimes.");
			System.out.println("You now have " + account.getQuarters() + " quarters.");
			//displaying the result of adding coins
		}
		else if (choice1 == 4)
		{
			System.out.println("How many pennies do you intend to take out?"); //question
			int takePennies = in.nextInt(); //getting the input(=the # of pennies taken)
			System.out.println("How many nickels do you intend to take out?"); //question
			int takeNickels = in.nextInt(); //getting the input(=the # of nickels taken)
			System.out.println("How many dimes do you intend to take out?"); //question
			int takeDimes = in.nextInt(); //getting the input(=the # of dimes taken)
			System.out.println("How many quarters do you intened to take out?");//question
			int takeQuarters = in.nextInt(); //getting the input(=the # of quarters taken)
			a = a - takePennies;
			b = b - takeNickels;
			c = c - takeDimes;
			d = d - takeQuarters; //refreshing the values of a, b, c, d
			PiggyBank account = new PiggyBank(a,b,c,d);
			//refreshing the numbers of pennies, nickels, dimes, & quarters
			System.out.println("Your account is updated.");
			System.out.println("You now have " + account.getPennies() + " pennies.");
			System.out.println("You now have " + account.getNickels() + " nickels.");
			System.out.println("You now have " + account.getDimes() + " dimes.");
			System.out.println("You now have " + account.getQuarters() + " quarters.");
			//displaying the result of taking coins
		}
		System.out.println("Would you like to exit? If yes, type 1. Otherwise, type 2.");
		//ask if the user wants to quit
		int respond = in.nextInt(); //getting the answer
		if (respond == 1) //if this condition is satisfied,
			exit = false; //the program will end.
		else if (respond == 2) //if this condition is satisfied,
			exit = true; //the program will continue
		}
		}
		else if (choice0 == 2) //if the user refused to make an account,
			System.out.println("Good bye. Have a great day."); //then the program ends.
		
	}
}
