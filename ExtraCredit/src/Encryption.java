//importing Scanner.
import java.util.Scanner;

public class Encryption {
	public static void main (String [] args)
	{
		//Creating a scanner called in
		Scanner in = new Scanner(System.in);
		//Ask the user for an input & using scanner to read it.
		System.out.print("Enter the plaintext that needs to be encrypted: ");
		String input = in.nextLine();
		/*basic settings for encryption. I'll utilize these as indicators of
		 alphabetical orders. */
		String capital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String small = "abcdefghijklmnopqrstuvwxyz";
		//declaring the output. It initially has nothing.
		String output = "";
		//position will be used to store the index of a character.
		int position;
		//loop is needed to convert each character at a time.
		for (int i = 0; i < input.length(); i++)
		{
			//Case 1. if input is capital letter (but not X, Y or Z)
			if (input.charAt(i) >= 0x0041 && input.charAt(i)< 0x0058)
			{
				//get the index of a character.
				position = capital.indexOf(input.charAt(i));
				/*increase the index by 3; it will replace the given letter
				  with the letter that comes 3 letters after the given letter*/
				position += 3;
				//add the result to the output
				output += capital.charAt(position);
			}
			//Case 2. if the character is X, then the output should be A
			else if (input.charAt(i) == 0x0058)
				output += "A";
			//Case 3. if the character is Y, then the output should be B
			else if (input.charAt(i) == 0x0059)
				output += "B";
			//Case 4. if the character is Z, then the output should be C
			else if (input.charAt(i) == 0x005A)
				output += "C";
			//Case 5. if input is lower case from a to w
			else if (input.charAt(i) >= 0x0061 && input.charAt(i) < 0x0078)
			{
				//get the index of a character.
				position = small.indexOf(input.charAt(i));
				/*increase the index by 3; it will replace the given letter
				  with the letter that comes 3 letters after the given letter*/
				position += 3;
				//add the result to the output
				output += small.charAt(position);
			}
			//Case 6. if the character is x, then the output should be a
			else if (input.charAt(i) == 0x0078)
				output += "a";
			//Case 7. if the character is y, then the output should be b
			else if (input.charAt(i) == 0x0079)
				output += "b";
			//Case 8. if the character is z, then the output should be c
			else if (input.charAt(i) == 0x007A)
				output += "c";
			/*Case 9. if the character is non-alphabet (i.e.: space
			 * or punctuation) then return the original one.
			 */
			else
				output += input.charAt(i);
		}
		//Display the output.
		System.out.println("The cyphertext version is: " + output);
	}
}				