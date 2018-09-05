//importing Scanner
import java.util.Scanner;
//importing necessary utilities for fixing decimal points
import java.text.*;
public class IRS {
	public static void main (String [] args)
	{
		//creating a new scanner called "read"
		Scanner read = new Scanner (System.in);
		//the amount of tax is declared as double
		double tax;
		//setting up the proper decimal format for final tax report
		DecimalFormat dollar = new DecimalFormat("$0.00");
		//asking for marital state
		System.out.println("If single, type 1; if married, type 2.");
		//accepting the response
		int decision1 = read.nextInt();
		
		//if the response was 1, then it means the user is not married yet.
		if (decision1 == 1)
		{
			//asking for the amount of taxable income
			System.out.print("Enter the amount of your taxable income: $");
			//recording the amount of taxable income
			int income = read.nextInt();
			//Case 1: if the user's income exceeds $297,350
			if (income > 297350)
			{
				tax = 93374.00 + .391 * (income - 297350);
			}
			//Case 2: if the user's income does not exceed $297,350 but exceeds $136,750
			else if (income > 136750)
			{
				tax = 36361.00 + .355 * (income - 136750);
			}
			//Case 3: if the user's income does not exceed $136,750 but exceeds $65,550
			else if (income > 65550)
			{
				tax = 14645.00 + .305 * (income - 65550);
			}
			//Case 4: if the user's income does not exceed $65,550 but exceeds $27,050
			else if (income > 27050)
			{
				tax = 4057.50 + .275 * (income - 27050);				
			}
			//Case 5: if the user's income does not exceed $27,050
			else
			{
				tax = .15 * income;				
			}
			//Report the result
			System.out.println("Schedule X - Single");
			System.out.println("Your taxable income is $" + income);
			//fixing the decimal point of the amount of tax
			String taxFinal = dollar.format(tax);
			System.out.println("Your federal tax is " + taxFinal);
		}
		//if the response was 2, then it means the user is married.
		else if (decision1 == 2)
		{
			//asking for the amount of taxable income
			System.out.print("Enter the amount of your taxable income: $");
			//recording the amount of taxable income
			int income = read.nextInt();
			//Case 1: if the user's income exceeds $297,350
			if (income > 297350)
			{
				tax = 88306.00 + .391 * (income - 297350);
			}
			//Case 2: if the user's income does not exceed $297,350 but exceeds $166,500
			else if (income > 166500)
			{
				tax = 41855.00 + .355 * (income - 166500);
			}
			//Case 3: if the user's income does not exceed $166,500 but exceeds $109,250
			else if (income > 109250)
			{
				tax = 24393.75 + .305 * (income - 109250);
			}
			//Case 3: if the user's income does not exceed $109,250 but exceeds $45,200
			else if (income > 45200)
			{
				tax = 6780.00 + .275 * (income - 45200);				
			}
			//Case 3: if the user's income does not exceed $45,200 
			else
			{
				tax = .15 * income;				
			}
			//Report the result
			System.out.println("Schedule Y-1 Married Filing Jointly");
			System.out.println("Your taxable income is $" + income);
			//fixing the decimal point of the amount of tax
			String taxFinal = dollar.format(tax);
			System.out.println("Your federal tax is " + taxFinal);
		}
		//if the user typed other than 1 or 2, then display an error message.
		else
		{
			System.out.println("Erro: You typed a wrong number.");
		}
	}
}
