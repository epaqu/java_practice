
public class Student {
	
	private String Name;
	private String SSN;
	private char GPA;
	
	public Student(String fullName, char grade, String social_security)
	{
		Name = fullName;
		GPA = grade;
		SSN = social_security;
	}
	
	public double getGPA()
	{
		return GPA;
	}
	
	public String getName()
	{
		return Name;
	}
	
	public String getSSN()
	{
		return SSN;
	}
	
	public void setGPA(char x)
	{
		GPA = x;
	}

	public void setName(String s)
	{
		Name = s;
	}
	
	public void setSSN (String k)
	{
		SSN = k;
	}
	
	public String toString(double A)
	{
		String newA = toString(A);
		return newA;
	}
	
	public boolean equals(boolean T)
	{
		boolean newT = T;
		return newT;
	}
	
	public static void main (String [] args)
	{
		Student ST = new Student("Jaewoo An ", 'B', " 000-0000-000");
		System.out.println(ST.getName() + ST.getGPA() + ST.getSSN());
		System.out.println("Oops, there was a change in his information");
		ST.setName("Jaewoo Ahn ");
		ST.setGPA('A');
		ST.setSSN(" 111-1111-111");
		System.out.println(ST.getName() + ST.getGPA() + ST.getSSN());
		
	}
}
