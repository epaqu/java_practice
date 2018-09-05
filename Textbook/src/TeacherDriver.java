
public class TeacherDriver
{
	public TeacherDriver()
	{
	}
	
	public void incFaculty(Teacher[] fac)
	{
		for (int i = 0; i < fac.length; i++)
			fac[i].setSalary(fac[i].getSalary() + fac[i].incSalary());
	}
	
	public void printUnderpaid(Teacher[] fac)
	{
		for (Teacher t : fac)
			if (t.getSalary() < 40000)
				System.out.println(t.getName() + " makes no money.");
	}
	
	public int getNumAP(Teacher[] fac)
	{
		int count = 0;
		for (Teacher t : fac)
			if(t.getRank().equals("Associate Professor"));
				count++;
		return count;
	}

	public static void main (String [] args)
	{
		TeacherDriver td = new TeacherDriver();
		
		Name n1 = new Name ("Joe", "D", "");
		Date d1 = new Date (3, 23, 1992);
		Teacher teach1 = new Teacher(n1, d1, 42000.0, "Assistant Professor", "Musics");
		Teacher[] faculty = new Teacher[2];
		faculty[0] = new Teacher();
		faculty[1] = teach1;
		
		
		//System.out.println();
		//System.out.println("Increase " + faculty[0].name + "'s salary: " + faculty[0].incSalary());
		//faculty[0].setSalary(faculty[1].getSalary() + faculty[0].incSalary());
		//td.incFaulty(faculty);

		td.printUnderpaid(faculty);		
		
		//prints most current array values
	
		System.out.println("Number of associate professors: " + td.getNumAP(faculty));
		System.out.println();
		for (Teacher t : faculty)
			System.out.println(t + "\n");
	}
}
