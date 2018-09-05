
public class BPJ2 {

	public static void main (String[] args)
	{
		// Lesson 03
		String S = "Lucky hockey puck";
		String m = "uck";
		int j = 6, z = 99;
		int k = S.indexOf(z+2, 4);
		System.out.println(m.length() + k+j);
		System.out.println(k);
		// Lesson 17
		String xyz = "bathtub";
		String ddd = "BathTUB";
		String ccc = xyz;
		String wc = "Whooping crane";
		String s = "	\t\tGu daay, mates \n";
		System.out.println(ddd.compareTo(ccc));
		System.out.println(xyz.compareTo(ccc));
		System.out.println("Stupid".compareTo(ccc));
		System.out.println(wc + s);
		//
		String ppp = "abcccc";
		System.out.println(ppp.substring(1, 3).equals("bc"));
		System.out.println(ppp.indexOf("c", 100));
		System.out.println(ppp.compareTo("A"));
	}
}
