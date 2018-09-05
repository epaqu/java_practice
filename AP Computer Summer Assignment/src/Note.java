import java.util.Scanner;

public class Note {
	public static void main (String [] args)
	{
		//Backslash Usages//
		String a = "1", b = "2";
		Integer c = 3, d = 4;
		System.out.println("/ * " + "\\" + " * / " + "/ * " + "\\");
		System.out.println(a + b + c + d);
		System.out.println(c + d + a + b);

		//Switch statement//
		int x = 3;
		switch (x) {
		case 1:
			System.out.println("x is 1");
			break;
		case 2:
			System.out.println("x is 2");
			break;
		case 3:
			boolean z = true;
			System.out.println("x is not 1 or 2");
			z = !z;
			System.out.println(z);
		}
		
		//For Statement
		int i;
		for (i = 20; i < 30; i +=1)
			System.out.println(i);
		
		//while statement
		while (i < 60)
			{System.out.println(i);
			i++;}
		
/*
 * Name:  Hello
 * Index: 01234
 * String s = new.String("abc");
 * int length()
 * String substring(int from, int to)
 * String substring(int from)
 * int indexOf(String str)
 * Escape ~~~~?
 *
 *<Length> 
 * int.length(); this instance method returns the length of the string.
 * char charAt(int index) this instance method returns the character at the given index.
 * 			- Not on AP
 * 			- String s = "abcde";
 * 			- s.length(); --> 5
 * 			- s.charAt(0); --> 'a'
 * 			- s.charAt(1); --> 'b'
 * 			- s.charAt(4); --> 'e'
 * 			- s.charAt(5); --> error
 *
 *<indexOf>
 *int indexOf(char c)
 *int indexOf(char c, int index) - Not on AP
 *					method overloading : using same name but dif parameter
 *
 *int index(String s2)
 *String s = "datacabc";
 *String s2 = "ab";
 *
 *<substring>
 *String substring(int startIndex)
 *String substring(int startIndex, int lastIndex)
 *Returns the substring of the current object starting from startIndex
 *	and ending with lastIndex(or the last index of the string if lastIndex is not given)
 *String s = "abcdef"
 *s.substring(1) --> bcdef
 *s.substring(3) -->def
 *
 *
 *<backslash statements>
 *\\
 *\"
 *\n
 *
 *<Math>
 *double i = Math.pow(2,3);
 *System.out.println(i); will show 8
 */
		int [][] twoDimArray = new int [2][3];
		for (int l = 0; l < 2; l++)
		{
			twoDimArray[l][1] = 3;
			System.out.println(twoDimArray[l][1]);
		}
	}
}
