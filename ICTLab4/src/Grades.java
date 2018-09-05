//Calling Scanner;
import java.util.Scanner;

public class Grades {
	public static void main (String [] args)
	{
		//result = sum of all grades. Since GPA is double, result should be double.
		double result = 0;
		//count = number of classes. It has to be an integer.
		int count = 0;
		//check is to see if the student has any F grade.
		boolean check = false;
		//creating a new scanner called in.
		Scanner in = new Scanner(System.in);
		//a random boolean value called condition. It's for the loop.
		boolean condition = true;
		/*as long as condition is true, this will not end.
		 * It enables the user to input as many as he or she wants
		 * without telling the number of classes prior to this.
		 */
		while (condition == true)
		{
			//Asking the user for grade. Scanner then reads the value.
			System.out.print("Enter one of your grades in Upper case: ");
			String input = in.nextLine();
			//Case 1. If grade A, then increment count and add 4.0 to total.
			if (input.equals("A"))
			{
				count += 1;
				result += 4.0;
			}
			//Case 2. If grade B, then increment count and add 3.0 to total.
			else if (input.equals("B"))
			{
				count += 1;
				result += 3.0;
			}
			//Case 3. If grade C, then increment count and add 2.0 to total.
			else if (input.equals("C"))
			{
				count += 1;
				result += 2.0;
			}
			//Case 4. If grade D, then increment count and add 1.0 to total.
			else if (input.equals("D"))
			{
				count += 1;
				result += 1.0;
			}
			//Case 4. If grade F, then just increment count.
			else if (input.equals("F"))
			{
				count += 1;
				check = true;
			}
			/*Case 5. if anything other than acceptable grades are entered,
			 * then break out of the loop by making the condition false.
			 */
			else
				condition = false;
		}
		//get average
		double average = result / count;
		//display GPA and number of classes.
		System.out.println("GPA: " + average + "\nNumber of Classes: " + count);
		//if the number of classes < 4, then ineligible regardless of GPA.
		if (count < 4)
			System.out.println("Ineligible, taking less than 4 classes");
		//if the number of classes >= 4, then divide into 4 cases.
		else
			//Case A. average < 2.0 and has F grade.
			if (average < 2.0 && check == true)
				System.out.println("Ineligible, gpa below 2.0 and has F grade");
			//Case B. no F grade, but average < 2.0
			else if (average < 2.0)
				System.out.println("Ineligible, gpa below 2.0");
			//Case C. average > 2.0, but has F grade.
			else if (check == true)
				System.out.println("Ineligible, gpa above 2.0 but has F grade");
			//Case D. average >= 2.0 and no F grade. Eligible.
			else
				System.out.println("Eligible");
	}
}
