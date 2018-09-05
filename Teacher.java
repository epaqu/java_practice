public class Teacher
{
	public Name name;
	public Date birthdate;
	private double salary;
	private String rank;
	private String dept;
	
	public Teacher()  // default constructor
	{
		
	}
	
	// #1
	public Teacher(double mySalary, String myRank, String myDept)
	{
	
	}


	
	public double getSalary()
	{
		return salary;
	}
	
	public String getRank()
	{
		return rank;
	}
	
	public String getDept()
	{
		return dept;
	}
	
	public void setSalary(double mySalary)
	{
		salary = mySalary;
	}
	
	public void setRank(String myRank)
	{
		rank = myRank;
	}
	
	public void setDept(String myDept)
	{
		dept = myDept;
	}
	
	// #2
	public void initFaculty(Teacher[] faculty)
	{
		
	}

	// #3
	public static double incSalary(Teacher teach)
	{
	  
	}
	
	// #4
	public static void incFaculty(Teacher[] fac)
	{
	  
	}

	// #5
	public static void printUnderpaid(Teacher[] faculty)
	{
	  	  
	}
	
	// #6
	public int getNumAssocProf(Teacher[] faculty)
	{
	 
	}	
	
	public String toString()
	{
		return (salary + " " + rank + " " + dept);
	}

	public static void main (String [] args)
    {

			
				
	}
	

}



