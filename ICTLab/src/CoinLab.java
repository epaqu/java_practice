import java.util.Scanner; //importing Scanner

public class CoinLab {
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in); //Preparing to use scanner named in.
		System.out.println("How much change should you return?"); //Asking for the amount of change
		int x = in.nextInt(); //The input value is declared as integer x.
		int Q = x/25; //get the maximum possible number of quarters (=int Q)
		int D = (x%25)/10; //get the maximum possible number of dimes (=int D);
		int N = ((x%25)%10)/5; //get the maximum possible number of nickels (=int N)
		int P = (((x%25)%10)%5)/1; //get the maxium possible number of pennies (=int P)
		System.out.println(x + " cent(s) =>"); //displaying the total amount of change
		System.out.println("   Quarter(s)" + "\t" + Q); //displaying the number of quarters
		System.out.println("   Dime(s)" + "\t" + D); //displaying the number of dimes
		System.out.println("   Nickel(s)" + "\t" + N); //displaying the number of nickels
		System.out.println("   Penny(s)" + "\t" + P); //displaying the number of pennies
	}
}
/*
   94 cent(s) =>
   Quarter(s)	3
   Dime(s)		1
   Nickel(s)	1
   Penny(s)		4
   
   59 cent(s) =>
   Quarter(s)	2
   Dime(s)		0
   Nickel(s)	1
   Penny(s)		4
   
   19 cent(s) =>
   Quarter(s)	0
   Dime(s)		1
   Nickel(s)	1
   Penny(s)		4
 */