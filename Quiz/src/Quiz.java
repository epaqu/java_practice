
public class Quiz {
	public Quiz()
	{
		
	}
	public String result(Teacher[] fac, int Number)
	{
		Name x = fac[0].getName();
		Double y = 0.0;
		String[] k = new String[5];
		for (int i = 0; i < fac.length; i++)
		{
			x = fac[i].getName();
			y = fac[i].getSalary();
			k[i] = x + "'s salary is: $ " + y;
			
		}
		return k[Number];
	}
	public double average(Teacher[] fac)
	{
		Double average = 0.0;
		for (int i=0; i < fac.length; i++)
		{
			average += fac[i].getSalary();
		}
		average /= fac.length;
		return average;
	}
	public String searcher(Teacher[] fac, Name nm)
	{
		String result = "Not found";
		for (int i = 0; i < fac.length; i++)
		{
			if (fac[i].getName().equals(nm))
				{
				result = "Name: " + fac[i].getName();
				result += "\nDepartment: " + fac[i].getDept() + "\nRank: " + fac[i].getRank();
				}
		}
		return result;
	}
	public static void main (String[] args)
	{
		Quiz q = new Quiz();
		Teacher[] faculty = new Teacher[5];
		Teacher defaultTeacher = new Teacher();
		faculty[0] = defaultTeacher;
		Name n1 = new Name ("Francis", "O", "Dwight");
		Date d1 = new Date (4, 23, 1992);
		Name n2 = new Name ("Bill", "D", "Eisenhower");
		Date d2 = new Date (3, 23, 1981);
		Name n3 = new Name ("Peter", "S", "Copper");
		Date d3 = new Date (10, 31, 1970);
		Name n4 = new Name ("Edward", "T", "McDonald");
		Date d4 = new Date (1, 1, 1956);
		Teacher a = new Teacher(n1, d1, 45000.00, "Chairman", "Art and Science Department");
		Teacher b = new Teacher(n2, d2, 35000.00, "Vice-chairman", "Mathematics Department");
		Teacher c = new Teacher(n3, d3, 25000.00, "Professor", "Literature Department");
		Teacher d = new Teacher(n4, d4, 80000.00, "Dean & Chairman", "Physics Department");
		faculty[1] = a;
		faculty[2] = b;
		faculty[3] = c;
		faculty[4] = d;
		System.out.println("The average salary of all teachers is " + q.average(faculty));
		System.out.println();
		System.out.println(q.result(faculty, 0));
		System.out.println(q.result(faculty, 1));
		System.out.println(q.result(faculty, 2));
		System.out.println(q.result(faculty, 3));
		System.out.println(q.result(faculty, 4));
		System.out.println();
		System.out.println(q.searcher(faculty, n4));
	}
}
